package Tugas;

public class kucing extends Hewan {
    private String warna;
    private String ras;
    private String bulu;
    private int energy;

    public kucing(String nama, String jenis, String habitat, String bulu, String ras, String warna) {
        super(nama, jenis, habitat);
        this.bulu = bulu;
        this.ras = ras;
        this.warna = warna;
    }

    public void setEnergy(int value){
        energy += value;
    }

    public void bermain(int jam){
        System.out.println("Kucing bermain selama " + jam + " jam");
        energy -= jam;
    }

    public void tidur(int jam){
        System.out.println("Kucing tidur selama " + jam + " jam");
        energy += jam;
    }

    public void makan(String makan){
        super.eat(makan);
        energy++;
    }

    public void printKcng(){
        super.print();
        System.out.println("Ras\t: " +ras);
        System.out.println("Bulu\t: " +bulu);
        System.out.println("Warna\t: " +warna);
    }
}
