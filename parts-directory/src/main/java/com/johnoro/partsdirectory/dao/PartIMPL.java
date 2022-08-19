package com.johnoro.partsdirectory.dao;

import com.johnoro.partsdirectory.entity.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PartIMPL implements PartDAO {
    private final EntityManager entityManager;

    @Autowired
    public PartIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private Session createSession() {
        return entityManager.unwrap(Session.class);
    }

    @Transactional
    public List<Part> findAll() {
        Query<Part> partQuery = createSession().createQuery("from Part");
        return partQuery.getResultList();
    }

    @Transactional
    public Part findById(int id) {
        return createSession().get(Part.class, id);
    }

    @Transactional
    public void saveOrUpdate(Part part) {
        createSession().saveOrUpdate(part);
    }

    @Transactional
    public void deleteById(int id) {
        Session session = createSession();
        Part part = session.get(Part.class, id);
        session.delete(part);
    }
}
