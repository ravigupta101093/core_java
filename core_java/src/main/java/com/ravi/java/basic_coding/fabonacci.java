package com.ravi.java.basic_coding;
/*
 * in this program print the fabonacci series 
 */
class Fabonacci
{   
	int a=0,b=1,c,n=8,i;
	void getdata()
	{
	
		System.out.print(a+" "+b);
		for(i=2;i<n;i++)
		{
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		}
	}
	public static void main(String args[])
	{
		Fabonacci f1=new Fabonacci();
		f1.getdata();
	}
}