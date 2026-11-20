public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro(String nomorRekening, String namaPemilik, double saldo, int batasOverdraft) {
        super(nomorRekening, namaPemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public String keterangan() {
        return "Giro, batas overdraft Rp" + String.format("%,d", batasOverdraft).replace(',', '.');
    }

    @Override
    public double hitungBiayaAdmin() {
        return 15000;
    }
}