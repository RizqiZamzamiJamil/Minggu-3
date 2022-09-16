import java.util.Scanner;
public class TestKoperasi{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.print("Masukkan jumlah pinjam : ");
        int pjm = s.nextInt();
        donny.pinjam(pjm);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("");

        System.out.print("Masukkan jumlah angsuran : ");
        int ags = s.nextInt();
        donny.angsur(ags);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        // System.out.println("\nMeminjam uang 4.000.000...");
        // donny.pinjam(4000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        // //
        // System.out.println("\nMembayar angsuran 1000000");
        // donny.angsur(1000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        // System.out.println("\nMembayar angsuran 3.000.000");
        // donny.angsur(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
