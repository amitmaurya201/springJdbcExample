package com.amit.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String args[]) {
    System.out.println("my program started.....");
      ApplicationContext context = new ClassPathXmlApplicationContext("com/amit/model/config.xml");
      JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
      String query = "insert into springexample(id,name,city) values(?,?,?)";
      int result = template.update(query,356,"akashy kumar","luchnow");
      System.out.println("numer of record inserted"+result);
      
	
	}

}
