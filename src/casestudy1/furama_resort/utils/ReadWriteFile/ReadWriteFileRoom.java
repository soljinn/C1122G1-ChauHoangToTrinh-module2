package casestudy1.furama_resort.utils.ReadWriteFile;

import casestudy1.furama_resort.models.RoomModel;
import casestudy1.furama_resort.models.VillaModel;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteFileRoom {
    public static Map<RoomModel, Integer> readFileRoom(String path){
        Map<RoomModel, Integer> roomModelIntegerMap = new LinkedHashMap<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()){
            try {
                FileReader fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                String[] item;
                while ((line = bufferedReader.readLine()) != null){
                    item = line.split(",");
                    String facitilyID = item[0];
                    String name = item[1];
                    Double area = Double.parseDouble(item[2]);
                    Double price = Double.parseDouble(item[3]);
                    int amount = Integer.parseInt(item[4]);
                    String rentalType = item[5];
                    String freeService = item[6];
                    RoomModel room = new RoomModel(facitilyID,name,area,price,amount,rentalType,freeService);
                    roomModelIntegerMap.put(room,0);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return roomModelIntegerMap;
    }
    public static void writeFileRoom(String path, Map<RoomModel, Integer> roomModelIntegerMap){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<RoomModel, Integer> entry: roomModelIntegerMap.entrySet()){
                bufferedWriter.write(entry.getKey().convertLine()+","+entry.getValue());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
