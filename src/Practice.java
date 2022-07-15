import java.util.Scanner;


public class Practice{
    public static void main(String... args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter and Amount : ");
        double amount = Sc.nextInt();
        System.out.println("Enter a Promo Code : ");
        int promoCode = Sc.nextInt();

        int ZOMHELLO = 101;
        int JUMBO = 201;

        double discount = 0;

        if( promoCode == JUMBO) {
            if(amount >= 200) {
                discount = 0.5 * amount;
                System.out.println("Discount Applied: " + discount);
                System.out.println("Promo Code JUMBO applied");
            }
            else{
                System.out.println("The amount is lesser, Please add" + (200 - amount) +" in your wallet");
            }
        }
        else if(promoCode == ZOMHELLO) {
            if(amount >= 159) {
                discount = 0.6 * amount;
                if(discount > 120) {
                    discount = 120;
                }
                System.out.println("Discount Applied : "+ discount);
                System.out.println("Promo code ZOMHELLO applied ");
            }
            else{
                System.out.println("The amount is lesser, Please add" + (159 - amount)+ " in your wallet");
            }
        }else{
            System.out.println("Invalid Promo Code");
        }
        System.out.println("Please Pay : " + (amount - discount));

    }
}