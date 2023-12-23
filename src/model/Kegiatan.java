package model;

public class Kegiatan {

    private String idKegiatan;
    private String namaKegiatan;
    private boolean Ada;

    public String getIdKegiatan() {
        return idKegiatan;
    }

    public Kegiatan setIdKegiatan(String idKegiatan) {
        this.idKegiatan = idKegiatan;
        return this;
    }

    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public Kegiatan setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
        return this;
    }

    public boolean isAda() {
        return Ada;
    }

    public Kegiatan setAda(boolean Ada) {
        this.Ada = Ada;
        return this;
    }
}
