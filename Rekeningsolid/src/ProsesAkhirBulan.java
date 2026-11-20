public class ProsesAkhirBulan {
    public void potongBiayaAdmin(Rekening[] daftar) {
        for (Rekening r : daftar) {
            r.potongAdmin(10000);
            System.out.println("Potong admin " + r.getNamaPemilik() + ": Saldo menjadi Rp" + String.format("%,d", (long)r.getSaldo()).replace(',', '.'));
        }
    }

    public void tambahBunga(BerBunga[] daftar) {
        for (BerBunga b : daftar) {
            b.tambahBunga();
            Rekening r = (Rekening) b;
            System.out.println("Tambah bunga " + r.getNamaPemilik() + ": Saldo menjadi Rp" + String.format("%,d", (long)r.getSaldo()).replace(',', '.'));
        }
    }
}