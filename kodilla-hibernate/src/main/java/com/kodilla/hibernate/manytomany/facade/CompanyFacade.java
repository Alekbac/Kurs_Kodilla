package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class CompanyFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    List<Company> searchName (String retrieveCompanyName){
        return companyDao.findByPartOfName(retrieveCompanyName);
    }

    List<Employee> searchEmployee (String retrieveEmployeeLastname){
        return employeeDao.findByPartOfLastname(retrieveEmployeeLastname);
    }
}
