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
    public void tambahBunga() {
        saldo += saldo * sukuBunga;
    }

    @Override
    public void potongAdmin(double biaya) {
        // Deposito tidak dikenakan biaya admin
    }
}