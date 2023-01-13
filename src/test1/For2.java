package test1;

public class For2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String item[] = {"・炎の剣","・普通の防具","・回復薬"};
		System.out.println("-------勇者の持ち物-------");
		
		//配列から要素を取り出しstrに格納する
		//ブロック内の処理を実行（画面に変数strの値を）
		//繰り返しの終了
		for(String str: item ) {
			
			System.out.println(str);
		}

	}

}
