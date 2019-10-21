package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department dp = new Department(1, "Books");
        Seller s = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, dp);
        System.out.println(s);
        System.out.println(dp);
    }
}
