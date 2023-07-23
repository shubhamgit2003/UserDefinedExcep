package com.jbs.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jbs.excep.RollException;
import com.jbs.model.Student;
public class Main {
	
	public static void main(String[] args) throws RollException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter roll no. : ");
			int roll=Integer.parseInt(br.readLine());
			System.out.println("Enter name: ");
			String name=br.readLine();
			Student s1=new Student(roll,name);
			System.out.println(s1);
			}catch(NumberFormatException e){
				System.out.println(e);
			}
			catch(IOException e){
				System.out.println(e);
			}
		catch(RollException e){
			System.out.println(e);
		}
		System.out.println("End of main function....");
	}
	

}