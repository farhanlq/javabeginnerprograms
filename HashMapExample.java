package beginnersprogram;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, String> charMap=new HashMap<String, String>();
		Map <String, Employee> pdChars=new HashMap<String, Employee>();
		charMap.put("1","fqdn");
		charMap.put("2","cm");
		
		Employee e1=new Employee();
		e1.setName("fqdn");
		e1.setAge("23");
		e1.setAddress("Delhi");
		
		Employee e2=new Employee();
		
		e2.setName("cm");
		e2.setAge("27");
		e2.setAddress("Gurgaon");
		
		pdChars.put("1", e1);
		pdChars.put("2", e2);
		
		Employee char1=new Employee();
		for(Map.Entry<String, String> m1 : charMap.entrySet()){
			if(pdChars.containsKey(m1.getKey())){
				 char1 = pdChars.get(m1.getKey());
				if(!char1.getName().equalsIgnoreCase(m1.getValue())){
					char1.setName(m1.getValue());
				}
			}
		}
		System.out.println(char1.getName());
		System.out.println(char1.getAge());
		System.out.println(char1.getAddress());
		
		
		//Map <String, Object> res=new HashMap<String, Object>();
		
		/*for(Map.Entry<String, String> m1 : charMap.entrySet()) {
			  if((pdChars.containsKey(m1.getKey()))) 
			{
			  Employee char1 = pdChars.get(m1.getKey());
			  if (!char1.getValue().equalsIgnoreCase(m1.getValue())) {
			   char1.setValue(m1.getValue());
			                                                }
			                                  }
			                           }
*/
		

	}

}
