package FilesHWGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

    public void createSportFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
            System.out.println("New file " + fileName + " was created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeInFile(String fileName, String text) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }

    }

    public void readFromFile(String fileName) {
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            for (int i = 0; scanner.hasNextLine(); i++) {
                String row = scanner.nextLine();
                //  System.out.println(i);
                System.out.println("Text into the file: " + row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}

