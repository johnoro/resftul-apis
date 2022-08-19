package com.johnoro.partsdirectory.service;

import com.johnoro.partsdirectory.dao.PartDAO;
import com.johnoro.partsdirectory.entity.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartServiceIMPL implements PartService {
    private final PartDAO partDAO;

    @Autowired
    public PartServiceIMPL(PartDAO partDAO) { this.partDAO = partDAO; }

    public List<Part> findAll() { return partDAO.findAll(); }

    public Object findById(int partId) { return partDAO.findById(partId); }

    public void saveOrUpdate(Part part) { partDAO.saveOrUpdate(part); }

    public void deleteById(int partId) { partDAO.deleteById(partId); }
}
