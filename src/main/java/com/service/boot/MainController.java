package com.service.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@RequestMapping("/data")
	public List<Main> getAllData()
	{
		return mainService.getAllData();
	}

	@RequestMapping("/data/{name}")
	public Main getData(@PathVariable("name") String myname)
	{
		return mainService.getData(myname);
	}
	
	@RequestMapping("/datas")
	public String getnewData(@RequestParam("id") int id)
	{
		return "id of this user is :: " +id;
	}
	
	
}
