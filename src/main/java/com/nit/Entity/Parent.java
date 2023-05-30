package com.nit.Entity;

import java.util.List;

import org.hibernate.annotations.JoinColumnOrFormula;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Parent {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String name;
	
	@OneToMany(targetEntity =Child.class,fetch =FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "FK_ID", referencedColumnName = "ID")
	private List<Child> accessories;

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

	public List<Child> getAccessories() {
		return accessories;
	}

	public void setAccessories(List<Child> accessories) {
		this.accessories = accessories;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", name=" + name + ", accessories=" + accessories + "]";
	}
	
	
}
