import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        start(input);
    }

    private static void start(Scanner input) {
        String name = nameInput(input);
        String nim = nimInput(input);

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\nRegistrasi Sukses...");
        System.out.printf("Selamat datang %s [NIM : %s].. ^^v%n", name, nim);

        System.out.println("\nMari belajar macam-macam deret bilangan..");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        int number = inputNumber(input);

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("\nDeret Bilangan");
        System.out.println("##############");

        even(number);
        odd(number);
        fibonnaci(number);

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

        System.out.print("Anda ingin mengulang [y/t] : ");
        repeat(input);

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    private static String nameInput(Scanner input) {
        System.out.print("Masukkan Nama Anda [1..25] : ");
        String name = input.nextLine();

        if(name.length() < 1 || name.length() > 25) {
            System.out.println("Nama yang anda masukkan harus terdiri dari 1 - 25 angka.");
            nameInput(input);
        }

        return name;
    }

    private static String nimInput(Scanner input) {
        System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
        String nim = input.nextLine();

        if(nim.length() != 10) {
            System.out.println("NIM yang anda masukkan harus terdiri dari 10 karakter");
            nimInput(input);
        }

        return nim;
    }

    private static int inputNumber(Scanner input) {
        System.out.print("\nMasukkan Sembarang Angka [5..20] : ");
        int number = input.nextInt();

        if(number < 5 || number > 20) {
            System.out.println("Angka yang anda masukkan harus diantara rentang angka 5 - 20");
            number = inputNumber(input);
        }

        return number;
    }

    private static void even(int number) {
        System.out.printf("%n%d Bilangan Genap : %n", number);

        int result = 0;
        int start = 2;
        for (int i = 1; i <= number; i++) {
            System.out.print(start + " ");
            result += start;
            start += 2;
        }

        System.out.println("\nHasil Penjumlahan = " + result);
    }

    private static void odd(int number) {
        System.out.printf("%n%d Bilangan Ganjil : %n", number);

        int result = 0;
        int start = 1;
        for (int i = 1; i <= number; i++) {
            System.out.print(start + " ");
            result += start;
            start += 2;
        }

        System.out.println("\nHasil Penjumlahan = " + result);
    }

    private static void fibonnaci(int number) {
        System.out.printf("%n%d Bilangan Fibonnaci : %n", number);

        int result = 0;
        // Variabel untuk menyimpan bilangan Fibonacci sebelumnya
        int prev = 0;
        // Variabel untuk menyimpan bilangan Fibonacci sekarang
        int curr = 1;

        // Perulangan untuk mencetak {number} of bilangan Fibonacci
        for (int i = 1; i <= number; i++) {
            // Mencetak bilangan Fibonacci sekarang
            System.out.print(curr + " ");

            // Menghitung bilangan Fibonacci berikutnya
            int next = prev + curr;
            // Menyimpan bilangan Fibonacci berikutnya ke variabel curr
            result += curr;
            prev = curr;
            curr = next;
        }

        System.out.println("\nHasil Penjumlahan = " + result);
    }

    private static void repeat(Scanner input) {
        String res = input.nextLine();

        if(res.equals("y")) {
            start(input);
        } else if (res.equals("t")) {
            System.out.println("Thank you!");
            System.exit(0);
        } else {
            repeat(input);
        }
    }
}