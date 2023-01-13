package test1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//名前：自分の名前、所持金：1000、体力：2000
		Hero hero = new Hero();
		hero.setName("河野");
		hero.setMoney(1000);
		hero.setHp(2000);
		
		System.out.println("----勇者の情報----");
		System.out.println("名前：" + hero.getName());
		System.out.println("$" + hero.getMoney());
		System.out.println(hero.getHp());
		
		List<String> list = new ArrayList<String>() {
			{
				add("炎の剣");
				add("普通の防具");
				add("回復薬");
			}
		};
	}

}
