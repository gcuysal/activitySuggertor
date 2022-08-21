import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.println("Hava sıcaklığı kaç derece? Lüften değeri giriniz: ");
        heat = inp.nextInt();

        if (heat < 5){
            System.out.println("Sizin için önerimiz: Kayak!");
        }else if (heat >= 5 && heat <15){
            System.out.println("Sizin için önerimiz: Sinema!");
        }else if(heat >=15 && heat < 25){
            System.out.println("Sizin için önerimiz: Piknik!");
        }else {
            System.out.println("Sizin için önerimiz: Yüzme!");
        }
    }
}
