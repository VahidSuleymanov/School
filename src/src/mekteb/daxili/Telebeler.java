package mekteb.daxili;

import mekteb.baza.User;

public class Telebeler extends User {
    int kurs = 3;

    public Telebeler(String ad, String soyad, int yas, int mekteb, int kurs){
        super(ad, soyad, yas, mekteb);
        this.kurs = kurs;
    }

    public void info() {
        super.info();
        System.out.println("Kurs " + this.kurs);
    }
}
