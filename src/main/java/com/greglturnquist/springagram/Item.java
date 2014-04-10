package com.greglturnquist.springagram;

import org.springframework.data.rest.core.annotation.Description;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Description("The name of the image")
	private String name;

	@Lob
	@Description("The image stored as a base64 image encoding")
	private String image;

	@ManyToOne
	@Description("The gallery this pic is found in (if null, it's unlinked)")
	private Gallery gallery;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
