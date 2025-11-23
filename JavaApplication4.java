package javaapplication1;

import java.util.Scanner;

public class JavaApplication4{

public static void main(String[] args){

    String userName, password;
    
    Scanner inp = new Scanner(System.in);
    
    System.out.print("Lutfen kullanici adini giriniz:");
    userName = inp.nextLine();
    
    System.out.print("Lutfen sifrenizi giriniz:");
    password = inp.nextLine();
    
    if(userName.equals("Mert") && password.equals("Caner")){
    
        System.out.print("Giris Basarili..!");
    }else{
        System.out.print("Giris Basarisiz..!");
        }
    }
}