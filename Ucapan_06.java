import java.util.Scanner;

public class Ucapan_06 {
   public static String PeneerimaUcapan() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Tulisan NAMA orang yang ingin Anda beri ucapan:");
    String namaOrang = sc.nextLine();
    sc.close();
    return namaOrang;
   } 
   public static void main(String[] args) {
    String nama = PeneerimaUcapan();
    System.out.println("Thank you gaes "+nama+"\nMay the force be with you.");
   }
}
