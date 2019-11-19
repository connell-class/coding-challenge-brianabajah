package com.shoppinglist.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shoppinglist.model.GroceryItem;

@Repository
public interface GItemRepo extends CrudRepository<GroceryItem,Integer> {

}
