package com.nit.Service;

import java.util.List;

import com.nit.Entity.Parent;

public interface IParentAndChildService {

	public String saveParent(Parent parent);
	public String fetchbyId(int id);
	public List<Parent> fetchAll();
	public Parent fetchChildById(int id);
}
