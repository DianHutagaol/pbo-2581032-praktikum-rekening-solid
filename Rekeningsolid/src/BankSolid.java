public class BankSolid {
    public static void main(String[] args) {
        Tabungan ani = new Tabungan("101", "Ani", 1000000, 0.025, 0);
        Tabungan citra = new Tabungan("102", "Citra", 300000, 0.020, 5000);
        Giro budi = new Giro("201", "Budi", 200000, 500000);
        Deposito dewi = new Deposito("301", "Dewi", 5000000);

        Rekening[] semua = { ani, citra, budi, dewi };
        BerBunga[] berbunga = { ani, citra, dewi };

        LaporanBank laporan = new LaporanBank();
        ProsesAkhirBulan proses = new ProsesAkhirBulan();

        laporan.cetakDaftar("REKENING AWAL", semua);

        System.out.println("\n========== AKHIR BULAN ==========");
        proses.potongBiayaAdmin(semua);
        proses.tambahBunga(berbunga);
        proses.autodebet(semua, 50000);

        System.out.println();
        laporan.cetakDaftar("REKENING AKHIR", semua);
        laporan.cetakTotal(semua);
    }
}