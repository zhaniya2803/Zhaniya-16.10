package Yrok_2024_04_19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practice {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while_loop:
//        while (true) {
//            printMenu();
//            String command = scanner.nextLine();
//
//            System.out.println("Введите путь к файлу/директории: ");
//            String enteredPath = scanner.nextLine();
//            Path path = Path.of(enteredPath);
//
//            // Выполните действия в зависимости от введённой команды.
//            switch (command) {
//                case "exit":
//                    System.out.println("Выход.");
//                    break while_loop;
//                case "ls":
//                    try {
//                        File file = path.toFile();
//                    }
//                    catch (IOException e) {
//                        System.out.println("Произошла ошибка при запросе содержимого директории.");
//                        e.printStackTrace();
//                    }
//                    break;
//
//                case "mkdir":
//                    try {
//                        Files.createDirectory(path);
//                    }
//                    catch (IOException e) {
//                        System.out.println("Произошла ошибка при создании директории.");
//                        e.printStackTrace();
//                    }
//                    break;
//                case "touch":
//                    try {
//                        Files.createFile(path);
//                    }
//                    catch (IOException e) {
//                        System.out.println("Произошла ошибка при создании файла.");
//                        e.printStackTrace();
//                    }
//                    break;
//                case "rename":
//                    System.out.println("Введите новое имя файла/директории: ");
//                    String newName = scanner.nextLine();
//
//                    try {
//                        // переименуйте файл
//                    }
//                    catch (IOException e) {
//                        System.out.println("Произошла ошибка при переименовании файла/директории.");
//                        e.printStackTrace();
//                    }
//                    break;
//                case "rm_file":
//                    try {
//                        if (!Files.isDirectory(path)) {
//                            // удалите файл
//                        }
//                        else {
//                            System.out.println("С помощью этой команды можно удалить только файл!");
//                        }
//                    }
//                    catch (IOException e) {
//                        System.out.println("Произошла ошибка при удалении файла.");
//                        e.printStackTrace();
//                    }
//                    break;
//                default:
//                    System.out.println("Извините, такой команды пока нет.");
//            }
//
//        }
//    }
//
//    public static void printMenu() {
//        System.out.println("Что вы хотите сделать? ");
//        System.out.println("ls - посмотреть содержимое директории.");
//        System.out.println("mkdir - создать директорию.");
//        System.out.println("touch - создать файл.");
//        System.out.println("rename - переименовать директорию/файл.");
//        System.out.println("rm_file - удалить файл.");
//        System.out.println("exit - выход.");
// }

}
