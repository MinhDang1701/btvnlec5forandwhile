/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplec5forvawhile;
import java.util.Scanner;
/**
 *
 * @author ThinkPad
 */
public class bai10tamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Nhap n: ");
        int n = scanner.nextInt(); 
       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


