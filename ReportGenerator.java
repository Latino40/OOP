package com.balextransit;

import java.io.*;
public class ReportGenerator {
    public void generateReport(File file) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
            writer.write("Patient Report");
        } catch (IOException e) {
            System.out.println("Error writing report: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}
