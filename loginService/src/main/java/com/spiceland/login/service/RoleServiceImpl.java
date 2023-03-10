package com.spiceland.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiceland.login.entity.Role;
import com.spiceland.login.repo.Rolerepo;



@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private Rolerepo rolerepo;

	@Override
	public <S extends Role> S save(S entity) {
		return rolerepo.save(entity);
	}

	@Override
	public List<Role> findAll() {
		return rolerepo.findAll();
	}

	@Override
	public void delete(Role entity) {
		rolerepo.delete(entity);
	}

	@Override
	public Role getById(Integer id) {
		return rolerepo.getById(id);
	}
	
	@Override
	public Role getbyName(String name) {
	 return	rolerepo.findByName(name);
		
	}
	
	
	

}
