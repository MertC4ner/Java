package javaapplication1;

import java.util.Scanner;

public class JavaApplication8 {
    
    static int sum(int a, int b){
        int result = a + b;
        System.out.print("Toplam: " + result);
        return result;
    }
    
    static int minus(int a, int b){
        if(b == 0){
            System.out.print("Ikinci Sayi 0 Olamaz...");
        return 1;
        }
        int result = a - b;
        System.out.print("Fark: " + result);
        return result;
    }
    
    static int times(int a, int b){
        int result = a * b;
        System.out.print("Carpim: " + result);
        return result;
    }
    
    static int divided(int a, int b){
        int result = a / b;
        System.out.print("Bolum: " + result);
        return result;
    }
    
    static int mod(int a, int b){
        int result = a % b;
        System.out.print("Mod: " + result);
        return result;
    }
    
    static int power(int a, int b){
        int result = 1;
        for(int i =1; i<=b; i++){
        result *= a;
        }
        System.out.print("Us: " + result);
        return result;
    }
    
    static void calc(int a, int b){
        System.out.println("Dikdortgenin Cevresi: " + (2*(a*b)));
        System.out.println("Dikdortgenin Alani: " + (a*b));
    }
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String menu = "\n\n1- Toplama\n"
                     +"2- Cikarma\n"
                     +"3- Carpma\n"
                     +"4- Bolme\n"
                     +"5- Mod Alma\n"
                     +"6- Uslu Sayi Hesaplama\n"
                     +"7- Dikdortfem cevre ve alan hesaplama\n"
                     +"0- Cikis Yap\n";
        
        int select;
        
        while(true){
            System.out.println(menu);
            
            select = scan.nextInt();
            
            if(select == 0)
                break;
            
            System.out.print("Birinci Sayi: ");
            int a = scan.nextInt();
            System.out.print("Ikinci Sayi: ");
            int b = scan.nextInt();
            
            switch(select){
                case 1:
                    sum(a,b);
                    break;
                
                case 2:
                    minus(a,b);
                    break;
                    
                case 3:
                    times(a,b);
                    break;
                    
                case 4:
                    divided(a,b);
                    break;
                    
                case 5:
                    mod(a,b);
                    break;
                    
                case 6:
                    power(a,b);
                    break;
                    
                case 7:
                    calc(a,b);
                    break;
            }  
        }
    }
}
