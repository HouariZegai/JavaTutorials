package com.houarizegai.jdbcworkshop;

import com.houarizegai.jdbcworkshop.dao.DBConnection;
import com.houarizegai.jdbcworkshop.dao.EmployeeDao;
import com.houarizegai.jdbcworkshop.dao.EmployeeDaoImpl;
import com.houarizegai.jdbcworkshop.model.Employee;
import com.houarizegai.jdbcworkshop.model.EmployeeBuilder;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        Employee newEmployee = new EmployeeBuilder()
                .name("Houari")
                .gender(true)
                .salary(2000)
                .build();

//        employeeDao.save(newEmployee);
//        employeeDao.deleteById(1);
    }
}
