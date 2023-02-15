package casestudy1.furama_resort.utils.ReadWriteFile;

import casestudy1.furama_resort.models.BookingModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ReadWriteFileBooking {
    private static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        String line;
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
    public static TreeSet<BookingModel> readFileBooking(String path){
        List<String> stringList = readFile(path);
        TreeSet<BookingModel> bookingModelTreeSet = new TreeSet<>();
        String[] item;
        for (String line: stringList) {
            item = line.split(",");
            if (item.length == 6){
                bookingModelTreeSet.add(new BookingModel(item[0],item[1],item[2],Integer.parseInt(item[3]),Integer.parseInt(item[4]),item[5]));
            }
        }
        return bookingModelTreeSet;
    }
    private static void writeFile(String path, String data){
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFileBooking(String path, TreeSet<BookingModel> bookingModelTreeSet){
        StringBuilder data = new StringBuilder();
        for (BookingModel booking: bookingModelTreeSet) {
            data.append(booking);
        }
        writeFile(path, data.toString());
    }
}
