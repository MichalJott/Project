package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class SearchingFacadeTest {


    @Autowired
    SearchingFacade searchingFacade;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    @Test
    public void findCompanyByName() {
        //Given
        companyDao.deleteAll();
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        //When
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);


        List<Company> foundCompany = searchingFacade.findCompanyByName("Mae");
        //Then
        try {
            Assert.assertEquals(1, foundCompany.size());
        } finally {
            //CleanUp
            companyDao.delete(softwareMachine);
            companyDao.delete(dataMaesters);
            companyDao.delete(greyMatter);

        }
    }

    @Test
    void findEmployeeByName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);


        List<Employee> foundEmployee = searchingFacade.findEmployeeByName("ith");
        //Then
        try {
            Assert.assertEquals(1, foundEmployee.size());
        } finally {
            //CleanUp
            employeeDao.delete(johnSmith);
            employeeDao.delete(stephanieClarckson);
            employeeDao.delete(lindaKovalsky);

        }


    }
}