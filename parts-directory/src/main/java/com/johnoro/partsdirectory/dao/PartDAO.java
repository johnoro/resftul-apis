package com.johnoro.partsdirectory.dao;

import com.johnoro.partsdirectory.entity.Part;

import java.util.List;

public interface PartDAO {
    List<Part> findAll();

    Object findById(int id);

    void saveOrUpdate(Part part);

    void deleteById(int id);
}
