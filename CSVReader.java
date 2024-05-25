/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Lenovo
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Lenovo\\Documents\\Tugas Kuliah\\Semester 4\\Pemrograman berorientasi objek\\students.csv";
        String line;
        String csvSplitBy = ",";
        int index = 0;
        int lineCount = 0;
        System.out.println("NIM, NAMA, UMUR, PRODI");

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                index++;
                if (index > 1) {
                    lineCount++;
                    String[] student = line.split(csvSplitBy);
                    System.out.println(student[0] + ", " + student[1] + ", " + student[2] + ", " + student[3]);
                }
            }
            System.out.println("Jumlah Baris = " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
