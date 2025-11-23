package javaapplication1;

import java.util.Scanner;

public class JavaApplication2{

    public static void main(String[] args){
    
        int para, kdv;
        double toplam,sonuc,kdvsiz;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("KDV'si Hesaplanacak Para Miktarini Giriniz: ....");
        para = inp.nextInt();
        
        System.out.println("KDV miktarini Giriniz: ....");
        kdv = inp.nextInt();
        
        sonuc = (para*kdv)/100;
        toplam = sonuc + para;
        kdvsiz = para - sonuc;
        
        
        System.out.print("Girdiginiz Para Miktari:");
        System.out.println(para);
        
        System.out.print("Girdiginiz KDV Miktari:");
        System.out.println(kdv);
        
        System.out.print("Kdvsi Hesaplanmis Tutar:");
        System.out.println(sonuc);
        
        System.out.print("Kdv Olmadan Tutar:");
        System.out.println(kdvsiz);
        
        System.out.print("Kdvsi Ile Toplanmis Tutar:");
        System.out.println(toplam);
    }
}