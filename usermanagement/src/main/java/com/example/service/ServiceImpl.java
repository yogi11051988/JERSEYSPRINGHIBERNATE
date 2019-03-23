package com.example.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.IDao;
import com.example.daoModel.UserManagementModel;
import com.example.model.UserModel;
/**
 * @author yogesh potdar
 */
public class ServiceImpl implements IService {
    
	IDao dao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public void  save(UserModel model) throws Exception{
		UserManagementModel userModel=new UserManagementModel.UserBuilder(model.getFirstName(), model.getLastName(), model.getEmail(), model.getPassword()).build();
		dao.save(userModel);
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	
}
