import mekteb.daxili.Drektorlar;
import mekteb.daxili.Muellimler;
import mekteb.daxili.Telebeler;

public class Main {
    public static void main(String[] args){
        Drektorlar D1 = new Drektorlar("Aqil", "Aliyev", 46, 13, 1234567890);
        D1.info();
        System.out.println("----------------------");
        Muellimler M1 = new Muellimler("Konul", "Memmedova", 35, 13, "Az-dili, Edebiyyat");
        M1.info();
        System.out.println("----------------------");
        Telebeler T1 = new Telebeler("Vahid", "Suleymanov", 28, 13, 3);
        T1.info();
    }
}
