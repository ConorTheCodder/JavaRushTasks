package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String pathOne = scanner.nextLine();
        String pathTwo = scanner.nextLine();

        InputStream inputStream = Files.newInputStream(Path.of(pathOne));

        byte[] allBytes = inputStream.readAllBytes();
        
    }
}

