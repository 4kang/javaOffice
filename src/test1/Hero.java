package test1;

public class Hero {
	
	
	//引数なし＝勇者の情報
	public void print() {
		System.out.println("勇者の情報");
	}
	
	private String name;
	private int money;
	private int hp;
	
	//setter
	public void setNumber(int money) {
		this.money=money;
	}
	//getter
	public int getNumber() {
		return money;
	}
	
	//setter
	public void setNumber2(int hp) {
		this.hp=hp;
	}
	//getter
	public int getNumber2() {
		return hp;
	}
	
	//setter
	public void setString(String name) {
		/*System.out.println("名前：" + name);
		System.out.println("$" + money);
		System.out.println(hp);*/
		this.name = name;
	}
	
	//getter
	public String getStr() {
		return name;
	}


}
