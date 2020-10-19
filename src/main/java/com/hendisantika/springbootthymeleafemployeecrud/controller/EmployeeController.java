package com.hendisantika.springbootthymeleafemployeecrud.controller;

import com.hendisantika.springbootthymeleafemployeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-employee-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/10/20
 * Time: 22.01
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
}
