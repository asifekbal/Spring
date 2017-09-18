package com.bank.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bank.pojo.Token;

@Repository
public class TokenDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveToken(Token c) {
		hibernateTemplate.save(c);
	}

	public void updateToken(Token c) {
		hibernateTemplate.update(c);
	}

	public void deleteToken(Token c) {
		hibernateTemplate.delete(c);
	}

	public Token getById(int id) {
		Token e = (Token) hibernateTemplate.get(Token.class, id);
		return e;
	}

	public List<Token> getTokens() {
		List<Token> list = new ArrayList<Token>();
		list = hibernateTemplate.loadAll(Token.class);
		return list;
	}
}
