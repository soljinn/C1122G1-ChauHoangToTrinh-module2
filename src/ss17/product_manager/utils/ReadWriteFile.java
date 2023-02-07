package ss17.product_manager.utils;

import ss17.product_manager.model.ProductManage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    static boolean flag = false;

    public static List<ProductManage> readFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<ProductManage> productManageList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = null;
            if (flag) {
                objectInputStream = new ObjectInputStream(fileInputStream);
                productManageList = (List<ProductManage>) objectInputStream.readObject();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            flag = true;
        }
        return productManageList;
    }

    public static void writeProductFile(String path, List<ProductManage> productManageList) {
        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream object = new ObjectOutputStream(file);
            object.writeObject(productManageList);
            object.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


