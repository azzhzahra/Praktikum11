/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum;
/**
 *
 * @author Lenovo
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Lenovo\\Documents\\Tugas Kuliah\\Semester 4\\Pemrograman berorientasi objek\\new_students.csv";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            bw.write(nama);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
