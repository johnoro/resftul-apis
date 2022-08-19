package com.johnoro.lorem.service;

import com.johnoro.lorem.entity.Lorem;
import com.johnoro.lorem.dao.LoremRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service(value = "loremService")
public class LoremServiceIMPL implements LoremService {
    @Autowired
    private final LoremRepository loremRepository;
    
    public LoremServiceIMPL(LoremRepository loremRepository) {
        this.loremRepository = loremRepository;
    }
    
    @Override
    public List<Lorem> getAll() {
        return loremRepository.findAll();
    }
    
    @Override
    public void save(Lorem lorem) {
        loremRepository.save(lorem);
    }
    
    @Override
    public void saveAll(List<Lorem> lorems) {
        loremRepository.saveAll(lorems);
    }
    
    @Override
    public void delete(Long id) {
        loremRepository.deleteById(id);
    }
}