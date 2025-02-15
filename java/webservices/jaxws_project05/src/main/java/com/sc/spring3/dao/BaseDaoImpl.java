package com.sc.spring3.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseDaoImpl<T extends Serializable, I extends Serializable> implements BaseDao<T, I> {

	@PersistenceContext
	private EntityManager em;

	@Override
	public T save(T t) {
		em.persist(t);
		return t;
	}

	@Override
	public void removeById(I id) {
		T entity = this.getById(id);
		if (entity != null) {
			em.remove(entity);
		}
	}

	@Override
	public T getById(I id) {
		return em.find(getEntityClass(), id);
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return em.createQuery("from " + getEntityClass().getName()).getResultList();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public abstract Class<T> getEntityClass();
}
