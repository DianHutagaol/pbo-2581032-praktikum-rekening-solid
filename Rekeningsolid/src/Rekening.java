public abstract class Rekening {
    protected String nomorRekening;
    protected String namaPemilik;
    protected double saldo;

    public Rekening(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public String getNomorRekening() { return nomorRekening; }
    public String getNamaPemilik() { return namaPemilik; }
    public double getSaldo() { return saldo; }

    // Menggantikan cetakInfo()
    public abstract String keterangan();

    public void potongAdmin(double biaya) {
        this.saldo -= biaya;
    }
}