class BarangBeraksi{
    public static void main(String[]args){
        Barang brg = new Barang();
        brg.setKode("001");
        brg.setNamaBarang("Beras");
        brg.setHarga(1500000);

        brg.tampil_barang();

        Barang brg1 = new Barang("002","Telur",200000);
        brg.tampil_barang();
    } 
}