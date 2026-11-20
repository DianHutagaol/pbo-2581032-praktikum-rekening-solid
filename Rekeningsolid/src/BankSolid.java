public class BankSolid {
    public static void main(String[] args) {
        Tabungan ani = new Tabungan("101", "Ani", 1000000);
        Giro budi = new Giro("102", "Budi", 2000000);
        Tabungan citra = new Tabungan("103", "Citra", 3000000);
        Deposito dewi = new Deposito("301", "Dewi", 5000000);

        Rekening[] semua = { ani, budi, citra, dewi };
        BerBunga[] berbunga = { ani, citra, dewi };

        LaporanBank laporan = new LaporanBank();
        ProsesAkhirBulan proses = new ProsesAkhirBulan();

        laporan.cetakDaftar("DAFTAR REKENING AWAL", semua);

        System.out.println("\n--- PROSES AKHIR BULAN ---");
        proses.potongBiayaAdmin(semua);
        proses.tambahBunga(berbunga);
        proses.autodebet(semua, 50000);

        System.out.println();
        laporan.cetakDaftar("DAFTAR REKENING AKHIR BULAN", semua);
        laporan.cetakTotal(semua);
    }
}