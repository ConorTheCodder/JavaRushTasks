package com.javarush.task.pro.task15.task1504;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (InputStream inputStream = Files.newInputStream(Path.of(scanner.nextLine()));
             OutputStream outputStream = Files.newOutputStream(Path.of(scanner.nextLine()))) {
            byte[] bytes = inputStream.readAllBytes();
            for (int i = 0; i < bytes.length; i = i + 2) {
                if (i < bytes.length - 1) {
                    byte tmp = bytes[i];
                    bytes[i] = bytes[i + 1];
                    bytes[i + 1] = tmp;
                }
            }
            outputStream.write(bytes);
        }
    }
}

