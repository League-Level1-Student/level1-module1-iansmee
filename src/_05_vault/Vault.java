package _05_vault;

public class Vault {

	
	int secretCode = 0;
	
	public Vault(int code) {
		secretCode = code;
	}
	
	public boolean tryCode( int code) {
		return code == secretCode;
	}
	
	
}
