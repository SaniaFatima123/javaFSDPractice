package com.example.employeems.dao;

import com.example.employeems.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class EmployeeDaoImpl implements IEmployeeDao{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public Employee save(Employee employee) {
        entityManager.merge(employee);
        return employee;
    }

    @Override
    public Employee findById(int id) {
      Employee employee = entityManager.find(Employee.class,id);
      return employee;
    }



    @Override
    public List<Employee> findByName(String nameStr) {
       String query = "from Employee where name =:nameParam";
       TypedQuery<Employee> typedQuery = entityManager.createQuery(query,Employee.class);
       typedQuery.setParameter("nameParam",nameStr);
       List<Employee> foundName = typedQuery.getResultList();
       return foundName;
    }

    @Override
    public void delete(Employee employee) {
      entityManager.remove(employee);
    }

    @Override
    public List<Employee> findAll() {
       String query = "from Employee";
       TypedQuery<Employee> typedQuery = entityManager.createQuery(query,Employee.class);
       List<Employee> foundAll = typedQuery.getResultList();
       return foundAll;

    }
}
