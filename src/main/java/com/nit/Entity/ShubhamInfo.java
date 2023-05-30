package com.nit.Entity;

import java.util.*;

import org.hibernate.annotations.ListIndexBase;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Birthday")
@Data
public class ShubhamInfo {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length = 20)
	private String name;
	
	@ElementCollection
	@CollectionTable(name = "FRIENDS",  joinColumns =@JoinColumn(name = "EMP_ID",referencedColumnName = "ID") )
	@OrderColumn(name = "NAME_INDX")
	@ListIndexBase(value = 1)
	@Column(length = 20)
	private List<String> friends;
	
	@ElementCollection
	@CollectionTable(name = "LOCATION" ,joinColumns = @JoinColumn(name = "EMP_ID",referencedColumnName = "ID"))
	@MapKeyColumn(name = "PIN", length = 20)
	@Column(length = 20)
	private Map<String,String> location;

	public ShubhamInfo(Integer id, String name, List<String> friends, Map<String, String> location) {
		super();
		this.id = id;
		this.name = name;
		this.friends = friends;
		this.location = location;
	}

	public ShubhamInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getLocation() {
		return location;
	}

	public void setLocation(Map<String, String> location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ShubhamInfo [id=" + id + ", name=" + name + ", friends=" + friends + ", location=" + location + "]";
	}
	
}
