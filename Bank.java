class Bank{

	static String nameOfTheAccountHolder;
	static int amount;
	static String interest;

	public void deposit(){
		System.out.println("we have to deposit the MONEY...");
	} 
	public void withdraw(){
		System.out.println("we have to withdraw the MONEY, whenever we want the MONEY...");
	}
	

public static void main(String[] args){
	Bank b = new Bank();
			System.out.println(b.nameOfTheAccountHolder = "Durgareddy");
			System.out.println(b.amount = 100000);
			System.out.println(b.interest = "7.5%");
			b.deposit();
			b.withdraw();
	
	}
}