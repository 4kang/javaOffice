package test1;

public class Fornest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for(int x = 0; x < 6; x++) {
			for(int y = 0; y < x+1; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//forネスト
		for(int a = 0; a<6; a++) {
			for(int k = 6; k>a; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
