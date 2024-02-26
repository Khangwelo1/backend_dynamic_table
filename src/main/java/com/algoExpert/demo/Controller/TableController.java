package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.Table;
import com.algoExpert.demo.Service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @CrossOrigin("http://localhost:3000")
@RequestMapping("/api/tables")
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping("/getTable/{id}") 
    public Table getTableById(@PathVariable int id) {
        return tableService.getTableById(id);
    }

    @PostMapping("/createTable") 
    public Table createTable(@RequestBody Table table) {
        return tableService.createTable(table);
    }

    @PutMapping("/updateTable/{id}") 
    public Table updateTable(@PathVariable int id, @RequestBody Table table) {
        return tableService.updateTable(id, table);
    }

    @DeleteMapping("/deleteTable/{id}") 
    public void deleteTable(@PathVariable int id) {
        tableService.deleteTable(id);
    }

    @GetMapping 
    public List<Table> getAllTables() {
        return tableService.getAllTables();
    }
}