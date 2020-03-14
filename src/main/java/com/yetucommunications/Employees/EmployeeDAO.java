package com.yetucommunications.Employees;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.yetucommunications.Employees;
@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Long> {


}
