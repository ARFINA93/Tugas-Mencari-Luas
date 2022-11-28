package tugaspbo;

import java.util.Scanner;

public class TugasPBO {

    public static void main(String[] args) {
        int p;
        int l;
        double luas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Program menghitung luas persegi");
        System.out.print("masukkan panjang : ");
        p = scan.nextInt();
        System.out.print("masukkan lebar : ");
        l = scan.nextInt(); 
        
        luas = (l*p);
        System.out.println("luas persegi adalah : " +luas);
        
    }
    
}
