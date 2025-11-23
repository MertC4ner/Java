package java1;
import java.util.Scanner;

/**
 *
 * @author mertc
 */
public class NewClass {

public static void main(String[] args) {
    
    int mat, fizik, kimya, turkce, tarih, muzik, sonuc;
    
    double ortalama;
    
    Scanner inp = new Scanner(System.in);
    
    System.out.println("Matematik Notunuzu Giriniz:");
    mat = inp.nextInt();

    
    System.out.println("Fizik Notunuzu Giriniz: ");
    fizik = inp.nextInt();
    
    System.out.println("Kimya Notunuz Giriniz: ");
    kimya = inp.nextInt();
    
    System.out.println("Turkce Notunuzu Giriniz: ");
    turkce = inp.nextInt();
    
    System.out.println("Tarih Notnuzu Giriniz: ");
    tarih = inp.nextInt();
    
    System.out.println("Muzik Notunuzu Giriniz: ");
    muzik = inp.nextInt();
    
    sonuc = mat + fizik + kimya + turkce + tarih + muzik;
    
    ortalama = sonuc / 6;
    System.out.println("Donem Sonu Ortlamaniz:  ");
    System.out.print(ortalama);
    
    }
}
