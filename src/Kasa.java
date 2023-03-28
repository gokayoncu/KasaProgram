import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Kasa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut,elma,domates,muz,patlican;
        double armutk,elmak,domatesk,muzk,patlicank,fiyat;
        armut = 2.14;
        elma = 3.67;
        domates= 1.11;
        muz= 0.95;
        patlican = 5.00;

        System.out.print("Kaç Kilo Armut Aldınız :");
        armutk=input.nextDouble();
        System.out.print("Kaç Kilo Elma Aldınız :");
        elmak=input.nextDouble();
        System.out.print("Kaç Kilo Domates Aldınız :");
        domatesk=input.nextDouble();
        System.out.print("Kaç Kilo Muz Aldınız :");
        muzk=input.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Aldınız :");
        patlicank=input.nextDouble();
        fiyat=(armut*armutk)+(elma*elmak)+(domates*domatesk)+(muz*muzk)+(patlican*patlicank);
        System.out.print("Fiyat:"+fiyat);
    }
}
