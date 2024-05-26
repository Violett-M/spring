package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    CarRepository carRepository;
    DepartmentRepository departmentRepository;
    EmployeeRepository employeeRepository;

    public DataGenerator(CarRepository carRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("BMW", "M5");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Toyota", "Corolla");

        //save these objects to db
        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);

        Department d1 = new Department("Engineering", "AI");
        Department d2 = new Department("Sales", "Direct");
        Department d3 = new Department("Tech", "Migration");

        departmentRepository.save(d1);
        departmentRepository.save(d2);
        departmentRepository.save(d3);

        Employee em1 = new Employee("Ivan", "Ivanov", "ivanov@cydeo.com", LocalDate.now(), d1.getDepartment(), Gender.MALE, 100000, 1);
        Employee em2 = new Employee("Anastasia", "Liberman", "liberman@cydeo.com", LocalDate.now(), d2.getDepartment(), Gender.FEMALE, 80000, 1);
        Employee em3 = new Employee("Ozzy", "Kurd", "kurd@cydeo.com", LocalDate.now(), d3.getDepartment(), Gender.MALE, 150000, 3);

        employeeRepository.save(em1);
        employeeRepository.save(em2);
        employeeRepository.save(em3);

    }
}
