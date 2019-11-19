package com.shoppinglist.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shoppinglist.model.GroceryListInfo;

@Repository
public interface GListRepo extends CrudRepository<GroceryListInfo,Integer> {
}
