package model;
import java.time.LocalDate;
import java.util.ArrayList;

public class DetilPenjualan {
    private String idDetilPenjualan;
    private Makanan Makanan;
    private int hargaJual;
    private int jumlahBeli;
    private int subTotal;
    private String idPenjualan;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetilPenjualan> detilPenjualans;
    
    
    public ArrayList<DetilPenjualan> getDetilPenjualans() {
        return detilPenjualans;
    }
    public DetilPenjualan setDetilPenjualan(ArrayList<DetilPenjualan> detilPenjualans) {
        this.detilPenjualans = detilPenjualans;
        return this;
    }

    public String getIdPenjualan() {
        return idPenjualan;
    }

    public DetilPenjualan setIdPenjualan(String idPenjualan) {
        this.idPenjualan = idPenjualan;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public DetilPenjualan setTotal(int total) {
        this.total = total;
        return this;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public DetilPenjualan setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    /**
     * @return String return the idDetilPenjualan
     */
    public String getIdDetilPenjualan() {
        return idDetilPenjualan;
    }

    /**
     * @param idDetilPenjualan the idDetilPenjualan to set
     */
    public DetilPenjualan setIdDetilPenjualan(String idDetilPenjualan) {
        this.idDetilPenjualan = idDetilPenjualan;
        return this;
    }

    /**
     * @return Penjualan return the penjualan
     */
   

    /**
     * @return Barang return the barang
     */
    public Makanan getMakanan() {
        return Makanan;
    }

    /**
     * @param barang the barang to set
     */
    public DetilPenjualan setMakanan(Makanan makanan) {
        this.Makanan = makanan;
        return this;
    }

    /**
     * @return int return the hargaJual
     */
    public int getHargaJual() {
        return hargaJual;
    }

    /**
     * @param hargaJual the hargaJual to set
     */
    public DetilPenjualan setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
        return this;
    }

    /**
     * @return int return the jumlahBeli
     */
    public int getJumlahBeli() {
        return jumlahBeli;
    }

    /**
     * @param jumlahBeli the jumlahBeli to set
     */
    public DetilPenjualan setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
        return this;
    }

    /**
     * @return int return the subTotal
     */
    public int getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public DetilPenjualan setSubTotal(int subTotal) {
        this.subTotal = subTotal;
        return this;
    }

}
