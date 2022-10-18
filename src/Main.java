import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		System.out.println("how much money you got?");
		double money = in.nextDouble();
		System.out.println("how much u pay?");
		double paid = in.nextDouble();
		double cash = (money-paid);
		//Read in the amount paid
		
		//Print out the amount of change
		System.out.println("Your amount of cash is $" +cash);
		//Break the change into all denominations: 
		
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
		int onehundredbills = (int)(cash/100);
		cash-=onehundredbills*100;
		int fiftybills = (int)(cash/50);
		cash-=fiftybills*50;
		int twentybills = (int)(cash/20);
		cash-=twentybills*20;
		int tenbills = (int)(cash/10);
		cash-=tenbills*10;
		int fivebills = (int)(cash/5);
		cash-=fivebills*5;
		int tooney = (int)(cash/2);
		cash-=tooney*2;
		int looney = (int)(cash/1);
		cash-=looney*1;
		double quarters = (int)(cash/0.25);
		cash-=quarters*0.25;
		double dimes = (int)(cash/0.10);
		cash-=dimes*0.10;
		double nickles = (int)(cash/0.05);
		cash-=nickles*0.05;
		System.out.println("You have " +onehundredbills+ " $100 bills");
		System.out.println("You have " +fiftybills+ " $50 bills");
		System.out.println("You have " +twentybills+ " $20 bills");
		System.out.println("You have " +tenbills+ " $10 bills");
		System.out.println("You have " +fivebills+ " $5 bills");
		System.out.println("You have " +tooney+ " $2 bills");
		System.out.println("You have " +looney+ " $1 bills");
		System.out.println("You have " +quarters+ " $0.25");
		System.out.println("You have " +dimes+ " $0.10");
		System.out.println("You have " +nickles+ " $0.05");
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
		
	}

}
