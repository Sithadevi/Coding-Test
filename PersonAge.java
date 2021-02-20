package test;

import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {
		int children=0;
		int adult=0;
		int seniorCitizen=0;
		int age[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=1;i<age.length;i++)
		{
			age[i]=sc.nextInt();
		}
		for(int i=0;i<age.length;i++)
		{
			if(age[i]<18)
			{
				age[i]=sc.nextInt();
				children++;
			}
			else if(age[i]>=18 && age[i]<=54)
			{
				adult++;
			}
			else if(age[i]>=55)
			{
				seniorCitizen++;
			}
		}
		System.out.println("Children:"+children);
		System.out.println("Adult:"+adult);
		System.out.println("senior citizen:"+children);

	}

}
