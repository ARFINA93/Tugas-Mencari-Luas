package tugaspbo;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double luas, phi = 3.14;
        int r;
       
        System.out.println("masukkan jari-jari lingkaran : ");
        r=input.nextInt();
        luas = phi*r*r;
 
        System.out.println("luas lingkaran = "+luas);
    }
    
}

