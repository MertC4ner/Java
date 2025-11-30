package javaapplication1;

import java.util.Scanner;

public class JavaApplication6{

    public static void main(String[] args){
    
    String userName, password;
    
    int right = 3, section, balance = 1500, price, less;
    
    Scanner input = new Scanner(System.in);
    
    while(right > 0){
        
    System.out.print("Kullanici adiniz:  ");
    userName = input.nextLine();
    System.out.print("Sifrenizi Giriniz:   ");
    password = input.nextLine();
    
    if(userName.equals("mert")&& password.equals("caner")){
        System.out.println("Sisteme Giris Yaptiniz...\n\n");
        
        do{
            System.out.println("****************\n1-Bakiye Sorgula\n2-Para Yatirma\n3-Para Cekme\n4-Cikis Yap\n****************");
            System.out.print("Lutfen Bir Secim Yapiniz: ");
        
            section = input.nextInt();
            
            System.out.print("\n\n");
            
            switch(section){
            
                case 1:
                    System.out.println("BAKIYE SORGULAMA");
                    System.out.println("Guncel Bakiyeniz: " + balance);
                    System.out.print("\n\n");
                    break;
                    
                case 2:
                    System.out.println("PARA YATIRMA");
                    System.out.print("Yatirilacak Tutari Giriniz: ");
                    price = input.nextInt();
                    balance += price;
                    System.out.println("Hesabiniza Yatirilan Tutar: " + price);
                    System.out.println("Guncel Hesap Bakiyeniz: " + balance);
                    System.out.print("\n\n");
                    break;
                    
                case 3:
                    System.out.println("PARA CEKME");
                    do{
                    System.out.print("Lutfen Cekmek Istediginiz Tutari Giriniz: ");
                    less = input.nextInt();
                    
                        if(balance > less){
                            balance -= less;
                            System.out.println("Hesabinizdan Cekilen Tutar: " + less);
                            System.out.println("Guncel Hesap Bakiyeniz: " + balance);
                        }else{
                            System.out.println("Hesap Bakiyeniz Yetersiz ... Lutfen Daha Az Para Cekmeyi Deneyin");
                        }
                    }while(balance < less);
                    
                    System.out.println("Guncel Hesap Bakiyeniz: " + balance);
                    System.out.print("\n\n");
                    break;
                }
            } while(section != 4);

        System.out.print("ATM'den Cikis Yapiliyor");
        System.out.print("\n\n");
        
        break;
    }else{
        System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz...");
        System.out.println("Kalan Hakkiniz: " + --right);
        if(right == 0){
            System.out.println("Hesabiniz bloke oldu...");
            System.out.print("\n\n");
                }
            }
        }
    }
}
