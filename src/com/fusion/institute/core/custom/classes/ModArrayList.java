package com.fusion.institute.core.custom.classes;

import java.util.Arrays;

public class ModArrayList<T> {
	private static final Integer DEFAULT_SIZE = 16;
	private Object[] arrayData;
	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	private int size = 0;

	public ModArrayList() {
		// TODO Auto-generated constructor stub
		this.arrayData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}

	public ModArrayList(int size) {
		if (!(this.arrayData.length > 0)) {
			this.arrayData = new Object[size];
		}
	}

	public boolean addElement(T element) {
		int currentLength = this.arrayData.length;
		if (currentLength == 0 && currentLength == size)
			 growSize();
		this.arrayData[size] = element;
		size += 1;
 	 return true;
	}

	private void growSize() {
		 this.arrayData = Arrays.copyOf(this.arrayData,size + DEFAULT_SIZE);
	}
}
