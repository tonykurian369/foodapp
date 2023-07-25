package com.ust.app.Food.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ust.app.Food.Model.Food;

@Repository
public interface  FoodRepo  extends JpaRepository<Food, Integer>
{
    @Query("SELECT b FROM Food b WHERE b.name = :name")
	public List<Food> findbyname(@Param("name") String name);
}
