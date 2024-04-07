package com.sts.converter;



import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sts.binding.Customer;

public class App {
	public static void main(String[] args) throws Exception {
		App a=new App();
		a.convertJavaToJson();
		a.convertJsontoJava();
	}
	public void convertJsontoJava()throws Exception {
		ObjectMapper mapper=new ObjectMapper();
		mapper.readValue(new File("customer.json"),Customer.class);
		System.out.println("De-Serializion Completed....");

	}

	public void convertJavaToJson() throws Exception
	{
		Customer c= new Customer(101,"ram",253557556);
		
		ObjectMapper mapper =new ObjectMapper();
		mapper.writeValue(new File("customer.json"),c);
		System.out.println("Serializion Completed....");
	}
}
