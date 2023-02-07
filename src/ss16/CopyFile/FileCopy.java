package ss16.CopyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {

    public static final String FILE_PATH1 = "D:\\Trinh\\CodeGym\\module2\\src\\ss16\\CopyFile\\SourceFile.csv";
    public static final String FILE_PATH2 = "D:\\Trinh\\CodeGym\\module2\\src\\ss16\\CopyFile\\TargetFile.csv";

    public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        String line;
        int sum =0;
        BufferedReader bufferedReader = null;
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                sum += line.length();
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("The number of characters in the file is: " + sum);
        return stringList;
    }

    public static void writeFile(String path, List<String> list){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String item: list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourcePath = FILE_PATH1;
        String targetPath = FILE_PATH2;
        FileCopy.writeFile(targetPath, FileCopy.readFile(sourcePath));
    }
}
