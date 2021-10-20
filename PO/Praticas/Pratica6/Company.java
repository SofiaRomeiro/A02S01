package ap6;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Employee {
  private String _name;
  private int _salary;

  public Employee(String name, int sal) {
    _name = name;
    _salary = sal;
  }

  public String getName() {
    return _name;
  }

  public int getSalary() {
    return _salary;
  }

  public String toString() {
    return String.format("Empregado : %s : %d", _name, _salary);
  }

  public boolean equals(Object obj) {
    return obj instanceof Employee &&
      _name.equals(((Employee)obj)._name);
  }

  public int hashCode() {
    return _name.hashCode();
  }
}

public class Company {
  private Set<Employee> _employees;

  public Company() {
    _employees = new HashSet<>();
  }

  public boolean add(Employee e) {
    return _employees.add(e);
  }

  public void printEmployees() {
    for(Employee e : _employees)
      System.out.println(e.toString());
  }

  public List<Employee> getEmployeesWithSalaryGreaterThen(int sal) {
    List<Employee> res = new ArrayList<>();

    for(Employee e : _employees)
      if (e.getSalary() >= sal)
        res.add(e);

    return res;
  }
 
  public void removeEmployeesWithName(String startingName) {
    
    Iterator<Employee> iter = _employees.iterator();

    while (iter.hasNext())
      if (iter.next().getName().startsWith(startingName)) {
        iter.remove();
      }
  }
} 
