package com.nit.Service;

import java.util.List;

import com.nit.Entity.ShubhamFiles;
import com.nit.Entity.ShubhamInfo;

public interface IService {
	public String saveCollection(ShubhamInfo info);
	public List<ShubhamInfo> fetchAllData();
	
	
}
