package test1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//名前：atjc、所持金：1000、体力：2000
		Hero h = new Hero("atjc", 1000, 2000);
		
		System.out.println("-----勇者の情報-----");
		System.out.println("名前：" + h.name);
		System.out.println("所持金：$" + h.gold);
		System.out.println("体力:" + h.hp);
		

	}

}
