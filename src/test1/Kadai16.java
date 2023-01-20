package test1;

import java.util.HashMap;
import java.util.Map;

public class Kadai16 {

	public static void main(String[] args) {
		
		//Map<キーの型名,値の型名>マップ名 = new HasuMap<>();
		Map<String, String> exMap = new HashMap<>();
		
		//初期化
		exMap.put("japan", "日本");
		exMap.put("america", "アメリカ");
		exMap.put("france", "フランス");
		System.out.println(exMap.get("japan"));
		System.out.println(exMap.get("america"));
		System.out.println(exMap.get("france"));

	}

}
