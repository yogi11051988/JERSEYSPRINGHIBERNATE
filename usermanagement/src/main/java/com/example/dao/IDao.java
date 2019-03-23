package com.example.dao;

import com.example.daoModel.UserManagementModel;

public interface IDao{
 
	public void save(UserManagementModel userModel) throws Exception;
 
}