import java.util.Scanner;

public class dankeSchon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dictence,age,travelType;
        double normalPrice,tamplePrice,discountAmount;

        System.out.println("dictence?:");
        dictence = scan.nextInt();

        System.out.println("age?:");
        age = scan.nextInt();

        System.out.println("travelType?:");
        travelType = scan.nextInt();


        normalPrice = dictence * 0.10;

        if (travelType == 1){
            if (age<12){
                tamplePrice =  normalPrice*0.5;
                discountAmount=normalPrice-tamplePrice;
                System.out.println(discountAmount);
            } else if (12<=age && age<=24) {
                tamplePrice =  normalPrice*0.1;
                discountAmount=normalPrice-tamplePrice;
                System.out.println(discountAmount);
            } else if (age>=65) {
                tamplePrice =  normalPrice*0.3;
                discountAmount=normalPrice-tamplePrice;
                System.out.println(discountAmount);
            } else {
                tamplePrice=normalPrice;
                discountAmount=tamplePrice;
                System.out.println(discountAmount);
            }
        } else if (travelType == 2) {
            if (age<12){
                tamplePrice =  normalPrice*0.5;
                discountAmount=(normalPrice-tamplePrice)*0.8*2;
                System.out.println(discountAmount);
            } else if (12<=age && age<=24) {
                tamplePrice =  normalPrice*0.1;
                discountAmount=(normalPrice-tamplePrice)*0.8*2;
                System.out.println(discountAmount);
            } else if (age>=65) {
                tamplePrice =  normalPrice*0.3;
                discountAmount=(normalPrice-tamplePrice)*0.8*2;
                System.out.println(discountAmount);
            } else {
                tamplePrice=normalPrice;
                discountAmount=(tamplePrice)*0.8*2;
                System.out.println(discountAmount);
            }
        }else {
            System.out.println("wrong value");
        }


    }
}
