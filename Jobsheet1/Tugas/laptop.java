package Tugas;

public class laptop {
    private String merk;
    private String proci;
    private String vga;
    private String ram;
    private String rom;
    private String price;
    private String baterai;
    private int stok;

    public laptop(String merk, String proci, String ram, String rom, String price, String vga, String baterai, int stok) {
        this.merk = merk;
        this.proci = proci;
        this.ram = ram;
        this.rom = rom;
        this.vga = vga;
        this.baterai = baterai;
        this.price = price;
        this.stok = stok;
    }

    public void print(){
        System.out.println("Laptop\t\t: " + merk);
        System.out.println("\nSpek\t\t:\nProsesor\t: " + proci);
        System.out.println("VGA\t\t: " + vga);
        System.out.println("Ram\t\t: " + ram);
        System.out.println("Rom\t\t: " + rom);
        System.out.println("Baterai\t\t: " + baterai);
        System.out.println("Price\t\t: " + price);
        System.out.println("Stok\t\t: " + stok);
        System.out.println();
    }

    public int getStok(){
        return stok;
    }

    public void buyLaptop(){
        if(getStok() != 0){
            System.out.println("-=Terimakasih telah membeli dari toko kami\n=-");
            print();
            stok--;
        } else {
            System.out.println("Maaf Stok Habis");
        }
    }
}
