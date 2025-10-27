class Pembeli implements DapatMencetak {
    private String nama;
    private String barang;
    private double harga;
    private double diskon;


    @Override
    public void cetakNota() {
        System.out.println("Terima kasih telah berbelanja!");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
}