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
public class Bai4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int n = scanner.nextInt();
        int dao=0;
        int ketQua=0;
        while(n!=0){
             dao=n%10;
             ketQua=ketQua*10+dao;
             n/=10;
        }
        System.out.println("Ket qua: "+ketQua);
    }
}
