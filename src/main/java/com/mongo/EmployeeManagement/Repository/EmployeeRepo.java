package com.mongo.EmployeeManagement.Repository;

import com.mongo.EmployeeManagement.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Integer> {
}
