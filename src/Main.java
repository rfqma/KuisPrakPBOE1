import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int formulir, menu, bea, usia;
        boolean ulangi = true;
        System.out.println(" ");
        System.out.println("====================================================");
        System.out.println("Selamat datang di program beasiswa Perusahaan Benang");
        System.out.println("====================================================");
        System.out.println("HANYA DIPERUNTUKKAN BAGI YANG BERUSIA 16-24 TAHUN!");
        System.out.print("Berapa usia anda? : ");
        usia = scanner.nextInt(); scanner.nextLine();
        System.out.println(" ");
        System.out.println("Pilih Kategori Beasiswa: ");
        System.out.println("1. Beasiswa Pelajar     2. Beasiswa Mahasiswa");
        System.out.print("Pilihan: ");
        bea = scanner.nextInt(); scanner.nextLine();
        System.out.println(" ");

        if (usia>=16 && usia<=24) {

                    switch (bea) {
                        case 1:
                            Pelajar pel = new Pelajar();
                            Scanner pel1 = new Scanner(System.in);

                            System.out.println("=== FORM PENDAFTARAN ===");
                            System.out.print("Nama : ");
                            pel.setNama(pel1.nextLine());

                            editPel(pel,scanner);

                            while (ulangi) {
                                System.out.println("Menu");
                                System.out.println("1. Edit Nilai");
                                System.out.println("2. Tampilkan Nilai");
                                System.out.println("3. Exit");
                                System.out.print("Pilih : ");
                                menu = scanner.nextInt();

                                switch (menu) {
                                    case 1:
                                        System.out.println("=== EDIT ===");
                                        editPel(pel,scanner);
                                        break;
                                    case 2:
                                        hasilPel(pel);
                                        break;
                                    case 3:
                                        ulangi=false;
                                        break;
                                }
                            }
                            break;

                        case 2:
                            Mahasiswa mhs = new Mahasiswa();
                            Scanner mhs1 = new Scanner(System.in);

                            System.out.println("=== FORM PENDAFTARAN ===");
                            System.out.print("Nama : ");
                            mhs.setNama(mhs1.nextLine());

                            editMhs(mhs,scanner);

                            while (ulangi) {
                                System.out.println("Menu");
                                System.out.println("1. Edit Nilai");
                                System.out.println("2. Tampilkan Nilai");
                                System.out.println("3. Exit");
                                System.out.print("Pilih : ");
                                menu = scanner.nextInt();

                                switch (menu) {
                                    case 1:
                                        System.out.println("=== EDIT ===");
                                        editMhs(mhs,scanner);
                                        break;
                                    case 2:
                                        hasilMhs(mhs);
                                        break;
                                    case 3:
                                        ulangi=false;
                                        break;
                                }
                            }
                            break;
                    }

        } else {
            System.out.println("Usia anda tidak mencukupi persyaratan!");
        }
    }

    public static void editPel(Pelajar pel, Scanner scanner) {
        System.out.println("---------------------------");
        System.out.print("Nilai Struktur dan Konten Esai: ");
        pel.setNske(scanner.nextDouble());
        System.out.print("Nilai Teknik Visualisasi: ");
        pel.setNtv(scanner.nextDouble());
        System.out.print("Nilai Kemampuan Design Thinking: ");
        pel.setNkdt(scanner.nextDouble());
    }

    public static void hasilPel(Pelajar pel) {

        pel.hitungNilai();

        System.out.println("Nilai Akhir: " + pel.getNilai());
        if (pel.getNilai()>=87.5) {
            System.out.println("Status: LOLOS");
            System.out.println("Selamat kepada " + pel.getNama() + " telah lolos seleksi Beasiswa Pelajar");
        } else {
            System.out.println("Status: TIDAK LOLOS");
            System.out.println("Mohon Maaf " + pel.getNama() + " coba lagi di lain kesempatan");
        }
    }

    public static void editMhs(Mahasiswa mhs, Scanner scanner) {
        System.out.println("---------------------------");
        System.out.print("Nilai Struktur dan Konten Jurnal: ");
        mhs.setNskj(scanner.nextDouble());
        System.out.print("Nilai Relevansi Data: ");
        mhs.setNrd(scanner.nextDouble());
        System.out.print("Nilai Kemampuan Problem Solving: ");
        mhs.setNkps(scanner.nextDouble());
    }

    public static void hasilMhs(Mahasiswa mhs) {
        mhs.hitungNilai();

        System.out.println("Nilai Akhir: " + mhs.getNilai());
        if (mhs.getNilai()>=87.5) {
            System.out.println("Status: LOLOS");
            System.out.println("Selamat kepada " + mhs.getNama() + " telah lolos seleksi Beasiswa Mahasiswa");
        } else {
            System.out.println("Status: TIDAK LOLOS");
            System.out.println("Mohon Maaf " + mhs.getNama() + " coba lagi di lain kesempatan");
        }
    }
}
