package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String source1 = scanner.nextLine();
        String source2 = scanner.nextLine();

        try (InputStream inputStream = Files.newInputStream(Paths.get(source1))) {
        }
    }
}

