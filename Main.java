class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f\n\n", ipk);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Data Mahasiswa ===");

        Mahasiswa m1 = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        Mahasiswa m2 = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        Mahasiswa m3 = new Mahasiswa("Cindy Claudia", "2440003", "Desain Komunikasi Visual", 3.85);
        Mahasiswa m4 = new Mahasiswa("Doni Darmawan", "2440004", "Akuntansi", 3.20);
        Mahasiswa m5 = new Mahasiswa("Elisa Putri", "2440005", "Psikologi", 3.65);

        m1.tampilkanInfo();
        m2.tampilkanInfo();
        m3.tampilkanInfo();
        m4.tampilkanInfo();
        m5.tampilkanInfo();
    }
}