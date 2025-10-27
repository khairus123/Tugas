
public class PembayaranApp {
    public static final double DISKON = 0.1;
    public static final int HARGA = 8500000;

    public static void main(String[] args) {
        Pembeli pembeli = new Pembeli();
        pembeli.setNama("Ria");
        pembeli.setBarang("notebook");
        pembeli.setHarga(HARGA);
        pembeli.setDiskon(DISKON);


        double total = hitungTotal(pembeli);
        System.out.println("=== Struk Pembelian ===");
        System.out.println("Nama Pembeli : " + pembeli.getNama());
        System.out.println("Barang       : " + pembeli.getBarang());
        System.out.println("Harga        : " + pembeli.getHarga());
        System.out.println("Diskon       : " + hitungDiskon(pembeli) + "%");
        System.out.println("Total Bayar  : " + total);

        pembeli.cetakNota();
    }

    private static double hitungTotal(Pembeli pembeli) {
        return pembeli.getHarga() - (pembeli.getHarga() * pembeli.getDiskon());
    }

    private static double hitungDiskon(Pembeli pembeli) {
        return pembeli.getDiskon() * 100;
    }
}