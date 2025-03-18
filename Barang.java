 public class Barang {
    private String kode;
    private String nama_barang;
    private int harga;

    public Barang(){
        
    }

    public Barang(String kode,String nama_barang,int harga){
        this.kode = kode;
        this.nama_barang = nama_barang;
        this.harga = harga;
    }

    void setKode(String kode){
        this.kode = kode;
    }

    void setNamaBarang(String nama_barang){
        this.nama_barang = nama_barang;
    }
    
    void setHarga(int harga){
        this.harga = harga;
    }

    void tampil_barang(){
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+nama_barang);
        System.out.println("Kode Barang : "+harga);
    }
 }