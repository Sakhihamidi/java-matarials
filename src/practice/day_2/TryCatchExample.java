package practice.day_2;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchExample {

	 public static void main(String[] args) {
	        File fileObj = new File("C:\\Users\\sakhi\\Desktop\\Tek School\\Java\\GFG.txt.txt");

	        try {
	            Scanner scanfile = new Scanner(fileObj);

	            while (scanfile.hasNextLine()) {
	                System.out.println(scanfile.nextLine());
	            }

	            scanfile.close(); // Close the scanner
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	    }
	}