package com.sist.main;
import com.sist.manager.*;
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodSystem fs=new FoodSystem();
		for(Food f:fs.getFoods()) {
			System.out.println(f.getFno()+"."+f.getName()+"\t"+f.getAddress());
		}
	}

}
