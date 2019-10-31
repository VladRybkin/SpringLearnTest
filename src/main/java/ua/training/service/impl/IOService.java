package ua.training.service.impl;



import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class IOService {
    private static final File file = new File("C:\\Users\\Vlad\\IdeaProjects\\ASPRINGGG!!\\SpringLearnTest\\src\\main\\resources\\local.properties");



   public   void fileInput() {
        int b;
        try {
            FileReader is = new FileReader(file);
            while ((b = is.read()) != -1) {
                System.out.print((char) b);

            }
            is.close();
        } catch (IOException e) {
            System.err.println("ошибка файла: " + e);
        }

    }

}
