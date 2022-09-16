package com.Springboot.Myproject.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Myproject.Entity.Authorites;

public interface Authoritiesdao extends JpaRepository<Authorites, Integer> {

	/**
	 * Retrieves the Authorities list
	 * @return list
	 * */
	List<Authorites> list();

}
