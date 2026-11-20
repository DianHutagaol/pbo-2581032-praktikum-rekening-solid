public class Tabungan extends Rekening implements BerBunga {
    private double sukuBunga;
    private double biayaAdmin;

    public Tabungan(String nomorRekening, String namaPemilik, double saldo, double sukuBunga, double biayaAdmin) {
        super(nomorRekening, namaPemilik, saldo);
        this.sukuBunga = sukuBunga;
        this.biayaAdmin = biayaAdmin;
    }

    @Override
    public String keterangan() {
        return "Tabungan, bunga " + String.format("%.1f", sukuBunga * 100).replace(',', '.') + "% per bulan";
    }

    @Override
    public double hitungBiayaAdmin() {
        return biayaAdmin;
    }

    @Override
    public double hitungBunga() {
        return saldo * sukuBunga;
    }

    @Override
    public void tambahBunga() {
        saldo += hitungBunga();
    }
}