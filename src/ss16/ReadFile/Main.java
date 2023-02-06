package ss16.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_PATH = "D:\\Trinh\\CodeGym\\module2\\src\\ss16\\ReadFile\\file.csv";

    public static List<String> readFile(String path){
        List<String> list = new ArrayList<>();
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;
        try {
            file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<Country> countryFile(String path){
        List<String> strings = readFile(path);
        List<Country> countries = new ArrayList<>();
        String[] item;
        for (String line: strings) {
            item = line.split(",");
            countries.add(new Country(Integer.parseInt(item[0]),item[1],item[2]));
        }
        return countries;
    }

    public static void main(String[] args) {
        String path = FILE_PATH;
        for (Country coutry: countryFile(path)) {
            System.out.println(coutry);
        }
    }
}
