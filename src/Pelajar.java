import java.util.Scanner;

public class Pelajar extends Kategori implements Hitung{

    public Pelajar(String nama, double nske, double ntv, double nkdt) {
        this.nama = nama;
        this.nske = nske;
        this.ntv = ntv;
        this.nkdt = nkdt;
    }

    public Pelajar() {

    }


    @Override
    public void hitungNilai() {
        double nilai;

        nilai = (double) ((0.5*this.nske) + (0.2*this.ntv) + (0.3*this.nkdt));

        this.nilai = nilai;
    }

    @Override
    public void editNilai(double a, double b, double c) {
        this.nske = nske;
        this.ntv = ntv;
        this.nkdt = nkdt;
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

    public void setNske(double nske) {
        this.nske = nske;
    }

    public void setNtv(double ntv) {
        this.ntv = ntv;
    }

    public void setNkdt(double nkdt) {
        this.nkdt = nkdt;
    }
}
