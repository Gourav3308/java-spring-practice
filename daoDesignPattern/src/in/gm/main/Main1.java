package in.gm.main;

import in.gm.dao.InsertDao;
import in.gm.dao.InsertDaoImp;

public class Main1 {
	public static void main(String[] args) {
		
		InsertDao id= new InsertDaoImp();
		boolean status=id.insertion();
		
		if(status) {
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
	}

}
