package com.in60minutes.service;

import com.in60minutes.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveDataEmp(Employee employee);

    List<Employee> getEmployeesDate();

    Employee getByEmoId(String id);


    String deleteEmpId(String id);

    Employee getUpdate(String id, Employee employee);
}
