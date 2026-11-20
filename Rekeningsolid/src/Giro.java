public class Giro extends Rekening {
    public Giro(String nomorRekening, String namaPemilik, double saldo) {
        super(nomorRekening, namaPemilik, saldo);
    }

    @Override
    public String keterangan() {
        return "Giro, tanpa bunga";
    }
}