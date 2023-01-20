package test2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Kadai17 {

	public static void main(String[] args) {
		
		//SimpleDateFormat オブジェクト名 = new SimpleDateFormat("フォーマットパターン")
		//オブジェクト名.format(date)
		
		Calendar cl = Calendar.getInstance();
		
		//SimpleDateFormatクラスを利用して、パターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//本日の日付
		System.out.println(sdf.format(cl.getTime()));
		
		//7日後の日付
		cl.add(Calendar.DATE,7);
		System.out.println(sdf.format(cl.getTime()));
		
		//7日前の日付
		cl.add(Calendar.DATE,-7);
		System.out.println(sdf.format(cl.getTime()));
	}

}
