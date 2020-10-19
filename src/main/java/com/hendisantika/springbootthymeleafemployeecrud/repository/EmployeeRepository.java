package com.hendisantika.springbootthymeleafemployeecrud.repository;

import com.hendisantika.springbootthymeleafemployeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-employee-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/10/20
 * Time: 21.57
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
