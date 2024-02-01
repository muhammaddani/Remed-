public class Transaksi { //superclass
private String namaPelanggan; 
private String noHp;
protected int hargaBarang = 5000;
protected int berat;
protected int transactionID;
private String namaLaundry = "Noar Laundry";
private String alamat;
protected String kasir = " Dani ";


    public Transaksi (String namaPelanggan, String noHp, String alamat, int berat) { //constructor
        this.namaPelanggan = namaPelanggan; 
        this.noHp = noHp;
        this.alamat = alamat;
        this.berat = berat;
    }

    public Transaksi() { //constructor
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    
    public int getBerat() {
        return berat;
    }


    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }


    public void tampilkanDetailTransaksi() {
        System.out.println("INVOICE");
        System.out.println("---------------------------");
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("No HP\t\t: " + noHp);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("Berat\t\t: " + berat + "kg");
      
    }
}