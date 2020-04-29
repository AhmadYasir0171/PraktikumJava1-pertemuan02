public class Main {

        public static void main(String[] args){

            Karyawan karyawan1 = new Karyawan();
            Karyawan karyawan2 = new Karyawan();

            karyawan1.nama = "Ahmad Yasir";
            karyawan1.umur = 25;
            karyawan1.pangkat = "Maneger";
            karyawan1.gaji = 10000000;
            karyawan1.alamat = "Jl. melayu";
            karyawan1.cetak();

            karyawan2.nama = "Kamila Putri";
            karyawan2.umur = 21;
            karyawan2.pangkat = "Asisten Maneger";
            karyawan2.gaji = 9000000;
            karyawan2.alamat = "Jl. Garuda";
            karyawan2.cetak();

        }
    }
