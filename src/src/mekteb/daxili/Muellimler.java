package mekteb.daxili;

import mekteb.baza.User;

public class Muellimler extends User {
    String ders;

    public Muellimler(String ad, String soyad, int yas, int mekteb, String ders){
        super(ad, soyad, yas, mekteb);
        this.ders = ders;
    }

    public void info() {
        super.info();
        System.out.println("Ders: "+this.ders);
    }
}
