package mekteb.daxili;

import mekteb.User;

public class Muellimler extends User {
    String[] ders = {"Az-dili", "Edebiyyat"};

    public Muellimler(String ad, String soyad, int yas, int mekteb, String ders){
        super(ad, soyad, yas, mekteb);
        this.ders = new String[]{ders};
    }

    public void info() {
        super.info();
        System.out.print("Ders: ");
        for (String de : this.ders) System.out.println(de+" ");
    }
}
