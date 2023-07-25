package com.ust.app.Food.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Food 
{
	@Id
	private int id;
	private String name;
	private String type;
	private double price;

}
