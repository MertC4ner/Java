package javaapplication1;

import java.util.Scanner;

public class JavaApplication5 {
    
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Lutfen kac basamak oldugunu giriniz: ");
    int n = input.nextInt();
    
    for(int i=0; i<=n; i++){
        
        for(int k=0; k<=(n-i);k++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println("HAYIRLI CUMALAR");
    }
    
    }
}
