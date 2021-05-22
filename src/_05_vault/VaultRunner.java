package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	Vault vault = new Vault(42069);
	
	
	JamesBond jamesbond = new JamesBond();
	System.out.println(jamesbond.findCode(vault));
}

}
