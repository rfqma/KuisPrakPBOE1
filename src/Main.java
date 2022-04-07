import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nske=0, ntv=0, nkdt=0, nskj=0, nrd=0, nkps=0, hasil=0;
        boolean z = true;
        double usia;
        String nama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("Selamat datang di program beasiswa Perusahaan Benang");
        System.out.println("====================================================");
        System.out.println("1. Beasiswa Pelajar     2. Beasiswa Mahasiswa");
        System.out.print("Pilihan Beasiswa : ");
        int bea = scanner.nextInt(); scanner.nextLine();

        switch(bea) {
            case 1:
                Pelajar bp = new Pelajar(nske, ntv, nkdt, hasil);
                OUTER:
                do {
                    System.out.println("+++ MENU +++");
                    System.out.println("1. Tampilkan Hasil");
                    System.out.println("2. Ubah Nilai");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih: ");
                    int pilih = scanner.nextInt();
                    scanner.nextLine();

                    switch(pilih) {
                        case 1:
                          bp.hasil();
                          System.out.println(" ");
                        break;
                        case 2:
                            System.out.println("--- EDIT NILAI ---");

                            System.out.print("Nilai Struktur dan Konten Esai: ");
                            nske = scanner.nextDouble(); scanner.nextLine();
                            System.out.print("Nilai Teknik Visualisasi: ");
                            ntv = scanner.nextDouble(); scanner.nextLine();
                            System.out.print("Nilai kemampuan Design Thinking");
                            nkdt = scanner.nextDouble(); scanner.nextLine();
                        break;
                        case 3:
                            System.exit(0);
                        default:
                            System.out.println("Data tidak ditemukan!");
                        break;
                    }

                } while (z=true);
            break;

            case 2:
                Mahasiswa mahasiswa = new Mahasiswa(nskj, nrd, nkps, hasil);
                OUTER:
                do {
                    System.out.println("+++ MENU +++");
                    System.out.println("1. Tampilkan Hasil");
                    System.out.println("2. Ubah Nilai");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih: ");
                    int pilih = scanner.nextInt();
                    scanner.nextLine();

                    switch(pilih) {
                        case 1:
                            mahasiswa.hasil();
                            System.out.println(" ");
                        break;
                        case 2:
                            System.out.println("--- EDIT NILAI ---");

                            System.out.print("Nilai Struktur dan Konten Jurnal: ");
                            nskj = scanner.nextDouble(); scanner.nextLine();
                            System.out.print("Nilai Relevansi Data: ");
                            nrd = scanner.nextDouble(); scanner.nextLine();
                            System.out.print("Nilai Kemampuan Problem Solving: ");
                            nkps = scanner.nextDouble(); scanner.nextLine();
                        break;
                        case 3:
                            System.exit(0);
                        default:
                            System.out.println("Data tidak ditemukan!");
                        break;
                    }

                } while (z=true);
            break;

            default:
                System.out.println("Input yang dimasukkan salah!");
            break;
        }
    }
}
