package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("----FIND BY ID----");
        Department department = departmentDao.findById(2);
        System.out.println(department);
        System.out.println();

        System.out.println("----FIND ALL----");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("----Department insert----");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());
        System.out.println();

        System.out.println("----Department update----");
        department = departmentDao.findById(3);
        department.setName("Games");
        departmentDao.update(department);
        System.out.println("Update completed!");
        System.out.println();

        System.out.println("----Department delete----");
        departmentDao.deleteById(6);
        System.out.println("Department deleted!");

    }
}
