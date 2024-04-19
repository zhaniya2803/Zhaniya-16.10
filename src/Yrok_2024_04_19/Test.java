package Yrok_2024_04_19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test {
    public static void main(String[] args) throws IOException {
//        File file = new File("resources");
//        System.out.println(file.exists());
//        System.out.println(file.getName());
//        System.out.println();
//
//        File path = new File("src");
//        File [] files = path.listFiles();
//        for (File f : files) {
//            if (f.isFile()) {
//                System.out.println("File "+f.getName());
//            }
//            System.out.println("Derictory " + f.getName());
//        }

//        String str = System.getProperty("user.home");
//        System.out.println(str);

//        System.out.println(System.getProperty(File.separator));


//        File path = new File("resources/sub-directory/test.txt");
//        System.out.println(path.createNewFile());

       Path path = Path.of("resources1");
        if(!Files.exists(path)){
            Files.createDirectory(path);
        }

        for (int i = 0; i < 5; i++) {
            Path path1 = path.resolve("report"+(i+1)+".txt");
            Files.createFile(path1);
        }




    }
}
