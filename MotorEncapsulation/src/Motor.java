// Rizqi Zamzami Jamil 2141762089 SIB-2E 20
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if(kontakOn == true){
            kecepatan += 25;
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        } if(kecepatan > 100){
            System.out.println("Mencapai batas maksimal. Kecepatan tidak bisa ditambah!\n");
            kecepatan = 100;
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        } else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepatan+"\n");
    }
}
