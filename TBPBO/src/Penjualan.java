public class Penjualan extends Transaksi implements IBayar { //subclass dan implementasi interface

    public Penjualan(String namaPelanggan, String noHp, String alamat, int berat) { //constructor
        super (namaPelanggan, noHp, alamat, berat);
    }

    @Override
    public int hitungTotalBayar() { //perhitungan matematika
        return hargaBarang * getBerat();
    }


    @Override
    public void tampilkanDetailTransaksi() {
        super.tampilkanDetailTransaksi();

        System.out.println("Total Bayar\t: " + hitungTotalBayar());
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("Kasir\t\t: " + kasir.trim()); //manipulasi method string
    }

    public int getTransactionID() {
        return transactionID;
    }

}
