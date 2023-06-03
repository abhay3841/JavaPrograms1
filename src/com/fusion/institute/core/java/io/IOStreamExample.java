package com.fusion.institute.core.java.io;

import java.io.File;
import java.io.IOException;

public class IOStreamExample {
	public static void main(String[] args) {
		try {
			File file = new File("file123.txt");
			
			if (file.createNewFile()) {
				System.out.println("New File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
