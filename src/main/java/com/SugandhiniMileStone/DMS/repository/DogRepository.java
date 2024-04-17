package com.SugandhiniMileStone.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SugandhiniMileStone.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog>findByName(String name);
	

}
