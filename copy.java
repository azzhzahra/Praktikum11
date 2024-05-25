/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Lenovo
 */
import java.io.*;

public class copy {
    public static void main(String[] args) {
        String[] files = {
            "C:\\Users\\Lenovo\\Documents\\Tugas Kuliah\\Semester 4\\Pemrograman berorientasi objek\\Praktikum11.csv"
        };
        String mergeFile = "C:\\Users\\Lenovo\\Documents\\Tugas Kuliah\\Semester 4\\Pemrograman berorientasi objek\\salinan.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergeFile))) {
            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("File berhasil disalin.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
