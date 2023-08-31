package Tugas;

public class matkul extends Mahasiswa {
    private String matkul[];
    private String sks[];
    private String id[];

    public matkul(String nama, String nim, String kelas, String matkul[], String id[], String sks[]) {
        super(nama, nim, kelas);
        this.matkul = matkul;
        this.id = id;
        this.sks = sks;
    }

    public void printMatkul() {
        super.print();
        System.out.println("================\nMatkul : ");

        for (int i = 0; i < matkul.length; i++) {
            System.out.println("Id\t\t: " + id[i]);
            System.out.println("Matkul\t\t: " + matkul[i]);
            System.out.println("Sks\t\t: " + sks[i]);
            System.out.println();
        }
    }
}
