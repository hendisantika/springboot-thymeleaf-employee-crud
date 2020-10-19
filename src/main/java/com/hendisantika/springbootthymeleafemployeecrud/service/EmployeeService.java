package com.hendisantika.springbootthymeleafemployeecrud.service;

import com.hendisantika.springbootthymeleafemployeecrud.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-employee-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/10/20
 * Time: 21.58
 */
public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}