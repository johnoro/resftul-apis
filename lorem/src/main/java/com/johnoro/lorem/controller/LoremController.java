package com.johnoro.lorem.controller;

import com.johnoro.lorem.entity.Lorem;
import com.johnoro.lorem.service.LoremService;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Tag(name = "Lorem Ipsum API", description = "contains all /lorem endpoints")
@RestController
@RequestMapping(path = "/api/lorem", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoremController {
    private final LoremService loremService;
    
    @Autowired
    public LoremController(@Qualifier("loremService")LoremService loremService) {
        this.loremService = loremService;
    }
    
    @Operation(summary = "Get all Lorems")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved list of Lorems"),
        @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource", content = @Content()),
        @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden", content = @Content()),
        @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found", content = @Content()),
        @ApiResponse(responseCode = "500", description = "Server error",content = @Content())
    })
    @GetMapping("")
    public List<Lorem> getAll() {
        return loremService.getAll();
    }

    // commented out for the sake of showing how much swagger can figure out by itself
//    @Operation(summary = "Save a Lorem")
//    @ApiResponses(value = {
//        @ApiResponse(responseCode = "200", description = "Successfully saved a Lorem"),
//        @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
//        @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
//        @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found"),
//        @ApiResponse(responseCode = "500", description = "Server error")
//    })
    @PostMapping("")
    public void save(@RequestBody Lorem lorem) {
        loremService.save(lorem);
    }
    
    @Operation(summary = "Save all Lorems")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully saved all Lorems"),
        @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
        @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found"),
        @ApiResponse(responseCode = "500", description = "Server error")
    })
    @PostMapping("/all")
    public void saveAll(@RequestBody List<Lorem> lorems) {
        loremService.saveAll(lorems);
    }
    
    @Operation(summary = "Delete a Lorem")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully deleted a Lorem"),
        @ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
        @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found"),
        @ApiResponse(responseCode = "500", description = "Server error")
    })
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        loremService.delete(id);
    }
}