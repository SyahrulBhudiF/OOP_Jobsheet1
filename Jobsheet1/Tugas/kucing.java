package Tugas;

public class kucing extends Hewan {
    public kucing(String nama, String jenis, String habitat) {
        super(nama, jenis, habitat);
    }

    @Override
    public void bersuara() {
        System.out.println("Meoooooooooooooooowwwwwwwwwwwwwwwwwwwwwww!!");
    }
}
