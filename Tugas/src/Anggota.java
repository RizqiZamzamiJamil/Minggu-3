public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKTP, String nama, int limitPinjaman){
        this.nama = nama;
        this.noKTP = noKTP;
        this.limitPinjaman = limitPinjaman;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public void setLimitPinjaman(int newLimit) {
        limitPinjaman = newLimit;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void pinjam(int Pinjam){
        if(Pinjam > limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else{
            jumlahPinjaman += Pinjam;
        }
    }

    public void angsur(int Angsur){
        if(Angsur < (limitPinjaman/10)){
            System.out.println("Maaf, angsuran minimal 10% dari pinjaman!");
        } else{
            jumlahPinjaman -= Angsur;
        }
    }
}
