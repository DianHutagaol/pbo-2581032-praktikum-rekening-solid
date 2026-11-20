public class LaporanBank {
    public void cetakDaftar(String judul, Rekening[] daftar) {
        System.out.println("=== " + judul + " ===");
        for (Rekening r : daftar) {
            String saldoStr = String.format("Rp%,d", (long)r.getSaldo()).replace(',', '.');
            System.out.println(r.getNomorRekening() + " | " + r.getNamaPemilik() + " | Saldo: " + saldoStr + " | " + r.keterangan());
        }
    }

    public void cetakTotal(Rekening[] daftar) {
        double total = 0;
        for (Rekening r : daftar) {
            total += r.getSaldo();
        }
        String totalStr = String.format("Rp%,d", (long)total).replace(',', '.');
        System.out.println("Total Saldo Seluruh Rekening: " + totalStr);
    }
}