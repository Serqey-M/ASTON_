package org.example;

public class Employee {
    public String name;
    public String post;
    public String email;
    public String telephone;
    public double salary;
    public int age;

    public Employee(String _name, String _post, String _email, String _telephone, double _salary, int _age) {
        name = _name;
        post = _post;
        email = _email;
        telephone = _telephone;
        salary = _salary;
        age = _age;
    }

    public void info() {
        System.out.println("Сотрудник: " + name + ", должность - " + post + ", email - " + email + ", телефон - " + telephone + ", зарплата - " + salary + ", возраст - " + age);
    }

}