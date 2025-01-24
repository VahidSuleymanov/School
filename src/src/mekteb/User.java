package mekteb;

public class User {
    String ad;
    String soyad;
    int yas;
    int mekteb;

    public User(String ad, String soyad, int yas, int mekteb){
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.mekteb = mekteb;
    }

    public void info() {
        System.out.println("Ad: " + this.ad);
        System.out.println("Soyad: " + this.soyad);
        System.out.println("Yas: " + this.yas);
        System.out.println("Mekteb: " + this.mekteb);
    }
}
