package com.common;

import java.util.Random;

public class CommonRandomNum {
	public static long createRandomNumber() {
		Random rand=new Random();
		return rand.nextInt(1000);
	}

}
