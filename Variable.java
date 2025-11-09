import java.util.Scanner;

public class Variable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Nama Lengkap: ");
    String namaLengkap = input.nextLine();

    System.out.print("Tempat & Tanggal Lahir: ");
    String tempatTanggalLahir = input.nextLine();

    System.out.print("Jenis Kelamin: ");
    String jenisKelamin = input.nextLine();

    System.out.print("Alamat: ");
    String alamat = input.nextLine();

    System.out.print("Nomor Telepon:");
    String nomorTelepon = input.nextLine();

    System.out.print("Masukkan Jumlah Penghasilan perbulan: ");
    int penghasilanPerBulan = input.nextInt();

    System.out.println();
    System.out.println("=============");
    System.out.println("Asslamu'alaikum");
    System.out.println("Izinkan saya memperkenalkan diri");
    System.out.println("Nama Lengkap: " + namaLengkap);
    System.out.println("Tempat & Tanggal Lahir: " + tempatTanggalLahir);
    System.out.println("Jenis Kelamin: " + jenisKelamin);
    System.out.println("Alamat: " + alamat);
    System.out.println("Nomor Telepon: " + nomorTelepon);
    System.out.println("Penghasilan perbulan: Rp " + penghasilanPerBulan);
    System.out.println("=============");
  }
}
