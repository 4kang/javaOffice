package test1;

public class Main {

	public static void main(String[] args) {
		//名前：自分の名前、所持金：1000、体力：2000
		Hero hero = new Hero();
		hero.setName("河野");
		hero.setMoney(1000);
		hero.setHp(2000);
		
		System.out.println("勇者の情報");
		System.out.println("名前：" + hero.getName());
	}

}
