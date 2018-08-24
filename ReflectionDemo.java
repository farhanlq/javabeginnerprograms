package beginnersprogram;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionDemo {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException, NoSuchFieldException {
		// TODO Auto-generated method stub
		//Class myClass=ReflectionTest.class;
		//Field field=ReflectionTest.getField("add");
		//Field[] publicFields = Class.forName("beginnersprogram.ReflectionTest").getFields();
		//System.out.println(Arrays.toString(publicFields));
		Class myClass = ReflectionTest.class;
		Field field=myClass.getField("Xavient");
		System.out.println(field);
		
	}

}
