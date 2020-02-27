package com.capgemini.movie.exe;
import java.util.Scanner;

import com.capgemini.movie.Service.UserLoginService;

public class MovieController {
	
		Scanner sc = new Scanner(System.in);
		public static void main(String[] args) 
		{
			MovieController MC = new MovieController();
			MC.logging();	
		}
		
		public void logging()
		{
			System.out.println("************************************************");
			System.out.println(" 1. User Login");
			System.out.println(" 2. Admin");
			System.out.println(" 3. View Movies");
			System.out.println("************************************************");
			System.out.println("Enter an option");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				//Login Page
			case 2:
				//Admin page
			case 3:
				//unregistered user
			case 0:
				System.out.println("");
				exit();
				break;
			}
			
			
		}	
		
}
