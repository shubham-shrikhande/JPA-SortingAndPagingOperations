package com.nit.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Entity.Child;
import com.nit.Entity.Parent;
import com.nit.Repo.ChildRepository;
import com.nit.Repo.ParentRepository;
@Service
public class ParentAndChildServiceImp implements IParentAndChildService {

	@Autowired
	ParentRepository prepo;
	@Autowired
	ChildRepository crepo;
	@Override
	public String saveParent(Parent parent) {

		Parent p=prepo.save(parent);

		return p+" Updated Successfully";
	}
	@Override
	public String fetchbyId(int id) {

		Optional<Parent> parent=prepo.findById(id);
		if(parent.isPresent()) {
			Parent p=parent.get();
			String name=p.getName();
			List<Child> c=p.getAccessories();
			for(Child data:c) {
				return "Name -"+name+" Accessories Data -"+c;
			}

		}
		return "No data found";
	}
	@Override
	public List<Parent> fetchAll() {
		List<Parent> list=prepo.findAll();
		
		return list;
	}
	@Override
	public Parent fetchChildById(int id) {
		Optional<Parent> p=prepo.findById(id);
		return p.get();
		
	}

}
