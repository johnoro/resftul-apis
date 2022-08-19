package com.johnoro.partsdirectory.controller;


import com.johnoro.partsdirectory.entity.Part;
import com.johnoro.partsdirectory.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = { "http://localhost:3000" })
@RestController()
@RequestMapping("/parts")
public class PartController {
    private final PartService partService;

    @Autowired
    public PartController(@Qualifier("partServiceIMPL")PartService partService) {
        this.partService = partService;
    }

    @GetMapping("")
    public List<Part> findAll() { return partService.findAll(); }

    @GetMapping("/{partId}")
    public Object findById(@PathVariable int partId) {
        return partService.findById(partId);
    }

    @PostMapping("")
    public Part savePart(@RequestBody Part part) {
        part.setId(0); // in case an id is in the part parameter to force a new part instead of an update
        partService.saveOrUpdate(part);
        return part;
    }

    @PutMapping("")
    public Part updatePart(@RequestBody Part part) {
        partService.saveOrUpdate(part);
        return part;
    }

    @DeleteMapping("/{partId}")
    public String deleteById(@PathVariable int partId) {
        partService.deleteById(partId);
        return "Deleted part with id: " + partId;
    }
}
