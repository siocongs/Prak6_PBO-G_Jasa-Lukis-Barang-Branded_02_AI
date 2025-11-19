package jasalukis;

public class JasaLukis {
    private String namaJasa;
    private String alamat;
    private String[] daftarBarang;

    public JasaLukis(String namaJasa, String alamat, String[] daftarBarang) {
        this.namaJasa = namaJasa;
        this.alamat = alamat;
        this.daftarBarang = daftarBarang;
    }

    public void tampilkanInfoJasa() {
        System.out.println("===== INFO JASA LUKIS =====");
        System.out.println("Nama Jasa   : " + namaJasa);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Barang yang bisa dilukis:");
        for (String barang : daftarBarang) {
            System.out.println("- " + barang);
        }
        System.out.println("============================");
    }
    
    public Pemesanan buatPemesanan(String nama, String barang, double hargaDasar, double ongkos) {
        return new Pemesanan(this, nama, barang, hargaDasar, ongkos);
    }

    public String getNamaJasa() { return namaJasa; }
    public String getAlamat() { return alamat; }
}
