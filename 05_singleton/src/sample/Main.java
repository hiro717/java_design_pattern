package sample;

public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		
		// getInstance()が呼び出された時点でSingletonクラスが初期化。
		// そのときにstaticフィールドも初期化される。
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("１と２は同じインスタンス。");
			
		} else {
			System.out.println("１と２は違うインスタンス。");
		}
		
		System.out.println("End.");
	}
}
