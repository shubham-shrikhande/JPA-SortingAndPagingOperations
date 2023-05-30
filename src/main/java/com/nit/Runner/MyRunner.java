package com.nit.Runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nit.Entity.*;
import com.nit.Service.CService;
import com.nit.Service.ParentAndChildServiceImp;

@Component
public class MyRunner implements CommandLineRunner {

	
	@Autowired
	CService service;
	
	@Autowired
	ParentAndChildServiceImp pcservice;

	@Override
	public void run(String... args) throws Exception {
/*
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter Photo Path");
	    String photo=sc.next();
	    
	    System.out.println("Photo entered");
	    
	    System.out.println("Enter Resume Path");
	    String resume=sc.next();
	    
	    InputStream i=new FileInputStream(photo);
	    byte[] imagebyte=new byte[1000];
	    imagebyte=i.readAllBytes();
	    
	    Reader reader=new FileReader(resume);
	    File file=new File(resume);
	    char[] resumechar= new char[1000];
	    reader.read(resumechar);
		
		ShubhamFiles sh=new ShubhamFiles(imagebyte,resumechar);*/
		
		//Save Operation
		
	//	ShubhamInfo info= new ShubhamInfo(2,"Piyush",List.of("atul","pappi","vikas"),Map.of("444707","banglore","313422","dhule","311424","pune"));
		
		//String msg=service.saveCollection(info);
		//System.out.println(msg);
		
		/*List<ShubhamInfo> list=service.fetchAllData();
		for(ShubhamInfo l:list) {
			System.out.println("Frinds of "+l.getName());
			List<String> friend=l.getFriends();
		
			
			Map<String,String> location=l.getLocation();
		    System.out.println(location);
			
		    System.out.println(friend);
		}*/
		/*Child c=new Child();
		c.setAccessories("Washing Machine");
		c.setPrice(50000);
		
		Child c1=new Child();
		c1.setAccessories("Refrigerator");
		c1.setPrice(25000);
		
		Parent p=new Parent();
		p.setName("Ankush");
		p.setAccessories(List.of(c,c1));
		
		String msg=pcservice.saveParent(p);
		System.out.println(msg);
		*/
		
		//String msg=pcservice.fetchbyId(1);
		//System.out.println(msg);
		
		//fetchAll data
		//List<Parent> list=pcservice.fetchAll();
		//for(Parent l:list) {
			//for(Child c:l.getAccessories()) {
				//System.out.println(c.getAccessories()+"--"+c.getPrice());
	//		}
		//}
		
		Parent p=pcservice.fetchChildById(1);
		List<Child> c=p.getAccessories();
		for(Child acc:c) {
			System.out.println(acc);
		}
		
	}
}
