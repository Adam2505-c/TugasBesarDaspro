package controller;
import java.util.HashMap;

import model.*;

public class GameControllerEN {
    HashMap<String, Barang> barangs = new HashMap<String, Barang>();
    HashMap<String, Karakter> karakters = new HashMap<String, Karakter>();
    HashMap<String, Kegiatan> kegiatans = new HashMap<String, Kegiatan>();
    HashMap<String, Makanan> makanans = new HashMap<String, Makanan>();
    HashMap<String, Ruangan> ruangans = new HashMap<String, Ruangan>();
    
    public void name() {
        Barang barang1 = new Barang();
        Barang barang2 = new Barang();
        Barang barang3 = new Barang();
        Barang barang4 = new Barang();
        Barang barang5 = new Barang();
        Barang barang6 = new Barang();
        Barang barang7 = new Barang();
        Barang barang8 = new Barang();
        Barang barang9 = new Barang();
        Barang barang10 = new Barang();
        Barang barang11 = new Barang();
        Barang barang12 = new Barang();
        Barang barang13 = new Barang();
        Barang barang14 = new Barang();
        Barang barang15 = new Barang();
        Barang barang16 = new Barang();
        Barang barang17 = new Barang();
        Barang barang18 = new Barang();
        Barang barang19 = new Barang();
        Barang barang20 = new Barang();
        Barang barang21 = new Barang();
        Barang barang22 = new Barang();
        Barang barang23 = new Barang();
        Barang barang24 = new Barang();
        Barang barang25 = new Barang();
        Barang barang26 = new Barang();

        barang1
                .setIdBarang("01")
                .setNamaBarang("Matras")
                .setHargaBarang(300000)
                .setAda(true);
        barang2
                .setNamaBarang("Laptop")
                .setIdBarang("02")
                .setHargaBarang(5000000)
                .setAda(true);
        barang3
                .setNamaBarang("Sabun")
                .setIdBarang("03")
                .setHargaBarang(3500)
                .setAda(true);
        barang4
                .setIdBarang("04")
                .setNamaBarang("Dispenser")
                .setHargaBarang(600000)
                .setAda(true);
        barang5
                .setIdBarang("05")
                .setNamaBarang("Router")
                .setHargaBarang(100000)
                .setAda(true);
        barang6
                .setNamaBarang("Pomade")
                .setIdBarang("06")
                .setHargaBarang(50000)
                .setAda(true);
        barang7
                .setNamaBarang("Selimut")
                .setIdBarang("07")
                .setHargaBarang(50000)
                .setAda(true);
        barang8
                .setIdBarang("08")
                .setNamaBarang("Baju Kaos")
                .setHargaBarang(90000)
                .setAda(true);
        barang9
                .setIdBarang("09")
                .setNamaBarang("Baju Casual")
                .setHargaBarang(120000)
                .setAda(true);
        barang10
                .setNamaBarang("Baju Kemeja")
                .setIdBarang("10")
                .setHargaBarang(175000)
                .setAda(true);
        barang11
                .setNamaBarang("Baju Jas")
                .setIdBarang("11")
                .setHargaBarang(250000)
                .setAda(true);
        barang12
                .setIdBarang("12")
                .setNamaBarang("Baju Tidur")
                .setHargaBarang(130000)
                .setAda(true);
        barang13
                .setIdBarang("13")
                .setNamaBarang("Jas Almet")
                .setHargaBarang(100000)
                .setAda(true);
        barang14
                .setNamaBarang("Jaket Polos")
                .setIdBarang("14")
                .setHargaBarang(125000)
                .setAda(true);
        barang15
                .setNamaBarang("Celana Casual")
                .setIdBarang("15")
                .setHargaBarang(95000)
                .setAda(true);
        barang16
                .setIdBarang("16")
                .setNamaBarang("Celana Tidur")
                .setHargaBarang(85000)
                .setAda(true);
        barang17
                .setIdBarang("17")
                .setNamaBarang("Celana Jas")
                .setHargaBarang(150000)
                .setAda(true);
        barang18
                .setNamaBarang("Uang")
                .setIdBarang("18")
                .setHargaBarang(1)
                .setAda(true);
        barang19
                .setNamaBarang("Kursi")
                .setIdBarang("19")
                .setHargaBarang(115000)
                .setAda(true);
        barang20
                .setIdBarang("20")
                .setNamaBarang("Meja")
                .setHargaBarang(175000)
                .setAda(true);
        barang21
                .setIdBarang("21")
                .setNamaBarang("Kipas Angin")
                .setHargaBarang(80000)
                .setAda(true);
        barang22
                .setNamaBarang("AC")
                .setIdBarang("22")
                .setHargaBarang(2000000)
                .setAda(true);
        barang23
                .setNamaBarang("Tas")
                .setIdBarang("23")
                .setHargaBarang(85000)
                .setAda(true);
        barang24
                .setIdBarang("24")
                .setNamaBarang("Tas Carrier")
                .setHargaBarang(275000)
                .setAda(true);
        barang25
                .setIdBarang("25")
                .setNamaBarang("Name Tag")
                .setHargaBarang(10000)
                .setAda(true);
        barang26
                .setNamaBarang("Wastafel")
                .setIdBarang("26")
                .setHargaBarang(250000)
                .setAda(true);

        barangs.put(barang1.getIdBarang(), barang1);
        barangs.put(barang2.getIdBarang(), barang2);
        barangs.put(barang3.getIdBarang(), barang3);
        barangs.put(barang4.getIdBarang(), barang4);
        barangs.put(barang5.getIdBarang(), barang5);
        barangs.put(barang6.getIdBarang(), barang6);
        barangs.put(barang7.getIdBarang(), barang7);
        barangs.put(barang8.getIdBarang(), barang8);
        barangs.put(barang9.getIdBarang(), barang9);
        barangs.put(barang10.getIdBarang(), barang10);
        barangs.put(barang11.getIdBarang(), barang11);
        barangs.put(barang12.getIdBarang(), barang12);
        barangs.put(barang13.getIdBarang(), barang13);
        barangs.put(barang14.getIdBarang(), barang14);
        barangs.put(barang15.getIdBarang(), barang15);
        barangs.put(barang16.getIdBarang(), barang16);
        barangs.put(barang17.getIdBarang(), barang17);
        barangs.put(barang18.getIdBarang(), barang18);
        barangs.put(barang19.getIdBarang(), barang19);
        barangs.put(barang20.getIdBarang(), barang20);
        barangs.put(barang21.getIdBarang(), barang21);
        barangs.put(barang22.getIdBarang(), barang22);
        barangs.put(barang23.getIdBarang(), barang23);
        barangs.put(barang24.getIdBarang(), barang24);
        barangs.put(barang25.getIdBarang(), barang25);
        barangs.put(barang26.getIdBarang(), barang26);

        Karakter karakter1 = new Karakter();
        Karakter karakter2 = new Karakter();
        Karakter karakter3 = new Karakter();
        Karakter karakter4 = new Karakter();
        Karakter karakter5 = new Karakter();
        Karakter karakter6 = new Karakter();
        Karakter karakter7 = new Karakter();
        Karakter karakter8 = new Karakter();
        Karakter karakter9 = new Karakter();
        Karakter karakter10 = new Karakter();
        Karakter karakter11 = new Karakter();
        Karakter karakter12 = new Karakter();
        Karakter karakter13 = new Karakter();
        Karakter karakter14 = new Karakter();
        Karakter karakter15 = new Karakter();
        Karakter karakter16 = new Karakter();

        karakter1
                        .setNamaKarakter("Pemain")
                        .setIdKarakter("01")
                        .setAda(true);
        karakter2
                        .setNamaKarakter("Ibu Kos")
                        .setIdKarakter("02")
                        .setAda(true);
        karakter3
                        .setNamaKarakter("Budi")
                        .setIdKarakter("03")
                        .setAda(true);
        karakter4
                        .setNamaKarakter("Pa Agus")
                        .setIdKarakter("04")
                        .setAda(true);
        karakter5
                        .setNamaKarakter("Aliya")
                        .setIdKarakter("05")
                        .setAda(true);
        karakter6
                        .setNamaKarakter("Wahyu")
                        .setIdKarakter("06")
                        .setAda(true);
        karakter7
                        .setNamaKarakter("Veronica")
                        .setIdKarakter("07")
                        .setAda(true);
        karakter8
                        .setNamaKarakter("Bu Yanti")
                        .setIdKarakter("08")
                        .setAda(true);
        karakter9
                        .setNamaKarakter("Bu Risma")
                        .setIdKarakter("09")
                        .setAda(true);
        karakter10
                        .setNamaKarakter("Pa Ustad")
                        .setIdKarakter("10")
                        .setAda(true);
        karakter11
                        .setNamaKarakter("Farel")
                        .setIdKarakter("11")
                        .setAda(true);
        karakter12
                        .setNamaKarakter("Ami")
                        .setIdKarakter("12")
                        .setAda(true);
        karakter13
                        .setNamaKarakter("Fatimah")
                        .setIdKarakter("13")
                        .setAda(true);
        karakter14
                        .setNamaKarakter("Adi")
                        .setIdKarakter("14")
                        .setAda(true);
        karakter15
                        .setNamaKarakter("Reva")
                        .setIdKarakter("15")
                        .setAda(true);
        karakter16
                        .setNamaKarakter("Zidan")
                        .setIdKarakter("16")
                        .setAda(true);

        karakters.put(karakter1.getIdKarakter(), karakter1);
        karakters.put(karakter2.getIdKarakter(), karakter2);
        karakters.put(karakter3.getIdKarakter(), karakter3);
        karakters.put(karakter4.getIdKarakter(), karakter4);
        karakters.put(karakter5.getIdKarakter(), karakter5);
        karakters.put(karakter6.getIdKarakter(), karakter6);
        karakters.put(karakter7.getIdKarakter(), karakter7);
        karakters.put(karakter8.getIdKarakter(), karakter8);
        karakters.put(karakter9.getIdKarakter(), karakter9);
        karakters.put(karakter10.getIdKarakter(), karakter10);
        karakters.put(karakter11.getIdKarakter(), karakter11);
        karakters.put(karakter12.getIdKarakter(), karakter12);
        karakters.put(karakter13.getIdKarakter(), karakter13);
        karakters.put(karakter14.getIdKarakter(), karakter14);
        karakters.put(karakter15.getIdKarakter(), karakter15);
        karakters.put(karakter16.getIdKarakter(), karakter16);

        Kegiatan kegiatan1 = new Kegiatan();
        Kegiatan kegiatan2 = new Kegiatan();
        Kegiatan kegiatan3 = new Kegiatan();
        Kegiatan kegiatan4 = new Kegiatan();
        Kegiatan kegiatan5 = new Kegiatan();
        Kegiatan kegiatan6 = new Kegiatan();
        Kegiatan kegiatan7 = new Kegiatan();
        Kegiatan kegiatan8 = new Kegiatan();
        Kegiatan kegiatan9 = new Kegiatan();
        Kegiatan kegiatan10 = new Kegiatan();
        Kegiatan kegiatan11 = new Kegiatan();
        Kegiatan kegiatan12 = new Kegiatan();
        Kegiatan kegiatan13 = new Kegiatan();
        Kegiatan kegiatan14 = new Kegiatan();
        Kegiatan kegiatan15 = new Kegiatan();
        Kegiatan kegiatan16 = new Kegiatan();
        Kegiatan kegiatan17 = new Kegiatan();
        Kegiatan kegiatan18 = new Kegiatan();
        Kegiatan kegiatan19 = new Kegiatan();
        Kegiatan kegiatan20 = new Kegiatan();
        Kegiatan kegiatan21 = new Kegiatan();
        Kegiatan kegiatan22 = new Kegiatan();
        Kegiatan kegiatan23 = new Kegiatan();
        Kegiatan kegiatan24 = new Kegiatan();
        Kegiatan kegiatan25 = new Kegiatan();
        Kegiatan kegiatan26 = new Kegiatan();
        Kegiatan kegiatan27 = new Kegiatan();

        kegiatan1
                .setIdKegiatan("01")
                .setNamaKegiatan("Makan")
                .setAda(true);
        kegiatan2
                .setIdKegiatan("02")
                .setNamaKegiatan("Minum")
                .setAda(true);
        kegiatan3
                .setIdKegiatan("03")
                .setNamaKegiatan("Tidur")
                .setAda(true);
        kegiatan4
                .setIdKegiatan("04")
                .setNamaKegiatan("Pipis")
                .setAda(true);
        kegiatan5
                .setIdKegiatan("05")
                .setNamaKegiatan("Berak")
                .setAda(true);
        kegiatan6
                .setIdKegiatan("06")
                .setNamaKegiatan("Cuci Tangan")
                .setAda(true);
        kegiatan7
                .setIdKegiatan("07")
                .setNamaKegiatan("Mandi")
                .setAda(true);
        kegiatan8
                .setIdKegiatan("08")
                .setNamaKegiatan("Belajar")
                .setAda(true);
        kegiatan9
                .setIdKegiatan("09")
                .setNamaKegiatan("Beli")
                .setAda(true);
        kegiatan10
                .setIdKegiatan("10")
                .setNamaKegiatan("Jual")
                .setAda(true);
        kegiatan11
                .setIdKegiatan("11")
                .setNamaKegiatan("Kerja")
                .setAda(true);
        kegiatan12
                .setIdKegiatan("12")
                .setNamaKegiatan("Sapa")
                .setAda(true);
        kegiatan13
                .setIdKegiatan("13")
                .setNamaKegiatan("Ngobrol")
                .setAda(true);
        kegiatan14
                .setIdKegiatan("14")
                .setNamaKegiatan("Gosip")
                .setAda(true);
        kegiatan15
                .setIdKegiatan("15")
                .setNamaKegiatan("Pdkt")
                .setAda(true);
        kegiatan16
                .setIdKegiatan("16")
                .setNamaKegiatan("Nembak")
                .setAda(true);
        kegiatan17
                .setIdKegiatan("17")
                .setNamaKegiatan("Muji")
                .setAda(true);
        kegiatan18
                .setIdKegiatan("18")
                .setNamaKegiatan("Kasih Hadiah")
                .setAda(true);
        kegiatan19
                .setIdKegiatan("19")
                .setNamaKegiatan("Mabar")
                .setAda(true);
        kegiatan20
                .setIdKegiatan("20")
                .setNamaKegiatan("Main Game")
                .setAda(true);
        kegiatan21
                .setIdKegiatan("21")
                .setNamaKegiatan("Berjemur")
                .setAda(true);
        kegiatan22
                .setIdKegiatan("22")
                .setNamaKegiatan("Amati")
                .setAda(true);
        kegiatan23
                .setIdKegiatan("23")
                .setNamaKegiatan("Shalat")
                .setAda(true);
        kegiatan24
                .setIdKegiatan("24")
                .setNamaKegiatan("Ngaji")
                .setAda(true);
        kegiatan25
                .setIdKegiatan("25")
                .setNamaKegiatan("Bangun Tidur")
                .setAda(true);
        kegiatan26
                .setIdKegiatan("26")
                .setNamaKegiatan("Ganti Baju")
                .setAda(true);
        kegiatan27
                .setIdKegiatan("27")
                .setNamaKegiatan("Olahraga")
                .setAda(true);

        kegiatans.put(kegiatan1.getIdKegiatan(), kegiatan1);
        kegiatans.put(kegiatan2.getIdKegiatan(), kegiatan2);
        kegiatans.put(kegiatan3.getIdKegiatan(), kegiatan3);
        kegiatans.put(kegiatan4.getIdKegiatan(), kegiatan4);
        kegiatans.put(kegiatan5.getIdKegiatan(), kegiatan5);
        kegiatans.put(kegiatan6.getIdKegiatan(), kegiatan6);
        kegiatans.put(kegiatan7.getIdKegiatan(), kegiatan7);
        kegiatans.put(kegiatan8.getIdKegiatan(), kegiatan8);
        kegiatans.put(kegiatan9.getIdKegiatan(), kegiatan9);
        kegiatans.put(kegiatan10.getIdKegiatan(), kegiatan10);
        kegiatans.put(kegiatan11.getIdKegiatan(), kegiatan11);
        kegiatans.put(kegiatan12.getIdKegiatan(), kegiatan12);
        kegiatans.put(kegiatan13.getIdKegiatan(), kegiatan13);
        kegiatans.put(kegiatan14.getIdKegiatan(), kegiatan14);
        kegiatans.put(kegiatan15.getIdKegiatan(), kegiatan15);
        kegiatans.put(kegiatan16.getIdKegiatan(), kegiatan16);
        kegiatans.put(kegiatan17.getIdKegiatan(), kegiatan17);
        kegiatans.put(kegiatan18.getIdKegiatan(), kegiatan18);
        kegiatans.put(kegiatan19.getIdKegiatan(), kegiatan19);
        kegiatans.put(kegiatan20.getIdKegiatan(), kegiatan20);
        kegiatans.put(kegiatan21.getIdKegiatan(), kegiatan21);
        kegiatans.put(kegiatan22.getIdKegiatan(), kegiatan22);
        kegiatans.put(kegiatan23.getIdKegiatan(), kegiatan23);
        kegiatans.put(kegiatan24.getIdKegiatan(), kegiatan24);
        kegiatans.put(kegiatan25.getIdKegiatan(), kegiatan25);
        kegiatans.put(kegiatan26.getIdKegiatan(), kegiatan26);
        kegiatans.put(kegiatan27.getIdKegiatan(), kegiatan27);

        Makanan makanan1 = new Makanan();
        Makanan makanan2 = new Makanan();
        Makanan makanan3 = new Makanan();
        Makanan makanan4 = new Makanan();
        Makanan makanan5 = new Makanan();
        Makanan makanan6 = new Makanan();
        Makanan makanan7 = new Makanan();
        Makanan makanan8 = new Makanan();
        Makanan makanan9 = new Makanan();
        Makanan makanan10 = new Makanan();
        Makanan makanan11 = new Makanan();
        Makanan makanan12= new Makanan();
        Makanan makanan13 = new Makanan();
        Makanan makanan14 = new Makanan();
        Makanan makanan15 = new Makanan();
        Makanan makanan16 = new Makanan();
        Makanan makanan17 = new Makanan();
        Makanan makanan18 = new Makanan();
        Makanan makanan19 = new Makanan();
        Makanan makanan20 = new Makanan();

        makanan1 
                .setIdMakanan("001")
                .setNamaMakanan("Indimie")
                .setAda(true)
                .setHargaMakanan(3000);
        makanan2 
                .setIdMakanan("002")
                .setNamaMakanan("Teh balok")
                .setAda(true)
                .setHargaMakanan(1000);
        makanan3 
                .setIdMakanan("003").
                setNamaMakanan("Xuemi")
                .setAda(true)
                .setHargaMakanan(5000);
        makanan4 
                .setIdMakanan("004")
                .setNamaMakanan("Roti bakar")
                .setAda(true)
                .setHargaMakanan(7000);
        makanan5 
                .setIdMakanan("005")
                .setNamaMakanan("Seblak")
                .setAda(true)
                .setHargaMakanan(5000);
        makanan6 
                .setIdMakanan("006")
                .setNamaMakanan("Tahu bulat")
                .setAda(true)
                .setHargaMakanan(1000);
        makanan7 
                .setIdMakanan("007")
                .setNamaMakanan("Telor")
                .setAda(true)
                .setHargaMakanan(2500);
        makanan8 
                .setIdMakanan("008")
                .setNamaMakanan("Sayur")
                .setAda(true)
                .setHargaMakanan(4000); 
        makanan9 
                .setIdMakanan("009")
                .setNamaMakanan("Minyak")
                .setAda(true)
                .setHargaMakanan(12000);
        makanan10
                .setIdMakanan("010")
                .setNamaMakanan("Tempe")
                .setAda(true)
                .setHargaMakanan(5000);
        makanan11
                .setIdMakanan("011")
                .setNamaMakanan("Greatday")
                .setAda(true)
                .setHargaMakanan(6000);
        makanan12
                .setIdMakanan("012")
                .setNamaMakanan("Sencafe")
                .setAda(true)
                .setHargaMakanan(7000);
        makanan13
                .setIdMakanan("013")
                .setNamaMakanan("Gehu")
                .setAda(true)
                .setHargaMakanan(2000);
        makanan14
                .setIdMakanan("014")
                .setNamaMakanan("Teh cupuk")
                .setAda(true)
                .setHargaMakanan(4000);
        makanan15
                .setIdMakanan("015")
                .setNamaMakanan("Nasi")
                .setAda(true)
                .setHargaMakanan(5000);
        makanan16
                .setIdMakanan("016")
                .setNamaMakanan("Nasi goreng")
                .setAda(true)
                .setHargaMakanan(10000);
        makanan17
                .setIdMakanan("017")
                .setNamaMakanan("Kecap")
                .setAda(true)
                .setHargaMakanan(3000);
        makanan18
                .setIdMakanan("018")
                .setNamaMakanan("Air")
                .setAda(true)
                .setHargaMakanan(3000);
        makanan19
                .setIdMakanan("019")
                .setNamaMakanan("Cengek")
                .setAda(true)
                .setHargaMakanan(7000);
        makanan20
                .setIdMakanan("020")
                .setNamaMakanan("Silverking")
                .setAda(true)
                .setHargaMakanan(20000);

        makanans.put(makanan1.getIdMakanan(), makanan1);
        makanans.put(makanan2.getIdMakanan(), makanan2);
        makanans.put(makanan3.getIdMakanan(), makanan3);
        makanans.put(makanan4.getIdMakanan(), makanan4);
        makanans.put(makanan5.getIdMakanan(), makanan5);
        makanans.put(makanan6.getIdMakanan(), makanan6);
        makanans.put(makanan7.getIdMakanan(), makanan7);
        makanans.put(makanan8.getIdMakanan(), makanan8);
        makanans.put(makanan9.getIdMakanan(), makanan9);
        makanans.put(makanan10.getIdMakanan(), makanan10);
        makanans.put(makanan11.getIdMakanan(), makanan11);
        makanans.put(makanan12.getIdMakanan(), makanan12);
        makanans.put(makanan13.getIdMakanan(), makanan13);
        makanans.put(makanan14.getIdMakanan(), makanan14);
        makanans.put(makanan15.getIdMakanan(), makanan15);
        makanans.put(makanan16.getIdMakanan(), makanan16);
        makanans.put(makanan17.getIdMakanan(), makanan17);
        makanans.put(makanan18.getIdMakanan(), makanan18);
        makanans.put(makanan19.getIdMakanan(), makanan19);
        makanans.put(makanan20.getIdMakanan(), makanan20);

        Ruangan ruangan1 = new Ruangan();
        Ruangan ruangan2 = new Ruangan();
        Ruangan ruangan3 = new Ruangan();
        Ruangan ruangan4 = new Ruangan();
        Ruangan ruangan5 = new Ruangan();
        Ruangan ruangan6 = new Ruangan();
        Ruangan ruangan7 = new Ruangan();
        Ruangan ruangan8 = new Ruangan();
        Ruangan ruangan9 = new Ruangan();
        Ruangan ruangan10 = new Ruangan();
        Ruangan ruangan11 = new Ruangan();
        Ruangan ruangan12 = new Ruangan();
        Ruangan ruangan13 = new Ruangan();
        Ruangan ruangan14 = new Ruangan();
        Ruangan ruangan15 = new Ruangan();

        ruangan1
                        .setNamaRuangan("Kelas")
                        .setIdRuangan("01")
                        .setAda(true);
        ruangan2
                        .setNamaRuangan("Kantin L1")
                        .setIdRuangan("02")
                        .setAda(true);
        ruangan3
                        .setNamaRuangan("Kantin L2")
                        .setIdRuangan("03")
                        .setAda(true);
        ruangan4
                        .setNamaRuangan("Kantin Bawah")
                        .setIdRuangan("04")
                        .setAda(true);
        ruangan5
                        .setNamaRuangan("Masjid")
                        .setIdRuangan("05")
                        .setAda(true);
        ruangan6
                        .setNamaRuangan("Lab Fisika")
                        .setIdRuangan("06")
                        .setAda(true);
        ruangan7
                        .setNamaRuangan("Lab Komputer")
                        .setIdRuangan("07")
                        .setAda(true);
        ruangan8
                        .setNamaRuangan("WC")
                        .setIdRuangan("08")
                        .setAda(true);
        ruangan9
                        .setNamaRuangan("Kosan")
                        .setIdRuangan("09")
                        .setAda(true);
        ruangan10
                        .setNamaRuangan("Perpus")
                        .setIdRuangan("10")
                        .setAda(true);
        ruangan11
                        .setNamaRuangan("Gor Badminton")
                        .setIdRuangan("11")
                        .setAda(true);
        ruangan12
                        .setNamaRuangan("Aula Anwar")
                        .setIdRuangan("12")
                        .setAda(true);
        ruangan13
                        .setNamaRuangan("Aula Abjan")
                        .setIdRuangan("13")
                        .setAda(true);
        ruangan14
                        .setNamaRuangan("Tugu Kujang")
                        .setIdRuangan("14")
                        .setAda(true);
        ruangan15
                        .setNamaRuangan("Gedung FST")
                        .setIdRuangan("15")
                        .setAda(true);

        ruangans.put(ruangan1.getIdRuangan(), ruangan1);
        ruangans.put(ruangan2.getIdRuangan(), ruangan2);
        ruangans.put(ruangan3.getIdRuangan(), ruangan3);
        ruangans.put(ruangan4.getIdRuangan(), ruangan4);
        ruangans.put(ruangan5.getIdRuangan(), ruangan5);
        ruangans.put(ruangan6.getIdRuangan(), ruangan6);
        ruangans.put(ruangan7.getIdRuangan(), ruangan7);
        ruangans.put(ruangan8.getIdRuangan(), ruangan8);
        ruangans.put(ruangan9.getIdRuangan(), ruangan9);
        ruangans.put(ruangan10.getIdRuangan(), ruangan10);
        ruangans.put(ruangan11.getIdRuangan(), ruangan11);
        ruangans.put(ruangan12.getIdRuangan(), ruangan12);
        ruangans.put(ruangan13.getIdRuangan(), ruangan13);
        ruangans.put(ruangan14.getIdRuangan(), ruangan14);
        ruangans.put(ruangan15.getIdRuangan(), ruangan15);
    } 
}
