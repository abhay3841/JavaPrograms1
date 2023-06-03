package com.fusion.institute.core.java.io;

import java.io.File;

public class ReadFilesFromFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\Admin\\Desktop");
		String filenames[] = f.list();
		for (String filename : filenames) {
			System.out.println(filename);
		}

	}

}
