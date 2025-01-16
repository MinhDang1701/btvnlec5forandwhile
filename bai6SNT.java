/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplec5forvawhile;



/**
 *
 * @author ThinkPad
 */
public class bai6SNT {

    public static void main(String[] args) {
        System.out.print("SNT :  ");
        
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}


