package com.simplilearn.elson;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockersOperations extends ProjectFilePath{

	public static void mainMenu() {
		System.out.println("###########################");
		System.out.println("\t\tWelcome to Company Lockers");
		System.out.println("############################");
		System.out.println("\t\t1. Show all the files");
		System.out.println("\t\t2. Create a new File");
		System.out.println("\t\t3. Remove a file");
		System.out.println("\t\t4. Find a file");
		System.out.println("\t\t5. Exit the application");
	}
	public static void getAllFiles() {
		try {
			File folder = new File(ProjectFilesPath);
			File[] listOffiles = folder.listFiles();
			if(listOffiles.length == 0)
				System.out.println("No file in the folder");
			else
			{
				for(var l:listOffiles)
				{
					System.out.println(l.getName());
				}
			}

		}		

			catch (Exception Ex) {
				System.out.println("Some error occured contact admin");

			}
	}
	public static void createaFile() {
		try {
			Scanner obj = new Scanner(System.in);
				String fileName;

				System.out.println("Enter the name of file to be created");
				fileName = obj.nextLine();

				int linesCount;
				System.out.println("Enter how many lines in file:");



					linesCount = Integer.parseInt(obj.nextLine());

				FileWriter myWriter = new FileWriter(ProjectFilesPath+ "\\"+ fileName);

				for(int i=1; i<=linesCount;i++)
				{
					System.out.println("Enter the" +i+"line");
					if(obj.hasNextLine()) {
					myWriter.write(obj.nextLine()+"\n");
					}

					}

				System.out.println("File creation done successfully");
				myWriter.close();
			
			}

			
		catch (Exception Ex)
		{
			System.out.println("Some error occured contact support team");
		}


	}
	public static void deleteaFile() {
		Scanner obj = new Scanner(System.in);
			try
			{
				String fileName;
				System.out.println("Enter the name of the file to be deleted:");

				fileName = obj.nextLine();

				File file = new File(ProjectFilesPath+ "\\" +fileName ) ;
				if(file.exists())
				{
					file.delete();
					System.out.println("File has be deleted successfully:"+ fileName);

				}
				else
					System.out.println("The file donot exist");

			}
			catch (Exception Ex)
			{
				System.out.println("Some error occured please contact support team");
			}
		}


	
	public static void searchaFile() {
		Scanner obj = new Scanner(System.in);
			try
			{
				String fileName;

				System.out.println("Enter the name of the file to be searched: ");

				fileName = obj.nextLine();
				File folder = new File(ProjectFilesPath);
				File[] listOfFiles = folder.listFiles();

				LinkedList<String> filenames = new LinkedList<String>();

				for(var l:listOfFiles)
					filenames.add(l.getName());

				if(filenames.contains(fileName))
					System.out.println("The file is available");
				else
					System.out.println("The file is not available");
			}
			catch(Exception Ex)
			{

				System.out.println("Some error occured please contact support team");

			}
		


	}









}