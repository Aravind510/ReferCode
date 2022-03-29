package com.myeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Testing {
	
	private int a=100;
	
	public void displayList() {
		
		int b = 1200;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(200);
		al.add(400);
		al.add(100);
		al.add(500);
		al.add(100);
		
		b= 123;
		MyFunction mf = ()->{
			int c = 100;
			a= 89888;
			//b=122;
			System.out.println("Say Hi To Me "+a);
			return "";
		};
		
		mf.displayHiToMe();
		System.out.println(al);
		al.sort((x,y)->(x>y)?+1:(x<y)?-1:0);
		System.out.println(al);
		al.sort((x,y)->(x>y)?-1:(x<y)?+1:0);
		System.out.println(al);
		System.out.println(b);
	}
	
	public void displaySet() {
		TreeSet<Integer> hs = new TreeSet<Integer>();
		hs.add(200);
		hs.add(400);
		hs.add(100);
		hs.add(500);
		hs.add(100);
		System.out.println(hs);
		
		TreeSet<Integer> ts = new TreeSet<Integer>((x,y)->(x>y)?-1:(x<y)?+1:0);
		ts.add(200);
		ts.add(400);
		ts.add(100);
		ts.add(500);
		ts.add(100);
		System.out.println(ts);
		
		
		
	}
	
	public void displayMap() {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "ABC");
		tm.put(200, "abc");
		tm.put(600, "KYC");
		tm.put(400, "zzz");
		System.out.println(tm);
		
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>((x,y)->(x>y)?-1:(x<y)?+1:0);
		tm1.put(100, "ABC");
		tm1.put(200, "abc");
		tm1.put(600, "KYC");
		tm1.put(400, "zzz");
		System.out.println(tm1);
		
	}
	
	public static void main(String[] args) {
		
		Testing t = new Testing();
		t.displayList();
		t.displaySet();
		t.displayMap();
	
	}

}
