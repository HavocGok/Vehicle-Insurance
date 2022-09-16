package com.Springboot.Myproject.Dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Springboot.Myproject.Entity.Authorites;


/**
 * Represents the DAO implementation for Authorities related use cases
 * */
@Repository
public abstract class AuthoritiesDaoImpl implements Authoritiesdao{

	@Autowired
	SessionFactory sessionFactory;
	
	/**
	 * Retrieves the Authorities list
	 * @return list
	 * */
	@Transactional
	@Override
	public List<Authorites> list() {
		List<Authorites> list = null;
		try {
			list = new ArrayList<Authorites>();
			Query<Authorites> query = sessionFactory.getCurrentSession().createQuery("from Authorites");
			list = query.getResultList();
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		return list;
	}

}

/*import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Springboot.Myproject.Entity.Authorites;
import com.mysql.cj.xdevapi.SessionFactory;

	@Repository
	public abstract class AuthoritiesDaoImpl  implements Authoritiesdao{
		@Autowired
		SessionFactory sessionFactory;
		
		public List<Authorites> list(){
			List<Authorites> list = null;
			try {
				list = new ArrayList<Authorites>();
				Query<Authorites> q1 = sessionFactory.getSession(createQuery("from Authorities"));
				list = q1.getResultList();
			}
			catch(HibernateException e) {
				return list;
			}
			
		}
		}

		/*@Override
		public List<Authorites> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Authorites> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Authorites> findAllById(Iterable<Integer> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Authorites> List<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <S extends Authorites> S saveAndFlush(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Authorites> List<S> saveAllAndFlush(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteAllInBatch(Iterable<Authorites> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllByIdInBatch(Iterable<Integer> ids) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Authorites getOne(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Authorites getById(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Authorites getReferenceById(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Authorites> List<S> findAll(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Authorites> List<S> findAll(Example<S> example, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Page<Authorites> findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Authorites> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Optional<Authorites> findById(Integer id) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}

		@Override
		public boolean existsById(Integer id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void deleteById(Integer id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Authorites entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllById(Iterable<? extends Integer> ids) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll(Iterable<? extends Authorites> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <S extends Authorites> Optional<S> findOne(Example<S> example) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}

		@Override
		public <S extends Authorites> Page<S> findAll(Example<S> example, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Authorites> long count(Example<S> example) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public <S extends Authorites> boolean exists(Example<S> example) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public <S extends Authorites, R> R findBy(Example<S> example,
				Function<FetchableFluentQuery<S>, R> queryFunction) {
			// TODO Auto-generated method stub
			return null;
		}*/

	

