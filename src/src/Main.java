import mekteb.daxili.Drektorlar;
import mekteb.daxili.Muellimler;
import mekteb.daxili.Telebeler;

public class Main {
    public static void main(String[] args){
        System.out.println("----------------------");
        System.out.println("DREKTORLAR");
        System.out.println("----------------------");
        Drektorlar D1 = new Drektorlar("Sevda", "Elekberova", 50, 13, 1234567890);
        Drektorlar D2 = new Drektorlar("Aqsin", "Isayev", 52, 13, 1234567890);
        Drektorlar D3 = new Drektorlar("Tural", "Veliyev", 48, 13, 1234567890);
        D1.info();
        System.out.println("----------------------");
        D2.info();
        System.out.println("----------------------");
        D3.info();
        System.out.println("----------------------");
        System.out.println("MUELLIMLER");
        System.out.println("----------------------");
        Muellimler M1 = new Muellimler("Aqil", "Haciyev", 35, 13, "Tarix");
        Muellimler M2 = new Muellimler("Konul", "Muradova", 40, 13, "Ingilis-dili");
        Muellimler M3 = new Muellimler("Irade", "Ibrahimova", 39, 13, "Riyaziyyat");
        M1.info();
        System.out.println("----------------------");
        M2.info();
        System.out.println("----------------------");
        M3.info();
        System.out.println("----------------------");
        System.out.println("TELEBELER");
        System.out.println("----------------------");
        Telebeler T1 = new Telebeler("Vahid", "Suleymanov", 19, 13, 2);
        Telebeler T2 = new Telebeler("Seymur", "Memmedov", 20, 13, 3);
        Telebeler T3 = new Telebeler("Aytac", "Aliyeva", 19, 13, 2);
        T1.info();
        System.out.println("----------------------");
        T2.info();
        System.out.println("----------------------");
        T3.info();
    }
}
