package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;

public class StreamDecode {

    public static void main(String[] args) throws Exception {
        try (InputStream in = new FileInputStream("E:\\Shreyash_1227\\Java\\IdeaProjects\\IdeaProjects\\Base64_Encoding_Decoding\\Doc.txt");
             InputStream base64Stream = Base64.getDecoder().wrap(in);
             OutputStream out = new FileOutputStream("C:\\Users\\syste\\Downloads\\output4.docx")) {

            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = base64Stream.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}
//Decode in chunks, do not pass whole text string because it is very large in size
// and Your program tries to load the entire string into memory at once

// When decoding Base64, problems happen if:
//
// The Base64 string is very large (big PDF/image)
// Your program tries to load the entire string into memory at once
// API / language limits on string size are exceeded
// Improper handling (like concatenation, logging, or JSON parsing)

// Quick Fix
// Use Streaming (MOST IMPORTANT)
//
// Instead of decoding the whole string at once, process it in chunks (shown above).