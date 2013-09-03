package test;

import assets.*;

public class TestAssets {
	public static void main(String args[]){
		EntityFamily myEntity = new TextEntity("123");
		System.out.println(myEntity.getType()+" "+myEntity.getStringValue());
		Integer a = new Integer(0);
		//System.out.println(myEntity.getClass().toString());
		//get(123);//myEntity);
		
	}
	public static void get(Object ob){
		//System.out.println(ob.getClass().toString());
		if(ob.getClass() == TextEntity.class)
			System.out.println("true");
		else
			System.out.println("false");
	}
	
}
