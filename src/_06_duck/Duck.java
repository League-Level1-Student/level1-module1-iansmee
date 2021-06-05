package _06_duck;

public class Duck {
	
	Duck(String favoriteFood, int numberOfFriends) {
	    this.favoriteFood = favoriteFood;
	    this.numberOfFriends = numberOfFriends;
	}
	
int numberOfFriends;
String favoriteFood;





void quack() {
	System.out.println("(duck quackes)");
}

void waddle() {
	System.out.println("(duck waddles)");
}

}
