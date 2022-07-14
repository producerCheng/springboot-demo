package com.gupao.springbootdemo;

import com.gupao.springbootdemo.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Test
    void contextLoads() {
        List<Employee> employees = Arrays.asList( new Employee("张三", 18, 9999), new Employee("李四", 38, 5555), new Employee("王五", 60, 6666), new Employee("赵六", 16, 7777), new Employee("田七", 18, 3333));
        employees.forEach(employee -> System.out.println(employee.toString()));
    }



}
