package sample;

import sample.framework.Manager;
import sample.framework.Product;

public class Main {
	public static void main(String[] args) {
		// 準備
		Manager manager = new Manager();
		
		UnderLinePen ulPen = new UnderLinePen('~');
		MessageBox mBox = new MessageBox('*');
		MessageBox sBox = new MessageBox('/');
		
		manager.register("Strong Message", ulPen);
		manager.register("Warning Box", mBox);
		manager.register("Slash Box", sBox);
		
		// 生成
		Product p1 = manager.create("Strong Message");
		Product p2 = manager.create("Warning Box");
		Product p3 = manager.create("Slash Box");
		
		p1.use("Hello, World");
		p2.use("Hello, World");
		p3.use("Hello, World");
	}
}
