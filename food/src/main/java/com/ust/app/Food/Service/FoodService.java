package com.ust.app.Food.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ust.app.Food.Model.Food;

public interface FoodService 
{
public Food addfood(Food food);
public List<Food> getfood();
public Food Searchbyid(int id);
public Food updatedata(Food food);
public List<Food> findbyname(String name);
public void deletefood(int id);
}
