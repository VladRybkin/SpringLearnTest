package ua.training.service.impl;



import ua.training.model.entity.User;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class IOService {

    private static final File file = new File("C:\\Users\\Vlad\\IdeaProjects\\ASPRINGGG!!\\SpringLearnTest\\src\\main\\resources\\local.properties");
    private static final File exportFile = new File("C:\\Users\\Vlad\\IdeaProjects\\ASPRINGGG!!\\SpringLearnTest\\src\\main\\resources\\export"
            + "\\export.txt");


    public void fileInput() {
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


    public void fileOutput(List<? extends Object> jsonObects) {

        try (FileWriter writer = new FileWriter(exportFile)) {

            writer.write(jsonObects.toString());
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}