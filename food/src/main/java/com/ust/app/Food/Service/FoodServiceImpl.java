package com.ust.app.Food.Service;

import java.util.List;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.app.Food.Model.Food;
import com.ust.app.Food.Repositry.FoodRepo;

@Service
public class FoodServiceImpl implements FoodService
{
	@Autowired
	private FoodRepo repo;
	
	
	@PostConstruct
	public void initSomeCustomer() {
		Food c1 = new Food(1001,"briyani","veg",120);
		Food c2 = new Food(1002,"chk-briyani"," non-veg",160);
		Food c3 = new Food(1003,"rice","veg",85);
		repo.save(c1);
		repo.save(c2);
		repo.save(c3);
	}

	public Food addfood(Food food) {
		return repo.save(food);
	}

	
	public List<Food> getfood() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Food Searchbyid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}


	@Override
	public Food updatedata(Food food) {
		// TODO Auto-generated method stub
		return repo.save(food);
	}

	@Override
	public void deletefood(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
	}

	@Override
	public List<Food> findbyname(String name) {
		// TODO Auto-generated method stub
		return repo.findbyname(name);
	}

}
