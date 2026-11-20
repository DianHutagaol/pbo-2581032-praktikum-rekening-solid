public class Tabungan extends Rekening implements BerBunga {
    private double sukuBunga = 0.025; // 2.5%

    public Tabungan(String nomorRekening, String namaPemilik, double saldo) {
        super(nomorRekening, namaPemilik, saldo);
    }

    @Override
    public String keterangan() {
        return "Tabungan, bunga 2.5% per bulan";
    }

    @Override
    public void tambahBunga() {
        saldo += saldo * sukuBunga;
    }
}