public class Deposito extends Rekening implements BerBunga {
    private double sukuBunga = 0.04; // 4.0%

    public Deposito(String nomorRekening, String namaPemilik, double saldo) {
        super(nomorRekening, namaPemilik, saldo);
    }

    @Override
    public String keterangan() {
        return "Deposito, bunga 4.0% per bulan";
    }

    @Override
    public void tambahBunga() {
        saldo += saldo * sukuBunga;
    }

    @Override
    public void potongAdmin(double biaya) {
        // Deposito tidak dikenakan biaya admin
    }

    /*
     * Versi melanggar LSP (dijalankan pada tahap pengujian):
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
        // Perbaikan patuh kontrak LSP (tidak pernah melempar exception)
        return false;
    }
}