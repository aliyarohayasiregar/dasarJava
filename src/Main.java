// import java.util.Scanner;
// import java.util.List;
// import java.util.ArrayList;
import java.util.*;

class Main {
    // method non-static
    void cetakJumlah(int bilangan1, int bilangan2) {
        System.out.println(bilangan1 + bilangan2);

    }
    // method static
    static void cetakJumlahStatic(int bilangan1, int bilangan2) {
        System.out.println(bilangan1 + bilangan2);
    }

    // method yang mengembalikan nilai
    static int jumlahkan(int bilangan1, int bilangan2) {
        return bilangan1 + bilangan2;
    }

    public static void main(String[] args) {
        // pemanggilan method non-static
        Main main2 = new Main(); // (harus diinstansiasi)
        main2.cetakJumlah(5, 6);

        // pemanggilan method static
        Main.cetakJumlahStatic(7, 8); // (tanpa instansiasi)
        // atau:
        cetakJumlahStatic(8, 9); // (khusus class yang sama)

        // pemanggilan method yg mengembalikan nilai
        // ditampung dulu:
        int hasil = jumlahkan(12, 17);
        System.out.println(hasil);
        // cara langsung:
        System.out.println(jumlahkan(12, 17));

        // input
        System.out.println("Masukkan teks: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("masukkan angka:");
        Scanner scanner1=new Scanner(System.in);
        int angka=scanner1.nextInt();
        System.out.println(" angka :"+angka);
        System.out.println("Anda menginput: " + text);

        // array (primitif)
        int[] numbers = { 41, 54, 89, 32, 98 };

        // boolean
        boolean isEven = true;
        if (isEven) {
            System.out.println("Genap");
        }

        // loop biasa
        for (int i = 0; i < numbers.length; i++) {

            // decision
            if (numbers[i] % 2 == 0) {
                System.out.println("Bilangan genap: " + numbers[i]);
            } else {
                System.out.println("Bilangan ganjil: " + numbers[i]);
            }
        }

        // loop array
        for (int number : numbers) {
            System.out.println("Angka: " + number);
        }

        // komposit (non primitif)

        // String
        String name = "Iwan";
        System.out.println(name);

        // List (AbstractList, ArrayList, LinkedList, Stack, dll.)
        // yg sering digunakan: ArrayList (inherit dari List)
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        System.out.println(planets);

        // Map (objek/key-value) (AbstractMap, HashMap, dll.)
        // yg sering digunakan: HashMap (inherit dari Map)

        Map<String, Object> student = new HashMap<>();

        // membuat properti
        student.put("nim", "02031911067");
        student.put("name", "Romi Kusuma Bakti");
        student.put("age", 22);

        // membaca properti
        System.out.println(student.get("name"));

        // meng-update properti
        student.replace("name", "Eko Travada");
        System.out.println(student);

        // menghapus properti
        student.remove("name");
        System.out.println(student);

        // menghapus semua properti
        student.clear();
        System.out.println(student);
    }
}