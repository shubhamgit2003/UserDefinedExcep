package com.jbs.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

import com.jbs.excep.RollException;
import com.jbs.model.Student;
public class Main {
	
	public static void main(String[] args){
		List<Student> al = new ArrayList<>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try{
			for(int i=0; i<=5; i++) {
				System.out.println("Enter roll no. : ");
				int roll=Integer.parseInt(br.readLine());
				System.out.println("Enter name: ");
				String name=br.readLine();
				al.add(new Student(roll,name));
			}
			System.out.println("List of the students:: ");
			for(Student s : al) {
				System.out.println(s);
			}
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