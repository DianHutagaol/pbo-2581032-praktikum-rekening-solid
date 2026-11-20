public class Deposito extends Rekening implements BerBunga {
    private double sukuBunga = 0.04;

    public Deposito(String nomorRekening, String namaPemilik, double saldo) {
        super(nomorRekening, namaPemilik, saldo);
    }

    @Override
    public String keterangan() {
        return "Deposito, bunga 4.0% per bulan";
    }

    @Override
    public double hitungBiayaAdmin() {
        return 0;
    }

    @Override
    public double hitungBunga() {
        return saldo * sukuBunga;
    }

    @Override
    public void tambahBunga() {
        saldo += hitungBunga();
    }

    /*
     * Versi melanggar LSP pada tahap pengujian [1]:
     * @Override
     * public boolean tarik(double jumlah) {
     *     throw new UnsupportedOperationException("Deposito tidak bisa ditarik");
     * }
     *
     * Bukti eksekusi kesalahan:
     * Exception in thread "main" java.lang.UnsupportedOperationException: Deposito tidak bisa ditarik
     */

    @Override
    public boolean tarik(double jumlah) {
        // Perbaikan patuh kontrak LSP ( return false jika tidak bisa ditarik ) [1]
        return false;
    }
}