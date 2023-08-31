package Tugas;

public class matkul extends Mahasiswa {
    String matkul[];

    public matkul(String nama, String nim, String kelas, String matkul[]) {
        super(nama, nim, kelas);
        this.matkul = matkul;
    }

    public void printMatkul() {
        super.print();
        System.out.println("================\nMatkul : ");

        for (String string : matkul) {
            System.out.println("Matkul\t\t: " + string);
        }
    }
}
