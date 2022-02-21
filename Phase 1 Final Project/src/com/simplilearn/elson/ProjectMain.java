package com.simplilearn.elson;

import java.util.Scanner;

public class ProjectMain extends LockersOperations {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int ch;
		do
		{
			mainMenu();
			System.out.println("Enter your choice:");
			ch = Integer.parseInt(obj.nextLine());
			
			switch(ch)
			{
				case 1:getAllFiles();
				break;
				case 2:createaFile();
				break;
				case 3:deleteaFile();
				break;
				case 4:searchaFile();
				break;
				case 5:System.exit(0);
				break;
				default:System.out.println("Invalid option: Please enter only the option above");
				break;
				
				}
		}
			while(ch>0);
			obj.close();
	}

}
