package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
//Map : HashMap, Hashtable, TreeMap, Properties 
//=> 키와 값 분리시에는 entry 또는 element 단위로 Iterator 나 Enumeration 이 필요함.
public class MapExam {
	public static void main(String[] args) {
		//Map 은 List 처럼 index 가 존재하는 것이 아니라 키가 존재한다.
		//순서 유지가 되지 않는다.
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		map1.put("jung", 70);	//추가
		map1.put("cho", 95);
		map1.put("park", 85);
		map1.put("kim", 90);
		map1.put("kang", 65);
		System.out.println(map1);
		
		System.out.println("park : "+map1.get("park"));	//개별 요소 접근 시 인덱스가 아니라 키로 접근해야한다.
		
		System.out.println();
		System.out.println("< Iterator에 의한 순회 >");
		//맵 순회1 : Iterator(분리자) 에 의한 접근
		Iterator<String> keys = map1.keySet().iterator();	//맵의 키모음(keySet)이 하나의 요소로 분리됨.
		//keys = {jung,cho,park,kim,kang}
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key+ " : "+map1.get(key));	//map1.get("cho")
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("< entrySet에 의한 순회 >");
		//맵 순회2 : entrySet(키와 값의 하나의 쌍 => entry)에 의한 접근
		for(Map.Entry<String, Integer> entry : map1.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" : "+value);
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("< keySet에 의한 순회 >");
		//맵 순회3 : keySet에 의한 접근
		for(String key:map1.keySet()) {
			System.out.println(key+" : "+map1.get(key));
		}
		
		System.out.println();
		
		if(map1.containsKey("kang")) {	//특정 키의 존재유무
			System.out.println("kang : "+map1.get("kang"));
		}
		else {
			System.out.println("Key_kang : No Exist!");
		}
		
		if(map1.containsValue(100)) {
			System.out.println("100 Point : Exist!");
		}
		else {
			System.out.println("100 Point : No Exist!");
		}
		
		System.out.println();
		
		//Hashtable
		map2.put("kim", "1 type");		//키는 중복될 수 없음
		map2.put("kang", "2 type");
		map2.put("kim", "3 type");
		map2.put("Lee", "3 type");
		map2.put("kang", "1 type");
		
		System.out.println("< Before >");
		System.out.println(map2);
		
		System.out.println("< Remove_After >");
		map2.remove("kim");
		System.out.println(map2);
		
		System.out.println("< Clear_After >");
		map2.clear();
		System.out.println(map2);
		
		System.out.println();
		
		//배열의 값을 TreeMap에 대입
		String names[] = {"kim1","kim2","jung","Cho","kang","kwon","lee","lim","park","kang2"};
		for(int i=0; i<=9; i++) {
			map3.put(i, names[i]);
		}
		System.out.println("인원수 : "+map3.size());
		for(Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(i);
			System.out.println(key+" : "+value);
		}
		
		System.out.println();
		
		//Properties 의 키(필드이름)과 값은 모두 문자열로 취급한다.
		map4.setProperty("name", "jung");
		map4.setProperty("age", "27");
		map4.setProperty("height", "173.5");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "70");
		map4.setProperty("mat", "90");
		
		System.out.println("Name : "+map4.getProperty("name"));
	}
}
