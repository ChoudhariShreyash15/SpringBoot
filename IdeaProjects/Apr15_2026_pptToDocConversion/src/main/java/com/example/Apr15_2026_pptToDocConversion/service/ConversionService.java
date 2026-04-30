package com.example.Apr15_2026_pptToDocConversion.service;

import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.*;
import org.apache.poi.xwpf.usermodel.*;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

@Service
public class ConversionService {

    public byte[] convertPptToDoc(MultipartFile file) throws Exception {

        XMLSlideShow ppt = new XMLSlideShow(file.getInputStream());
        XWPFDocument doc = new XWPFDocument();

        for (XSLFSlide slide : ppt.getSlides()) {

            XWPFParagraph slideTitle = doc.createParagraph();
            slideTitle.createRun().setText("----- Slide -----");

            for (XSLFShape shape : slide.getShapes()) {

                // ✅ TEXT
                if (shape instanceof XSLFTextShape) {
                    XSLFTextShape textShape = (XSLFTextShape) shape;

                    XWPFParagraph para = doc.createParagraph();
                    XWPFRun run = para.createRun();
                    run.setText(textShape.getText());
                }

                // ✅ TABLE
                else if (shape instanceof XSLFTable) {
                    XSLFTable pptTable = (XSLFTable) shape;

                    int rows = pptTable.getNumberOfRows();
                    int cols = pptTable.getRows().get(0).getCells().size();

                    XWPFTable docTable = doc.createTable(rows, cols);

                    for (int i = 0; i < rows; i++) {
                        XSLFTableRow row = pptTable.getRows().get(i);

                        for (int j = 0; j < cols; j++) {
                            String text = row.getCells().get(j).getText();
                            docTable.getRow(i).getCell(j).setText(text);
                        }
                    }
                }

                // ✅ IMAGE
                else if (shape instanceof XSLFPictureShape) {
                    XSLFPictureShape pic = (XSLFPictureShape) shape;

                    byte[] data = pic.getPictureData().getData();

                    XWPFParagraph imgPara = doc.createParagraph();
                    XWPFRun imgRun = imgPara.createRun();

                    imgRun.addPicture(
                            new ByteArrayInputStream(data),
                            Document.PICTURE_TYPE_PNG,
                            "image.png",
                            Units.toEMU(300),
                            Units.toEMU(200)
                    );
                }
            }
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        doc.write(out);

        doc.close();
        ppt.close();

        return out.toByteArray();
    }
}