package com.fusion.institute.core.spring.java;

import java.io.File;
import java.util.Scanner;

public class A{
		public static void main(String[] args) {
			
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("enter the words");
				String enter = scan.next();
				File fi = new File(enter);
				boolean createNewFile = fi.createNewFile();
				System.out.println(createNewFile);
					scan.close();
					File f2 = new File(enter);
							String[] list = f2.list();
							for (String string : list) {
								System.out.println(string);
						}
			} catch (Exception e) {
			}
		}
	}
