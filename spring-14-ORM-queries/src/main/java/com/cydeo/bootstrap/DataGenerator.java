package com.cydeo.bootstrap;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("--------REGION START--------");

        System.out.println(regionRepository.findByCountry("Canada"));
        System.out.println(regionRepository.findDistinctByCountry("Canada"));
        System.out.println(regionRepository.findAllByCountryContaining("United"));
        System.out.println(regionRepository.findAllByCountryContainingOrderByCountry("Asia"));
        System.out.println(regionRepository.findTop2ByCountry("Canada"));

        System.out.println("--------REGION END--------");

        System.out.println("--------DEPARTMENT START--------");

        System.out.println(departmentRepository.findAllByDepartment("Toys"));
        System.out.println(departmentRepository.findByDivisionIs("Health"));
        System.out.println(departmentRepository.findByDivisionEquals("Kids"));
        System.out.println(departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

        System.out.println("--------DEPARTMENT END--------");

        System.out.println("--------EMPLOYEE START--------");

        System.out.println(employeeRepository.findAllByEmail("dtrail8@tamu.edu"));
        System.out.println(employeeRepository.findAllByFirstNameAndLastNameOrEmail("Berrie","Curwood","btrow5@technorati.com"));
        System.out.println(employeeRepository.findAllByFirstNameIsNot("Curwood"));

        System.out.println("--------JPQL--------");
        System.out.println(employeeRepository.getEmployeeDetail());
        System.out.println(employeeRepository.getEmployeeSalary());
        System.out.println(employeeRepository.getEmployeeDetail("jcolumj@pen.io"));

        System.out.println("--------EMPLOYEE END--------");


        System.out.println("--------COURSE START--------");

        courseRepository.findByCategory("Spring").forEach(System.out::println);
        System.out.println("----------");
        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println("-------");
        System.out.println(courseRepository.existsByName("Rapid Spring Boot Application Development"));
        System.out.println(courseRepository.countByCategory("Spring"));
        courseRepository.findByNameStartingWith("Scalable").forEach(System.out::println);
        System.out.println("-----------");

      //  courseRepository.streamByCategory("Spring").forEach(System.out::println);

        System.out.println("--------COURSE END--------");

    }
}
