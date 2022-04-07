import java.util.Scanner;

public class Pelajar implements BeasiswaPelajar{
    Scanner scanner = new Scanner(System.in);
    String nama;
    public double usia, nske, ntv, nkdt, hasil;

    public Pelajar(double usia, String nama) {
        this.usia = usia;
        this.nama = nama;
    }

    public Pelajar(double nske, double ntv, double nkdt, double hasil) {
        this.nske = nske;
        this.ntv = ntv;
        this.nkdt = nkdt;
        this.hasil = hasil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNske() {
        return nske;
    }

    public void setNske(double nske) {
        this.nske = nske;
    }

    public double getNtv() {
        return ntv;
    }

    public void setNtv(double ntv) {
        this.ntv = ntv;
    }

    public double getNkdt() {
        return nkdt;
    }

    public void setNkdt(double nkdt) {
        this.nkdt = nkdt;
    }

    public void pendaftaran() {
        System.out.println(" ");
        System.out.println("Program Beasiswa Perusahaan Benang");
        System.out.println(" ");

        System.out.println("--- FORM PENDAFTARAN ---");
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Usia : ");
        int usia = scanner.nextInt(); scanner.nextLine();

        System.out.println("--- FORM PENILAIAN ---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0-100");
        System.out.print("Nilai Struktur dan Konten Esai: ");
        double nske = scanner.nextDouble(); scanner.nextLine();
        System.out.print("Nilai Teknik Visualisasi: ");
        double ntv = scanner.nextDouble(); scanner.nextLine();
        System.out.print("Nilai Kemampuan Design Thinking");
        double nkdt = scanner.nextDouble(); scanner.nextLine();
    }

    void keterangan() {
        System.out.println("Nilai Total: " + nilaitotal());
        if(hasil<87.5) {
            System.out.println("Maaf, " + nama + " dinyatakan TIDAK LULUS di Beasiswa Pelajar");
        } else if(hasil>=87.5 && hasil<=100) {
            System.out.println("Selamat, " + nama + " dinyatakan LULUS di Beasiswa Pelajar");
        }
    }

    private double nilaitotal() {
        return hasil = (nske() + ntv() + nkdt());
    }

    @Override
    public double nske() {
        return nske = nske*50/100;
    }

    @Override
    public double ntv() {
        return ntv = ntv*20/100;
    }

    @Override
    public double nkdt() {
        return nkdt = nkdt*30/100;
    }

    @Override
    public void hasil() {
        keterangan();
    }
}
