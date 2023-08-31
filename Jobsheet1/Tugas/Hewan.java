package Tugas;

public class Hewan {
    private String nama;
    private String jenis;
    private String habitat;

    public Hewan(String nama, String jenis, String habitat) {
        this.nama = nama;
        this.jenis = jenis;
        this.habitat = habitat;
    }

    public void bersuara(String suara) {
        System.out.println(nama + " : " + suara);
    }

    public String eat(String food) {
        return nama + " makan " + food;
    }

    public void print() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Jenis\t: " + jenis);
        System.out.println("Habitat\t: " + habitat);
    }
}
