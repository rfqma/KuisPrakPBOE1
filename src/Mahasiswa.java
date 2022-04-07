import java.util.Scanner;

public class Mahasiswa extends Kategori implements Hitung {

    public Mahasiswa() {

    }

    @Override
    public void hitungNilai() {
        double nilai;

        nilai = (double) ((0.6*this.nskj) + (0.25*this.nrd) + (0.15*this.nkps));

        this.nilai = nilai;
    }

    @Override
    public void editNilai(double a, double b, double c) {
        this.nskj = nskj;
        this.nrd = nrd;
        this.nkps = nkps;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNskj(double nskj) {
        this.nskj = nskj;
    }

    public void setNrd(double nrd) {
        this.nrd = nrd;
    }

    public void setNkps(double nkps) {
        this.nkps = nkps;
    }
}
