package com.capgemini.movie.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.movie.dto.User;

public class UserLoginService {
	
	public void ed()
	{
	File logFile = new File("C:\\Users\\adity\\Documents\\workspace-spring-tool-suite-4-4.5.1.RELEASE\\MovieSprint\\src\\main\\resources\\LoginCredentials.txt");
	FileOutputStream fos = null;
	HashMap<String, String> hm = new HashMap<String, String>();
	User user1 = new User("AdityaPar","124563");
	//User user2 = new User("AdityaPar","124563");
	//User user3 = new User("AdityaPar","124563");
	//User user4 = new User("AdityaPar","124563");
	//User user5 = new User("AdityaPar","124563");
	hm.put(user1.getUserName(), user1.getPassword());
	}
	
	public void Login()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the username: ");
		String userName = sc.nextLine();
		System.out.print("Enter the password: ");
		String password = sc.nextLine();
		User obj = new User(userName,password);
		
	}
	
	public boolean isValid(username,password)
	{
	}
	
}
