package lockedMe.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandlingFunctions {
	private static Scanner scan = new Scanner(System.in);
	private static FileHandlingFunctions object = new FileHandlingFunctions();

	public void displaySortedFiles() {

		String rootDirectory = "\\";

		File dir = new File(rootDirectory);

		String[] searchedFiles = dir.list();

		if (searchedFiles == null) {
			System.out.println("No files exits in the root directory");
		} else {
			
			
			sort(searchedFiles, 0, searchedFiles.length-1);
//			String temp = "";
//			for (int i = 0; i < searchedFiles.length; i++) {
//				for (int j = 1; j < (searchedFiles.length - i); j++) {
//
//					if (searchedFiles[j - 1].compareToIgnoreCase(searchedFiles[j]) > 0) {
//						// swap elements
//						temp = searchedFiles[j - 1];
//						searchedFiles[j - 1] = searchedFiles[j];
//						searchedFiles[j] = temp;
//					}
//
//				}

//			}
			
			
			System.out.println("The sorted files in the root directory");
			System.out.println();
			for (int i = 0; i < searchedFiles.length; i++) {
				String filename = searchedFiles[i];
				System.out.println(filename);
			}
		}
	}

	private void sort(String[] searchedFiles, int low, int high) {
		if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(searchedFiles, low, high);
  
            // Recursively sort elements before
            // partition and after partition
            sort(searchedFiles, low, pi-1);
            sort(searchedFiles, pi+1, high);
        }
	}

	private int partition(String[] searchedFiles, int low, int high) {
		
		int pivot = high;
		
//		int pivot = searchedFiles[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
        	if(searchedFiles[j].compareToIgnoreCase(searchedFiles[pivot])<0)
//            if (searchedFiles[j] <= pivot)
            {
                i++;
  
                // swap arr[i] and arr[j]
                String temp = searchedFiles[i];
                searchedFiles[i] = searchedFiles[j];
                searchedFiles[j] = temp;
            }
        }
  
        // swap arr[i+1] and arr[high] (or pivot)
        String temp = searchedFiles[i+1];
        searchedFiles[i+1] = searchedFiles[high];
        searchedFiles[high] = temp;
  
        return i+1;
	}

	public void option2Functions() {
		// TODO Auto-generated method stub
		char choice;
		do {
			System.out.println("Select your choice");
			System.out.println("a. Create a File");
			System.out.println("b. Delete a File");
			System.out.println("c. Search a File");
			System.out.println("d. Go to Main Menu");

			choice = scan.next().charAt(0);

			switch (choice) {
			case 'a':
				object.createFile();
				break;
			case 'b':
				object.deleteFile();
				break;
			case 'c':
				object.searchFile();
				break;
			case 'd':
				System.out.println("Going to main menu");
				break;
			default:
				System.out.println("Enter Proper choice");

			}
		} while (choice != 'd');
	}

	private void createFile() {
		// TODO Auto-generated method stub
		System.out.println("Enter the File Name to Create");

		String fileName = scan.next();
		String path = "C:\\";
		String name = path + fileName;
		try {
			File myObj = new File(name);
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	private void deleteFile() {
		// TODO Auto-generated method stub

		System.out.println("Enter the File Name to Delete");
		scan.nextLine();
		String fileName = scan.nextLine();
		String path = "C:\\";
		String name = path + fileName;
		File file = new File(name);
		try {
			if (file.delete()) {
				System.out.println(fileName + " file deleted successfully");
			} else {
				System.out.println(fileName + " file not found ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void searchFile() {

		String directoryName = "\\";

		System.out.println("Enter the file name to be searched");
		scan.nextLine();
		String fileName = scan.nextLine();

		String file = directoryName + fileName;

		File dir = new File(file);

		if (dir.isFile())
			System.out.println(fileName + " is present in " + directoryName + " directory");
		else
			System.out.println(fileName + " is not found in " + directoryName + " directory");

	}

}
