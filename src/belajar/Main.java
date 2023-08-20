package belajar;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("masukkan batas:");
//        int batas=scanner.nextInt();
//        int nilai[]=new int[batas];
//        int tamp[]=new int[batas];
//        int angka1[]=new int[batas];
//        int angka2[]=new int[batas];



//        for(int a=0;a<nilai.length;a++) {
//            System.out.println("penjumlahan ke-:" + (a+1));
//            System.out.print("masukkan angka ke satu :");
//            angka1[a]=scanner.nextInt();
//            System.out.print("masukkan angka ke dua:");
//            angka2[a]=scanner.nextInt();
//
//            tamp[a]=angka1[a]+angka2[a];
//
//
////
////            if(angka%2==0){
////                System.out.println(angka+"adalah bilangan genap ");
////            }else {
////                System.out.println(angka+"adalah bilangan ganjil");
////            }
//
//        }
//
//        for (int b=0;b<nilai.length;b++){
//            System.out.println("penjumlahan ke "+(b+1)+"="+tamp[b]);
//        }
//        int[] numbers = { 41, 54, 89, 32, 98 };
//
//        for (int number : numbers) {
//            System.out.println("Angka: " + number);
//        }


        List<String> names=new ArrayList<>();
        names.add("aliya");
        names.add("maypa");
        names.add("nanda");
        names.add("bunga");
        names.add("amel");
        names.add("ama");
        System.out.println(names);

        Map<String,Object> studens=new HashMap<>();
        studens.put("nama","aliya");
        studens.put("nim","02333");
        studens.put("umur",20);

    }


}
