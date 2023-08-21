package belajar;

import java.util.Scanner;

public class Belajar2 {
    public static void main(String[] args){
        String huruf;
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan huruf :");
        huruf=input.nextLine();
        ubah(huruf);


    }

    static void ubah(String str) {
        int jumlah = 0;
        for (int a = 0; a < str.length(); a++) {
            if(str.charAt(a)=='a') {
                jumlah++;
            }
        }

        if(jumlah>0){
            System.out.println("jumlah huruf a yang di inputkan adalah "+jumlah);

        }
    }

}
