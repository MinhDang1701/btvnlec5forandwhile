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
public class bai7fibo {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt() ;
        int a = 0, b = 1;
        
        System.out.print("so fibo: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            
            // Tính số tiếp theo
            int ketqua = a + b;
            a = b;
            b = ketqua;
        }
    }
}


