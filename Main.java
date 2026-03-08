import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String cekKelulusan() {
        return (ipk >= 3.00) ? "Lulus" : "Belum Lulus";
    }

    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f\n", ipk);
        System.out.println("Status: " + cekKelulusan());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = {
                new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75),
                new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40),
                new Mahasiswa("Cindy Claudia", "2440003", "Desain Komunikasi Visual", 3.85),
                new Mahasiswa("Doni Darmawan", "2440004", "Akuntansi", 3.20),
                new Mahasiswa("Elisa Putri", "2440005", "Psikologi", 3.65)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String searchNim = scanner.nextLine();

        Mahasiswa target = null;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.nim.equals(searchNim)) {
                target = m;
                break;
            }
        }

        if (target != null) {
            System.out.print("Masukkan IPK baru: ");
            double ipkBaru = scanner.nextDouble();

            target.updateIpk(ipkBaru);
            System.out.println("Data berhasil diperbarui!");
            System.out.println();
            System.out.println("=== Data Mahasiswa ===");
            target.tampilkanInfo();
        } else {
            System.out.println("Data mahasiswa dengan NIM " + searchNim + " tidak ditemukan.");
        }

        scanner.close();
    }
}