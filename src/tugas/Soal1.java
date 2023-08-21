package tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        System.out.println("#####    PROGRAM DATA MAHASISWA   #####");
        ArrayList<String> namaMhs = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        String nama;
        int pilih,index;
        int a = 0;

        boolean opsi = true;
        while (opsi) {
            System.out.println("1. Tambah Data");
            System.out.println("2. Update Data");
            System.out.println("3. Hapus Data");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();

            if (pilih == 1) {
                System.out.print("Masukkan Nama : ");
                nama = scan.next();
                namaMhs.add(nama);

            } else if (pilih == 2) {
                System.out.print("Masukkan Index : ");
                index = scan.nextInt();
                System.out.print("Masukkan Nama Baru : ");
                nama = scan.next();
                namaMhs.set(index,nama);

            } else if (pilih == 3) {
                System.out.print("Masukkan Index : ");
                index = scan.nextInt();
                namaMhs.remove(index);
            } else {
                opsi = false;
            }
            a++;
            System.out.println(namaMhs);
        }
    }
}

