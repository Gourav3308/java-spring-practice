package in.gm.main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	public static void main(String[] args) {
		
		
		long startTime=System.currentTimeMillis();
		
		for(int i=1;i<1000000;i++) {
			System.out.println(i);
		}
		
		long endTime=System.currentTimeMillis();
		
		double totalTime=(endTime-startTime)/1000.0;
		
		Logger logger=Logger.getLogger(Main.class.getName());
		
		logger.log(Level.INFO, "Total time for execution is :"+totalTime);
		
	}

}
