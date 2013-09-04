package test;

import java.util.ArrayList;

import assets.*;

public class TestAssets {
	public static void main(String args[]){
		EntityFamily myEntity = new TextEntity("123", "N/A");
		System.out.println(myEntity.getType()+" "+myEntity.getStringValue());
		Integer a = new Integer(0);
		//System.out.println(myEntity.getClass().toString());
		//get(123);//myEntity);
		ArrayList<TextEntity> arrayT = new ArrayList<TextEntity>();
		arrayT.add(new TextEntity("1","N/A"));
		ArrayList<String> arrayS = new ArrayList<String>();
		arrayS.add("1");
		if(arrayT.getClass() == arrayS.getClass())
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	public static void get(Object ob){
		//System.out.println(ob.getClass().toString());
		if(ob.getClass() == TextEntity.class)
			System.out.println("true");
		else
			System.out.println("false");
	}
	
}
