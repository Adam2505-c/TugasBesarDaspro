package model;

public class Ruangan {
    private String idRuangan;
    private String namaRuangan;
    private boolean Ada;

    public String getIdRuangan() {
        return idRuangan;
    }
    public Ruangan setIdRuangan(String idRuangan) {
        this.idRuangan = idRuangan;
        return this;
    }
    public String getNamaRuangan() {
        return namaRuangan;
    }
    public Ruangan setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
        return this;
    }
    public boolean isAda() {
        return Ada;
    }
    public Ruangan setAda(boolean Ada) {
        this.Ada = Ada;
        return this;
    }
}