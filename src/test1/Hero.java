package test1;

public class Hero {

	//引数なし＝勇者の情報
	public void print() {
		System.out.println("勇者の情報");
	}
	
	String name;
	int money;
	int hp;
	
	public void printInfo(String name,int money,int hp) {
		System.out.println("名前：" + name);
		System.out.println("$" + money);
		System.out.println(hp);
	}


}
