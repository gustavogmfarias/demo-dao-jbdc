package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartmentDao dpDao = DaoFactory.createDepartmentDao();

		System.out.println("\n==============Teste número 1: dp insert");
		Department newDp = new Department(null,"vasco");
		dpDao.insert(newDp);
		
		
		System.out.println(newDp.getId());
		System.out.println(newDp.getName());

//
	}
}
