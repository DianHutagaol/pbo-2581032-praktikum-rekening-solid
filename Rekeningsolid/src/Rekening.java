// Kontrak tarik: true kalau berhasil, false kalau gagal; tidak pernah melempar exception [1].
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

    public abstract String keterangan();
    public abstract double hitungBiayaAdmin();

    public void potongAdmin(double biaya) {
        this.saldo -= biaya;
    }

    public boolean tarik(double jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }
}