package com.example.Apr15_2026_pptToDocConversion.controller;

import com.example.Apr15_2026_pptToDocConversion.service.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/convert")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @PostMapping(
            value = "/ppt-to-doc",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public ResponseEntity<byte[]> convertPptToDoc(
            @RequestParam("file") MultipartFile file
    ) {
        try {
            // ✅ Validate file
            if (file.isEmpty()) {
                return ResponseEntity.badRequest().build();
            }

            String fileName = file.getOriginalFilename();
            if (fileName == null || !fileName.endsWith(".pptx")) {
                return ResponseEntity.badRequest().build();
            }

            // ✅ Call service
            byte[] docBytes = conversionService.convertPptToDoc(file);

            // ✅ Return as downloadable DOCX
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=converted.docx")
                    .header(HttpHeaders.CONTENT_TYPE,
                            "application/vnd.openxmlformats-officedocument.wordprocessingml.document")
                    .contentType(MediaType.parseMediaType(
                            "application/vnd.openxmlformats-officedocument.wordprocessingml.document"))
                    .body(docBytes);

        } catch (Exception e) {
            e.printStackTrace(); // (avoid in production, use proper handling)
            return ResponseEntity.internalServerError().build();
        }
    }
}