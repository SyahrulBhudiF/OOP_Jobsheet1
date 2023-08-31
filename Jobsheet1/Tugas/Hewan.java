package Tugas;

public abstract class Hewan {
    private String nama;
    private String jenis;
    private String habitat;

    public Hewan(String nama, String jenis, String habitat){
        this.nama = nama;
        this.jenis = jenis;
        this.habitat =habitat;
    }

    public abstract void bersuara();

    public String eat(String food){
        return nama + " makan " + food;
    }

    public void print(){
        System.out.println("Nama\t: " + nama);
        System.out.println("Jenis\t: " + jenis);
        System.out.println("Habitat\t: " + habitat);
    }
}
