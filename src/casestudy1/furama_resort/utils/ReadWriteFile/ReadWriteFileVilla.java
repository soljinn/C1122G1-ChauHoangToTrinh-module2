package casestudy1.furama_resort.utils.ReadWriteFile;

import casestudy1.furama_resort.models.VillaModel;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteFileVilla {
    public static Map<VillaModel, Integer> readFileVilla(String path) {
        Map<VillaModel, Integer> villaModelIntegerMap = new LinkedHashMap<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if (file.exists()) {
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
                    String rental = item[5];
                    String room = item[6];
                    Double poolArea =Double.parseDouble(item[7]);
                    int numberOfFloors = Integer.parseInt(item[8]);
                    VillaModel villa = new VillaModel(facitilyID,name,area,price,amount,rental,room,poolArea,numberOfFloors);
                    villaModelIntegerMap.put(villa,0);
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
        return villaModelIntegerMap;
    }
    public static void writeFileVilla(String path, Map<VillaModel, Integer> villaModelIntegerMap ){
        File file = new File(path);
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<VillaModel, Integer> entry: villaModelIntegerMap.entrySet()) {
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
