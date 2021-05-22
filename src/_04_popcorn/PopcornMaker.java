package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	
	
	

Microwave microwave = new Microwave();
	

	String Time = JOptionPane.showInputDialog("How long would you like your popcorn cooked?");
	String flavor = JOptionPane.showInputDialog("What flavor would you like your popcorn?");
	int num = Integer.parseInt(Time);
	Popcorn popcorn = new Popcorn("flavor");
	microwave.putInMicrowave(popcorn);
	microwave.setTime(num);
	microwave.startMicrowave();
	popcorn.eat();
	
	
	
}
}
