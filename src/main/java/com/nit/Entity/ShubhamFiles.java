package com.nit.Entity;

import java.io.Serializable;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class ShubhamFiles implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Lob
	private byte[] photo;
	@Lob
	private char[] resume;
	public ShubhamFiles( byte[] photo, char[] resume) {
		super();
		this.id = id;
		this.photo = photo;
		this.resume = resume;
	}
	public ShubhamFiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public char[] getResume() {
		return resume;
	}
	public void setResume(char[] resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "ShubhamFiles [id=" + id + ", photo=" + Arrays.toString(photo) + ", resume=" + Arrays.toString(resume)
				+ "]";
	}
	
	
}
