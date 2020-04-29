public class Karyawan {
    String nama;
    int umur;
    String pangkat;
    int gaji;
    String alamat;

    void nama(String nama){
        nama = nama;
    }

    void umurKaryawan(int umurKaryawan){
        umur =  umurKaryawan;
    }

    void pangkatKaryawan(String pangkatKaryawan){
        pangkat = pangkatKaryawan;
    }

    public void gajiKaryawan(int gajiKaryawan){
        gaji = gajiKaryawan;
    }

    public void alamat(String Alamat){
        alamat = Alamat;
    }
    public void cetak(){
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("Pangkat : " + pangkat);
        System.out.println("Gaji    : " + gaji);
        System.out.println("Alamat  : " + alamat);
        System.out.println();
    }
}