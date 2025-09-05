package in.gm.main;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("-----------Application started---------");
		try {
			
			FileHandler filehandler=new FileHandler("d:\\mylogdetails.log");
			
			SimpleFormatter simpleFormatter=new SimpleFormatter();
			filehandler.setFormatter(simpleFormatter);
			
			
			Logger logger=Logger.getLogger(Main.class.getName());
			logger.addHandler(filehandler);
			
			logger.log(Level.SEVERE, "Server is not responding");
			logger.log(Level.WARNING, "3 invalid loging attempts");
			logger.log(Level.INFO, "Order placed successfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("-----------Application closed---------");
	}

}
 