package beginnersprogram;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapBully {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap<String, String> map=new HashMap<String, String>();
		map.put("a","candy");
		map.put("b", "dirty");
		for (Map.Entry<String, String> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		if(map.containsKey("a"))
			map.put("b", map.get("a"));
			map.put("a", "");
			for (Map.Entry<String, String> entry : map.entrySet())
			{
			    System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		*/		
		
		/*HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("a","aaa");
		hashMap.put("b", "bbb");
		hashMap.put("c", "ccc");
		for (Map.Entry<String, String> entry : hashMap.entrySet())
		{
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("_____________________________________________");
		if(hashMap.containsKey("b"))
			hashMap.put("b",hashMap.get("a"));
		if(hashMap.containsKey("c"))
			hashMap.remove("c");
		for (Map.Entry<String, String> entry : hashMap.entrySet())
		{
			
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
*/	
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("a","hi");
		hashMap.put("b", "There");
		for(Map.Entry<String, String> entry : hashMap.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		if(hashMap.containsKey("a") && hashMap.containsKey("b"))
			hashMap.put("ab",hashMap.get("a")+hashMap.get("b"));
		else if(hashMap.containsKey("a"))
			hashMap.put("a", "hi");
		else
			hashMap.put("b", "There");
		for(Map.Entry<String, String> entry : hashMap.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(hashMap.isEmpty());
		
		}

}
