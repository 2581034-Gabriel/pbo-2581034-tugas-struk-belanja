import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Barang ke-1: ");
        String nama1 = scanner.nextLine();

        System.out.print("Harga: ");
        int harga1 = scanner.nextInt();

        System.out.print("Jumlah: ");
        int jumlah1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nama Barang ke-2: ");
        String nama2 = scanner.nextLine();

        System.out.print("Harga: ");
        int harga2 = scanner.nextInt();

        System.out.print("Jumlah: ");
        int jumlah2 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nama Barang ke-3: ");
        String nama3 = scanner.nextLine();

        System.out.print("Harga: ");
        int harga3 = scanner.nextInt();

        System.out.print("Jumlah: ");
        int jumlah3 = scanner.nextInt();

        System.out.print("Uang yang dibayar: ");
        int uang = scanner.nextInt();

        int totalSemua1 = harga1 * jumlah1;
        int totalSemua2 = harga2 * jumlah2;
        int totalSemua3 = harga3 * jumlah3;
        int totalBelanja = totalSemua1 + totalSemua2 + totalSemua3;
        int kembalian = uang - totalBelanja;

        System.out.println("===STRUK BELANJA===");
        System.out.println(nama1 + jumlah1 + harga1 = totalSemua1);

    }



}
