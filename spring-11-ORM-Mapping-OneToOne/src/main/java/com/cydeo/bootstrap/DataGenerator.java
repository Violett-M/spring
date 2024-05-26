package com.cydeo.bootstrap;

import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.entity.Region;
import com.cydeo.enums.Gender;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

 //   DepartmentRepository departmentRepository;
    EmployeeRepository employeeRepository;

    public DataGenerator(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        Department d1 = new Department("Engineering", "AI");
        Department d2 = new Department("Sales", "Direct");
        Department d3 = new Department("Tech", "Migration");
        Department d4 = new Department("Sports", "Outdoors");
        Department d5 = new Department("Computers", "Electronics");

        Employee em1 = new Employee("Ivan", "Ivanov", "ivanov@cydeo.com", LocalDate.now(), Gender.MALE, 100000);
        Employee em2 = new Employee("Anastasia", "Liberman", "liberman@cydeo.com", LocalDate.now(), Gender.FEMALE, 80000);
        Employee em3 = new Employee("Ozzy", "Kurd", "kurd@cydeo.com", LocalDate.now(), Gender.MALE, 150000);

        Region r1 = new Region("Southwest", "United States");
        Region r2 = new Region("Central", "United States");
        Region r3 = new Region("Northwest", "United States");
        Region r4 = new Region("Quebec", "Canada");
        Region r5 = new Region("Central", "Asia");

        employeeList.addAll(Arrays.asList(em1,em2,em3));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        em1.setDepartment(d1);
        em2.setDepartment(d2);
        em3.setDepartment(d3);

        em1.setRegion(r1);
        em2.setRegion(r2);
        em3.setRegion(r3);

        employeeRepository.saveAll(employeeList);
    //    departmentRepository.saveAll(departmentList);

    }
}
