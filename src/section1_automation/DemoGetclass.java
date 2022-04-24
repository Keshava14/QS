package section1_automation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoGetclass {

	int x = 10;
	String name = "Kumar";
	public void m1() {}
	public static void m2() {}
	DemoGetclass(){}
	DemoGetclass(int x){}
	public static void main(String[] args){
		
		DemoGetclass dgc = new DemoGetclass();

		// full class info
		Class c= dgc.getClass();
		System.out.println(c.getName());
		
		System.out.println(".............");
		
		// no of  methods
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m) {
			System.out.println(m1);
		}
		
		System.out.println(".............");
		
		// no of constructors
		Constructor [] con = c.getDeclaredConstructors();
		for(Constructor c1 : con)
		{
			System.out.println(c1);
		}
		
		System.out.println(".............");
		
		// total no of variable
		Field[] f =c.getDeclaredFields();
		for(Field f1 : f)
		{
			System.out.println(f1);
		}
	}
	@Override
	public String toString() 
	{
		System.out.println("my tostring output");
		return getClass().getName() +"@"+ Integer.toHexString(hashCode());	
	}
}
