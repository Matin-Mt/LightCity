package org.example.defualtSystem;

import org.example.models.Character;
import org.example.models.Employee;
import org.example.models.Industry;
import org.example.models.Property;

import java.util.ArrayList;

public class Hotel extends Industry {

    private static final int MAX_EMPLOYEE_COUNT = 5;
    private static final float BASE_EMP_SALARY = 0.5f;
    private static final float MAX_PASSENGER_COUNT = 10;
    private ArrayList<Character> passengers = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();
    public Hotel(String title, Property property, Character character) {
        super(title, property, character,BASE_EMP_SALARY);
    }
    public void AddPassenger(Character character){
        if(MAX_PASSENGER_COUNT<10){
            passengers.add(character);
        }else{
            System.out.println("ُSorry . This hotel is full !");
        }
    }
    public void AddEmployee(Employee employee){
        if(MAX_EMPLOYEE_COUNT<5){
            employees.add(employee);
        }else{
            System.out.println("ُSorry . The hotel does not need an employee !");
        }

    }
    boolean employee_exist = false;
    public void EmployeeDismissal(Employee employee){
        for (int i=0;i<5;i++){
            if(employees.get(i) == employee){
                employee_exist = true;
                employees.remove(i);
            }
        }
        if(employee_exist == true ){
            System.out.println("Successfully fired");
        }
        if(employee_exist == false){
            System.out.println("There is no such employee in this hotel !");
        }
    }


}
