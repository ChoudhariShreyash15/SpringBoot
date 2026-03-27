package org.example;

import java.util.Base64;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Base64Encode {
    public static void main(String[] args) throws Exception {
        byte[] fileContent = Files.readAllBytes(Paths.get("C:\\Users\\syste\\Downloads\\Microservice Architecture.jpg"));
        String encodedString = Base64.getEncoder().encodeToString(fileContent);

        System.out.println(encodedString);
    }
}