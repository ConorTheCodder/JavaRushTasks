package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            while (true) {
                String line = scanner.nextLine();
                bw.write(line);
                bw.newLine();
                if (line.equals("exit")) {
                    break;
                }
            }
        }
    }
}