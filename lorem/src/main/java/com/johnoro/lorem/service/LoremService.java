package com.johnoro.lorem.service;

import com.johnoro.lorem.entity.Lorem;
import java.util.List;

public interface LoremService {
    public List<Lorem> getAll();
    public void save(Lorem lorem);
    public void saveAll(List<Lorem> lorems);
    public void delete(Long id);
}
