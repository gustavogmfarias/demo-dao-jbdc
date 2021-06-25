package application;

import java.util.Date;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("Teste número 1: seller findbyid");

		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\nTeste número 2: seller findByDepartment");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDerpartment(department);
		for (Seller obj : list) {

			System.out.println(obj);

			System.out.println("\nTeste número 3: seller findAll");
			list = sellerDao.findAll();
			for (Seller obj2 : list) {

				System.out.println(obj2);

			}
		}

		System.out.println("\n==============Teste número 4: seller insert");
		
		Seller newSeller  = new Seller(null, "Greg", "geg.@.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println(newSeller.getId());

		System.out.println("\n==============Teste número 5: seller update");
		
		seller = sellerDao.findById(1);
		seller.setName("Marta");
		sellerDao.update(seller);
		System.out.println("\nupdadate completed");

		System.out.println("\n==============Teste número 6: seller delete");

		sellerDao.deleteById(10);
	}
}
