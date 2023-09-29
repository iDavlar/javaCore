package Module5ExceptionsAndFiles.Files.Exercise3;


import java.io.*;
import java.util.*;

public class Exercise3Runner {
    public static void main(String[] args) {
        File file = createFile("dir1/dir2/dir3");

        createFilesInDir(file);
        System.out.println(Arrays.toString(file.listFiles()));

        createAllDataFile(file);
        System.out.println(Arrays.toString(file.listFiles()));

        createGlossary(file);
        System.out.println(Arrays.toString(file.listFiles()));
    }

    private static void createGlossary(File file) {
        File glossaryFile = createFile(file, "Glossary.txt");
        try (FileWriter fw = new FileWriter(glossaryFile, false)) {
            for (File curFile : file.listFiles()) {
                fw.write(curFile.getName() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createAllDataFile(File file) {
        File[] fileList = file.listFiles();
        File allDataFile = createFile(file, "AllData.txt");
        StringBuilder sb = new StringBuilder();

        for (File curFile : fileList) {
            if (curFile.getName().equals(allDataFile.getName())) {
                continue;
            }
            sb.append(curFile.getName()).append(":\n");
            try (FileReader fw = new FileReader(curFile);
                 Scanner sc = new Scanner(fw)) {
                while (sc.hasNextLine()) {
                    sb.append("\t").append(sc.nextLine()).append("\n");
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (FileWriter fw = new FileWriter(allDataFile, false)) {
            fw.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static File createFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File createFile(String path, String fileName) {
        File file = new File(path, fileName);
        if (!file.exists()) {
            try {
                file.mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return file;
    }

    private static File createFile(File path, String fileName) {
        File file = new File(path, fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return file;
    }

    private static void createFilesInDir(File file) {
        Random random = new Random();
        for (int i = 1; i < 6; i++) {
            File newFile = createFile(file, "text_" + i + ".txt");

            try (FileWriter fw = new FileWriter(newFile, false)) {
                for (int j = 0; j < 10; j++) {
                    fw.write(Integer.toString(random.nextInt(100)) + "\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
