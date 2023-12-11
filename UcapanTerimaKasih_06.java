import java.util.Scanner;

public class UcapanTerimaKasih_06 {
    public static String PeneerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tulisan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PeneerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You in me love for learning and made me feel like I could ask you anything");

       
        UcapanTambahan("Terima kasih atas segala bimbingan dan dukungannya!");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println("Ucapan Tambahan: " + tambahan);
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}
