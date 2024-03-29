package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("----FIND BY ID----");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();

        System.out.println("----FIND BY DEPARTMENT----");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("----FIND ALL----");
        list = sellerDao.findAll();
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("----Seller insert----");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
        System.out.println();

        System.out.println("----Seller update----");
        seller = sellerDao.findById(10);
        seller.setName("Martha Waine");
        seller.setEmail("martha@gmail.com");
        sellerDao.update(seller);
        System.out.println("Update completed!");
        System.out.println();

        System.out.println("----Seller delete----");
        sellerDao.deleteById(7);
        System.out.println("Seller deleted!");

    }
}
