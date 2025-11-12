package com.java.util;

import java.util.Scanner;

public class InputHelper {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String nextLine(String msg)
	{
		System.out.println("msg");
		return sc.nextLine();
	}
	
	public static double nextDouble(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    public static int nextInt(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

}
