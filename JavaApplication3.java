package javaapplication1;

import java.util.Scanner;

public class JavaApplication3 {
    
    public static void main(String[] args){
    
    int n1, n2, select;
    
    Scanner mert = new Scanner(System.in);
    System.out.print("Bir sayi giriniz:");
    n1 = mert.nextInt();
    
    System.out.print("Ikinci sayiyi giriniz:");
    n2 = mert.nextInt();
    
    System.out.println("\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
    System.out.print("Seciminiz:");
    select = mert.nextInt();
    
    switch(select){
        
        case 1:
            System.out.println("SONUC: " + (n1 + n2));
            break;
        case 2:
            System.out.println("SONUC: " + (n1 - n2));
            break;
        case 3:
            System.out.println("SONUC: " + (n1 * n2));
            break;
        case 4:
            if(n2 != 0){
                System.out.println("SONUC: " + (n1 / n2));}
            else{
                System.out.println("Bir sayi 0 ile bolunemez !");}
            break;
        default:
            System.out.println("Gecersiz Secim Yaptiniz !");
        
        }
    }
}