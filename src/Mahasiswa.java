import java.util.Scanner;

public class Mahasiswa implements BeasiswaMahasiswa {

    Scanner scanner = new Scanner(System.in);
    String nama;
    public double usia, nskj, nrd, nkps, hasil;

    public Mahasiswa(String nama, double usia) {
        this.usia = usia;
        this.nama = nama;
    }

    public Mahasiswa(double nskj, double nrd, double nkps, double hasil) {
        this.nskj = nskj;
        this.nrd = nrd;
        this.nkps = nkps;
        this. hasil = hasil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNskj() {
        return nskj;
    }

    public void setNskj(double nskj) {
        this.nskj = nskj;
    }

    public double getNrd() {
        return nrd;
    }

    public void setNrd(double nrd) {
        this.nrd = nrd;
    }

    public double getNkps() {
        return nkps;
    }

    public void setNkps(double nkps) {
        this.nkps = nkps;
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
        System.out.print("Nilai Struktur dan Konten Jurnal: ");
        double nskj = scanner.nextDouble(); scanner.nextLine();
        System.out.print("Nilai Relevansi Data: ");
        double nrd = scanner.nextDouble(); scanner.nextLine();
        System.out.print("Nilai Kemampuan Problem Solving");
        double nkps = scanner.nextDouble(); scanner.nextLine();
    }

    void keterangan() {
        System.out.println("Nilai Total: " + nilaitotal());
        if(hasil<87.5) {
            System.out.println("Maaf, " + nama + " dinyatakan TIDAK LULUS di Beasiswa Mahasiswa");
        } else if(hasil>=87.5 && hasil<=100) {
            System.out.println("Selamat, " + nama + " dinyatakan LULUS di Beasiswa Mahasiswa");
        }
    }

    private double nilaitotal() {
        return hasil = (nskj() + nrd() + nkps());
    }

    @Override
    public double nskj() {
        return nskj = nskj*60/100;
    }

    @Override
    public double nrd() {
        return nrd = nrd*25/100;
    }

    @Override
    public double nkps() {
        return nkps = nkps*15/100;
    }

    @Override
    public void hasil() {
        keterangan();
    }
}
