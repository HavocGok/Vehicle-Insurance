package com.Springboot.Myproject.Service;

import java.util.List;

import javax.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Springboot.Myproject.Dao.Authoritiesdao;
import com.Springboot.Myproject.Entity.Authorites;

@Service
@Entity
public class AuthoritiesService {
	@Autowired
	private Authoritiesdao ad;

	public Authorites addAuthor(Authorites a) {
		return ad.save(a);
	}

	public Authorites viewAuthor(int Id) {
		Authorites a = ad.findById(Id).orElse(null);
		if (a != null) {
			a.toString();
		}
		return a;
	}

	public List<Authorites> viewAllAuthor() {
		return ad.findAll();
	}

	public Authorites updateAuthor(Authorites a) {
		for (Authorites a1 : ad.findAll()) {
			if (a.getId() == a1.getId()) {
				ad.deleteById(a.getId());
			}
		}
		ad.save(a);
		return a;
	}

	public String deleteAuthor(int Id) {
		for (Authorites a : ad.findAll()) {
			if (Id == a.getId()) {
				ad.deleteById(Id);
			}
		}
		return "User Not found !";
	}
}
