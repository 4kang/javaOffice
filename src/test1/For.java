package test1;

public class For {

	public static void main(String[] args) {
		
		/* for(初期化;条件;変化){
		 　実行内容
		 }*/
		
		String ai = "アブラカタブラ";
		
		System.out.println("ここから出るには呪文を三回唱えなさい");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("勇者：" + ai);
		}
		
		System.out.println("勇者はダンジョンから生還することができた。");

	}

}
