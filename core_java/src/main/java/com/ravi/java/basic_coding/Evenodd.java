package com.ravi.java.basic_coding;

/*
 * @author - ravi gupta
 * @date  - 28 dec 2018
 * 
 * this program will separate even and odd no
 * 
 */


import java.util.*;
public class Evenodd
{

	void  evenOddSort() {
		int a[]={7,5,8,6,4,2,1};
		int i = 0;
		int j = a.length - 1;
		int temp;
		while (i < j) {
			if (a[i] % 2 == 0) {
				i++;
			} else if (a[j] % 2 != 0) {
				j--;
			} else {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(" "+Arrays.toString(a));


	}
	public static void main(String args[])
	{

		Evenodd e1=new Evenodd();
		e1.evenOddSort();
	}
}