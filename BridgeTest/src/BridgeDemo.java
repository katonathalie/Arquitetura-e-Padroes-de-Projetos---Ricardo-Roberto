
public class BridgeDemo {
	
	public static void main(String[] args) {
		SimpleAccount account = new SimpleAccount(100);
		account.withdraw(75);
		
		if(account.isBalanceLow()) {
			account.setLogger(Logger.warning());
		}
		
		account.withdraw(10);
		account.withdraw(100);
	}

}
