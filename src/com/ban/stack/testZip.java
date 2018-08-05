package com.ban.stack;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class testZip {

//
    public static void main(String[] args) {
        File infile = new File("test_file.pdf");
        try (
                FileInputStream fis = new FileInputStream(infile);
                ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("test.zip"));
        ) {
            int bytesRead;
            byte[] buffer = new byte[1024];
            CRC32 crc = new CRC32();
            try (
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(infile));
             ) {
                crc.reset();
                while ((bytesRead = bis.read(buffer)) != -1) {
                    crc.update(buffer, 0, bytesRead);
                }
            }
            ZipEntry entry = new ZipEntry("data");
            entry.setMethod(ZipEntry.STORED);
            entry.setCompressedSize(infile.length());
            entry.setSize(infile.length());
            entry.setCrc(crc.getValue());

            zos.putNextEntry(entry);
            while ((bytesRead = fis.read(buffer)) >= 0)
            {
                zos.write(buffer, 0, bytesRead);
            }
            zos.closeEntry();

        } catch (IOException e) {
            e.printStackTrace();
        }
//
}
}
