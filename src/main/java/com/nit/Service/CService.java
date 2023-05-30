package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Entity.ShubhamFiles;
import com.nit.Entity.ShubhamInfo;
import com.nit.Repo.MyInfoRepository;
import com.nit.Repo.MyRepository;

@Service
public class CService implements IService {

	@Autowired
	MyRepository repo;
	
	@Autowired
	MyInfoRepository inforepo;

	@Override
	public String saveCollection(ShubhamInfo info) {
		inforepo.save(info);
		return "Successfully Saved";
	}

	@Override
	public List<ShubhamInfo> fetchAllData() {
		List<ShubhamInfo> list=inforepo.findAll();
		return list;
	}

	
	


}
