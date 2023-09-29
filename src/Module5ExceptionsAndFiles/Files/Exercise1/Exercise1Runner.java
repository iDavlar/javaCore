package Module5ExceptionsAndFiles.Files.Exercise1;

import java.io.File;
import java.util.Arrays;

public class Exercise1Runner {
    public static void main(String[] args) {
        File dir = new File("C:\\JPr\\javaCore\\src\\Module5ExceptionsAndFiles");
        showFiles(dir, 0);
    }

    public static void showFiles(File file, int level) {
        printTabs(level++);
        System.out.println(file.getName());
        if (file.isDirectory()) {
            for (File innerFile : file.listFiles()) {
                showFiles(innerFile, level);
            }
        }
    }

    public static void printTabs(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("\t");
        }
    }
}
