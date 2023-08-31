package Tugas;

public class Nilai extends Mahasiswa {
    private double UTS, UAS, kuis, tugas;

    public Nilai(String nama, String nim, String kelas, double UTS, double UAS, double kuis, double tugas) {
        super(nama, nim, kelas);
        this.tugas = tugas;
        this.UAS = UAS;
        this.UTS = UTS;
        this.kuis = kuis;
    }

    public void calcIPK() {
        double ipk = (UTS * 0.3) + (UAS * 0.3) + (tugas * 0.2) + (kuis * 0.2);
        super.setIPK(ipk);
    }

    public String getPredikat() {
        if (super.getIPK() >= 3.5)
            return "Cum Laude";
        if (super.getIPK() >= 3.0 && super.getIPK() < 3.5)
            return "Magna Cum Laude";
        if (super.getIPK() >= 2.75 && super.getIPK() < 3.0)
            return "Excellent";
        if (super.getIPK() >= 2.5 && super.getIPK() < 2.75)
            return "Very Good";
        if (super.getIPK() >= 2.0 && super.getIPK() < 2.5)
            return "Good";
        return "Lulus";

        // return (super.getIPK() >= 3.5) ? "Cum laude"
        // : (super.getIPK() >= 3.0 && super.getIPK() < 3.5) ? "Magna Cum Laude"
        // : (super.getIPK() >= 2.75 && super.getIPK() < 3.0) ? "Excellent"
        // : (super.getIPK() >= 2.5 && super.getIPK() < 2.75) ? "Very Good"
        // : (super.getIPK() >= 2.0 && super.getIPK() < 2.5) ? "Good" : "Lulus";
    }

}
