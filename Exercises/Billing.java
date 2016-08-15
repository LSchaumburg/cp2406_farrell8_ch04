/**
 * Created by jc247746 on 15/08/16.
 */
public class Billing {
    final static double TAX = 0.08;

    public static void main(String[] args) {
        computeBilling(150.78);
        computeBilling(150.78, 4);
        computeBilling(150.78, 4, 20);

        System.out.println(computeBilling(150.78));
        System.out.println(computeBilling(150.78, 4));
        System.out.println(computeBilling(150.78, 4, 20));
    }

    public static double computeBilling(double price){
        return price + (price * TAX);
    }

    public static double computeBilling(double price, int quantity){
        double total = price * quantity;
        return total + (total * TAX);
    }

    public static double computeBilling(double price, int quantity, int coupon){
        double total = price * quantity - coupon;
        return total + (total * TAX);
    }
}
