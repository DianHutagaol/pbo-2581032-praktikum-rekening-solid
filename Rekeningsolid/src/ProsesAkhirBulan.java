public class ProsesAkhirBulan {
    public void potongBiayaAdmin(Rekening[] daftar) {
        for (Rekening r : daftar) {
            double admin = r.hitungBiayaAdmin();
            r.potongAdmin(admin);
            String nominal = "Rp" + String.format("%,d", (long)admin).replace(',', '.');
            System.out.printf("%-3s biaya admin  : %s\n", r.getNomorRekening(), nominal);
        }
    }

    public void tambahBunga(BerBunga[] daftar) {
        for (BerBunga b : daftar) {
            double bunga = b.hitungBunga();
            b.tambahBunga();
            Rekening r = (Rekening) b;
            String nominal = "Rp" + String.format("%,d", (long)bunga).replace(',', '.');
            System.out.printf("%-3s bunga        : %s\n", r.getNomorRekening(), nominal);
        }
    }

    public void autodebet(Rekening[] daftar, int premi) {
        for (Rekening r : daftar) {
            boolean berhasil = r.tarik(premi);
            if (berhasil) {
                String nominal = "Rp" + String.format("%,d", premi).replace(',', '.');
                System.out.printf("%-3s autodebet    : %s\n", r.getNomorRekening(), nominal);
            } else {
                System.out.printf("%-3s autodebet    : gagal\n", r.getNomorRekening());
            }
        }
    }
}