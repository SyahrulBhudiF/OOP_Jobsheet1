package Tugas;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;
    private double IPK;

    public Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }

    public void print() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nim\t\t: " + nim);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("IPK\t\t: " + IPK);
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public double getIPK() {
        return IPK;
    }
}
