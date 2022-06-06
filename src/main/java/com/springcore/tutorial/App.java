package com.springcore.tutorial;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        
        //Setter Injection
        Student s1= (Student) context.getBean("student1");
        //System.out.println(s1);
        
        //Object  Injection
        Employee e1= (Employee) context.getBean("Emp1");
        //System.out.println(e1.getEmpName());
        //System.out.println(e1.getPhones());
        //System.out.println(e1.getCourses());
        //System.out.println(e1.toString());
        
        //Constructor Injection
        Cars c= (Cars) context.getBean("cars");
        //System.out.println(c.toString());
        
        //c Schema
        Books books= (Books) context.getBean("books");
        //System.out.print(books.printAuthor());
        
        //Autowiring-XML
        Worker worker= (Worker) context.getBean("worker");
        //worker.showAddress();
        
        //Autowiring-Annotation
        Laptop laptop= (Laptop) context.getBean("laptop");
        laptop.showGames();
        
        
    }
}
