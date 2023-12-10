import java.util.Scanner;
public class Havs {
    public static void main(String[] args) {
        Scanner vr = new Scanner(System.in);
        int sic ;
        System.out.println("Hava sıcaklığını girin : ");
        sic = vr.nextInt();

        if (sic<5){
            System.out.println("Kayak Yapmak İster misiniz? ");
        }if ((sic>=5)&&(sic<=15)){
            System.out.println("Sinemaya gitmek ister misiniz? ");
        }if ((sic>=15)&&(sic<=25)){
            System.out.println("Pikniğe gitmek ister misiniz?");
        }else if (sic>25) {
            System.out.println("Yüzmek ister misiniz?");
        }

    }
}
