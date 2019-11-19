package com.shoppinglist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GroceryListInfo")
public class GroceryListInfo {
	@Id
	@Column(name="groceryId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int groceryId;
	
	@Column(name="itemName")
	private String itemName;
	
	@Column(name="price")
	private long price;
	
	@Column(name="type")
	private String type;

	public int getGroceryId() {
		return groceryId;
	}

	public void setGroceryId(int groceryId) {
		this.groceryId = groceryId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groceryId;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		GroceryListInfo other = (GroceryListInfo) obj;
		if (groceryId != other.groceryId)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroceryListInfo [groceryId=" + groceryId + ", itemName=" + itemName + ", price=" + price + ", type="
				+ type + "]";
	}

	public GroceryListInfo(int groceryId, String itemName, long price, String type) {
		super();
		this.groceryId = groceryId;
		this.itemName = itemName;
		this.price = price;
		this.type = type;
	}

	
	
}
