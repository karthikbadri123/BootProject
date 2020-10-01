package com.service.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class MainService {

	
		Main m1=new Main("Guru",1);
		Main m2=new Main("Badri",2);
		
		private ArrayList<Main> alldata = new ArrayList<Main>();
		
	  
		public MainService()
		  {
			  alldata.add(m1);
			  alldata.add(m2);
		  }
	
	
        public List<Main> getAllData()
		{
			System.out.println("returing all data from service class");
			return alldata;
		}
		
		public Main getData(String name)
		{
			Main main=null;
			for (Main m:alldata)
			{
				if (m.getName().equals(name))
					main=m;
			}
			return main;
		}
	
}