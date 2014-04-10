package com.greglturnquist.springagram;

import org.springframework.data.rest.core.annotation.Description;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Gallery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Description("Short description of this gallery")
	private String description;

	@OneToMany(mappedBy = "gallery")
	@Description("Collection of pics found in this gallery")
	private List<Item> items;

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
