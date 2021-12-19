package sample;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("山田太郎");
		Product card2 = factory.create("山田二郎");
		Product card3 = factory.create("山田三郎");
		card1.use();
		card2.use();
		card3.use();
	}
}
