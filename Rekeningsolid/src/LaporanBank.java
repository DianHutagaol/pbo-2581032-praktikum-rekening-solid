public class LaporanBank {
    public void cetakDaftar(String judul, Rekening[] daftar) {
        System.out.println("========== " + judul + " ==========");
        for (Rekening r : daftar) {
            String saldoStr = String.format("Rp%,d", (long)r.getSaldo()).replace(',', '.');
            System.out.printf("%-3s | %-8s | %13s\n", r.getNomorRekening(), r.getNamaPemilik(), saldoStr);
            System.out.println("      " + r.keterangan());
        }
    }

    public void cetakTotal(Rekening[] daftar) {
        double total = 0;
        for (Rekening r : daftar) {
            total += r.getSaldo();
        }
        System.out.println("-----------------------------------");
        String totalStr = String.format("Rp%,d", (long)total).replace(',', '.');
        System.out.println("Total dana bank : " + totalStr);
    }
}