package com.example.gelismiskomutlarunite5;

public class ElektrikliCihaz {
    public String cihazAdi;
    public double cihazKW;
    public int gunlukSaatKullanimi;
    public double aylikTuketim(){
        double aylikkullanim;
        aylikkullanim = cihazKW * gunlukSaatKullanimi * 30;
        return aylikkullanim;
    }
}
