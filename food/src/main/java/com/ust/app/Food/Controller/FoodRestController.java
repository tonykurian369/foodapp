package com.ust.app.Food.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ust.app.Food.Model.Food;
import com.ust.app.Food.Service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodRestController 
{
@Autowired
private FoodService service;

@PostMapping("/post")
@ResponseStatus(HttpStatus.CREATED)
public Food addfood(@RequestBody Food food)
{
	return service.addfood(food) ;
}

@GetMapping("/get")
@ResponseStatus(HttpStatus.OK)
public List<Food> getfood()
{
	return service.getfood();
}

@GetMapping("/{id}")
@ResponseStatus(HttpStatus.OK)
public Food Searchbyid(@PathVariable("id") int id)
{
	return service.Searchbyid(id);
}

@PutMapping("/up")
@ResponseStatus(HttpStatus.OK)
public Food updatedata(@RequestBody Food food)
{
	 return service.updatedata(food);
}


@GetMapping("/name/{name}")
@ResponseStatus(HttpStatus.OK)
public List<Food> findbyname(@PathVariable("name") String name)
{
	return service.findbyname(name);
}

}
