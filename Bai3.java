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
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        System.out.println("Tich la: "+fac);
    }
}
