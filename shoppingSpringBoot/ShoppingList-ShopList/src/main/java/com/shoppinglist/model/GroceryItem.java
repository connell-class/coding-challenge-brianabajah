package com.shoppinglist.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GroceryItem")
public class GroceryItem {
	
	@Id
	@Column(name="listId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int listId;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "groceryId")
	private GroceryListInfo gli;
	
	@Column(name="groceryCount")
	private int groceryCount;

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public GroceryListInfo getGli() {
		return gli;
	}

	public void setGli(GroceryListInfo gli) {
		this.gli = gli;
	}

	public int getGroceryCount() {
		return groceryCount;
	}

	public void setGroceryCount(int groceryCount) {
		this.groceryCount = groceryCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gli == null) ? 0 : gli.hashCode());
		result = prime * result + groceryCount;
		result = prime * result + listId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		if (gli == null) {
			if (other.gli != null)
				return false;
		} else if (!gli.equals(other.gli))
			return false;
		if (groceryCount != other.groceryCount)
			return false;
		if (listId != other.listId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroceryItem [listId=" + listId + ", gli=" + gli + ", groceryCount=" + groceryCount + "]";
	}

	
}
