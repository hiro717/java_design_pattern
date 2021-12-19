package sample;

public class Main {
	public static void main(String[] args) {
		AbstractDisplay ad1 = new CharDisplay('H');
		AbstractDisplay ad2 = new StringDisplay("Hello, World.");
		AbstractDisplay ad3 = new StringDisplay("こんにちわ。");
		ad1.display();
		ad2.display();
		ad3.display();
	}
}
