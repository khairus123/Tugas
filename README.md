##Aplikasi Pembayaran dengan Diskon (Java OOP)
Deskripsi Program

Program ini merupakan aplikasi sederhana untuk menghitung total pembayaran barang dengan diskon menggunakan konsep OOP (Object-Oriented Programming) di Java. Program ini menggunakan:

Class Pembeli untuk menyimpan data pembeli dan barang

Interface DapatMencetak untuk mendefinisikan kemampuan mencetak nota

Konstanta HARGA dan DISKON di class PembayaranApp

Metode perhitungan total dan diskon sebagai implementasi fitur bisnis

Program akan menampilkan struk pembelian lengkap dengan nama pembeli, barang, harga sebelum diskon, diskon dalam persen, dan total yang harus dibayar.

##Fitur Utama

✅ Menggunakan konsep OOP (class, object, interface)
✅ Menggunakan konstanta (final) untuk nilai tetap
✅ Memisahkan logika bisnis dalam method terpisah (hitungTotal, hitungDiskon)
✅ Mencetak nota pembelian otomatis

##Struktur Kode
PembayaranApp.java      → Class utama, menjalankan program
Pembeli.java            → Class model penyimpanan data
DapatMencetak.java      → Interface untuk kemampuan mencetak

##Cara Kerja Program

Membuat objek Pembeli

Mengisi atribut pembeli (nama, barang, harga, diskon)

Menghitung diskon dan total bayar menggunakan metode khusus

Menampilkan struk pembelian

##Contoh Output Program
=== Struk Pembelian ===
Nama Pembeli : Ria
Barang       : notebook
Harga        : 8500000.0
Diskon       : 10.0%
Total Bayar  : 7650000.0
Terima kasih telah berbelanja!

##Penjelasan Konsep yang Digunakan
Konsep OOP	Implementasi
Class	Pembeli, PembayaranApp
Object	Objek pembeli dibuat dari class Pembeli
Interface	DapatMencetak untuk fitur cetak nota
Encapsulation	Menggunakan private + getter/setter
Constant	public static final untuk harga dan diskon

##Metode Penting dalam Program
private static double hitungTotal(Pembeli pembeli) {
    return pembeli.getHarga() - (pembeli.getHarga() * pembeli.getDiskon());
}

private static double hitungDiskon(Pembeli pembeli) {
    return pembeli.getDiskon() * 100;
}

##Cara Menjalankan Program

Pastikan Anda menggunakan Java 8 atau lebih baru

Simpan file .java sesuai struktur class di atas

Compile dan jalankan:

javac PembayaranApp.java
java PembayaranApp

##Pengembangan Lanjutan (Opsional)

Input data menggunakan Scanner agar dinamis

Tambahkan fitur pembayaran (tunai, QRIS, kartu)

Ekspor nota ke file .txt atau .pdf
