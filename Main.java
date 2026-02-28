import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice,quantity,price=0,subchoice;
	double total=0,CGST,SGST;
	System.out.println("----------MENU----------");
	System.out.println("1.Tiffin");
	System.out.println("2.Lunch");
	System.out.println("3.snackes");
	System.out.println("4.Tea/Coffee");
	System.out.println("5.Exit");
	System.out.println("enter choice:");
	  choice=sc.nextInt();
	switch(choice){
	    case 1:
	        System.out.println("---1.Tiffin menu ---");
	        System.out.println("1.plaindosa - Rs.30");
	        System.out.println("2.oniondosa - Rs.35");
	        System.out.println("3.eggdosa   - Rs.40");
	        System.out.println("4.idlie  - Rs.30");
	        System.out.println("5. poori - Rs.30");
	        System.out.println("mysore bajji - Rs-35");
	        System.out.println("enter your choice");
                subchoice = sc.nextInt();
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();
                switch (subchoice) {
                    case 1: price = 30; break;
                    case 2: price = 35; break;
                    case 3: price = 40; break;
                    case 4: price = 30; break;
                    case 5: price  =30; break;
                    case 6: price  = 35; break;
                    default: System.out.println("Invalid item"); return;
                }
                total = price * quantity;
                break;
	   case 2:
	       	System.out.println("---2.Lunch menu ---");
	       System.out.println("1.full meals  - Rs.60");
	       System.out.println("2.egg curry -Rs.20 ");
	       System.out.println("3.veg fried rice  -Rs.60");
	       System.out.println("4.egg fried rice - Rs.70");
	       System.out.println("5.chicken fried rice - Rs.80");
	       System.out.println("6.veg noodles - Rs.60");
	       System.out.println("7.egg noodles -Rs.70");
	       System.out.println("8. chicken noodles - Rs.80");
	       System.out.println("9.veg manchuria  - Rs.60");
	       System.out.println("10.chicken manchuria  -Rs.110");
	       System.out.println("11.Biryani  - Rs.150");
	       subchoice = sc.nextInt();
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();
                switch (subchoice) {
                    case 1: price = 60; break;
                    case 2: price = 20; break;
                    case 3: price = 60; break;
                    case 4: price = 70; break;
                    case 5: price  =80; break;
                    case 6: price  = 60; break;
                    case 7: price  = 70; break;
                    case 8: price  = 80; break;
                    case 9: price  = 60; break;
                    case 10: price  = 110; break;
                    case 11: price  = 150; break;
                    default: System.out.println("Invalid item"); return;
                }
                total = price * quantity;
	       break;
	   case 3:
	       System.out.println("---3.snackes menu---");
	       System.out.println("1.diarymilk  -Rs.100");
	       System.out.println("2.fivestar - Rs.20");
	       System.out.println("3.cooldrinks -Rs.20");
	       System.out.println("4.Bingo   -Rs.10");
	       System.out.println("5.samosa   -Rs.20");
	       System.out.println("6. panipoori   -Rs.35");
	           subchoice = sc.nextInt();
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();
                switch (subchoice) {
                    case 1: price = 100; break;
                    case 2: price = 20; break;
                    case 3: price = 20; break;
                    case 4: price = 10; break;
                    case 5: price  =20; break;
                    case 6: price  = 35; break;
                    default: System.out.println("Invalid item"); return;
                }
                total = price * quantity;
	       break;
	   case 4:
	       System.out.println("---4.Tea/Coffee menu---");
	       System.out.println("1.green tea  -Rs.15");
	       System.out.println("2.sp tea   -Rs.20");
	       System.out.println("3.coffee  -Rs.12");
	       System.out.println("4.boost  - Rs.20");
	               subchoice = sc.nextInt();
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();
                switch (subchoice) {
                    case 1: price = 15; break;
                    case 2: price = 20; break;
                    case 3: price = 12; break;
                    case 4: price = 20; break;
                    default: System.out.println("Invalid item"); return;
                }
                total = price * quantity;
                break;
	        case 5:
                System.out.println("Exit");
                return;
            default:
                System.out.println("Invalid choice");
                return;
	}
        CGST = total * 0.10;
        SGST = total * 0.09;
        double finalAmount = total + CGST + SGST;
        long round=Math.round(finalAmount);

        System.out.println("\n----- BILL -----");
        System.out.println("Total Amount : Rs " + total);
        System.out.println("CGST (10%)    : Rs " + CGST);
        System.out.println("SGST (9%)    : Rs " + SGST);
        System.out.println("Final Amount : Rs " + round);
        sc.close();
    }
}
