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
public class Bai5 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int n = scanner.nextInt();
        int dem=0;
        while(n!=0){
            n/=10;
            dem++;
        }
        System.out.println(dem);
    }
}
