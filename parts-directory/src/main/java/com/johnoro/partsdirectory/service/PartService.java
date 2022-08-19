package com.johnoro.partsdirectory.service;

import com.johnoro.partsdirectory.entity.Part;

import java.util.List;

public interface PartService {
    List<Part> findAll();

    Object findById(int partId);

    void saveOrUpdate(Part part);

    void deleteById(int partId);
}
