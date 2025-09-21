//program to compute discount
/*
*name:
*reg no:
*description:program to compute discount
*/
import java.util.Scanner;
public class discount {
public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
double discount ;
//prompt user to enter amount
System.out.println("enter the amount purchased:");
double amount = Double.parseDouble(scanner.nextLine());
if(amount >5000) {
discount = amount * 0.1;
}
else if(amount >=1000 && amount <=5000) {
discount =amount * 0.05;
}
else {
discount =0;
}
double amounttopay = amount  -  discount;
System.out.println("initial amount" + amount);
System.out.println("discount" + discount);
System.out.println("amount to pay" + amounttopay);

scanner.close();
    }
}
