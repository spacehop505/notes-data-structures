package collection.varargs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateVarargsHashMap {

	public static void main(String[] args) {
		Map<String, String> hashMapObj1 = new HashMap<>();
		Map<String, String> hashMapObj2 = new HashMap<>();
		Map<String, String> hashMapObj3 = new HashMap<>();

		hashMapObj1.put("a", "aa");
		hashMapObj1.put("b", "aa");
		hashMapObj1.put("c", "aa");

		hashMapObj2.put("a", "bb");
		hashMapObj2.put("b", "bb");

		hashMapObj3.put("a", "cc");
		hashMapObj3.put("b", "cc");
		hashMapObj3.put("c", "cc");
		hashMapObj3.put("d", "cc");

		varargsHashMap(hashMapObj1, hashMapObj2, hashMapObj3);
	}

	@SafeVarargs
	public static void varargsHashMap(Map<String, String>... varargsHashMap) {

		for (Map<String, String> eachHashMap : varargsHashMap) {
			Iterator<String> iterator = eachHashMap.keySet().iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				eachHashMap.get(key);
				System.out.println("Key: " + key + ", \t[Value:" + eachHashMap.get(key) + "]");

			}
		}

	}
}
