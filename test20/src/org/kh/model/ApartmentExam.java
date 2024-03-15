package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;

public class ApartmentExam {
	public static void main(String[] args) {
		List<Apartment> aptList = new ArrayList<>();
	
		for(int i=0; i<10; i++) {
			Apartment apt = new Apartment("타운"+i, "이름"+i, i, 100+i, 10+i, 1.5+i);
			aptList.add(apt);
		}
		
		for(Apartment a:aptList) {
			System.out.println(a.toString());
		}
	}
}
