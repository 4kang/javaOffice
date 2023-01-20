package test2;

import java.util.Scanner;

public class Kadai18 {

	public static void main(String[] args) {
		
		//国語の点数を入力する
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("国語の点数＞");
		
		int kokugo = Integer.parseInt(scanner1.nextLine());
		
		//英語の点数を入力する
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("英語の点数＞");
		
		int eigo = Integer.parseInt(scanner2.nextLine());
		
		
		/*国語の点数が90点以上かつ英語の点数が90点以上の場合
		 「評価はSです」と表示せよ*/
		if(kokugo >= 90) {
			if(eigo >= 90) {
				System.out.println("評価はSです");
			}else if(eigo>=80 && eigo<=90) {
				System.out.println("評価はAです");
			}else if(eigo >= 70 && eigo <= 80) {
				System.out.println("評価はBです");
			}else {
				System.out.println("評価はFです");
			}
			
			//false
		}
	}

}
