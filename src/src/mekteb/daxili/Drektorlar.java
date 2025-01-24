package mekteb.daxili;

import mekteb.User;

public class Drektorlar extends User {
    int telefon_n = 1234567890;

    public Drektorlar(String ad, String soyad, int yas, int mekteb, int telefon_n) {
        super(ad, soyad, yas, mekteb);
        this.telefon_n = telefon_n;
    }

    public void info() {
        super.info();
        System.out.println("Telefon " + this.telefon_n);
    }
}
