package com.algoExpert.demo.Service;
import com.algoExpert.demo.Entity.Table;
import com.algoExpert.demo.Repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TableService {

    @Autowired
    private TableRepository tableRepository;

    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    public Table getTableById(int id) {
        Optional<Table> optionalTable = tableRepository.findById(id);
        return optionalTable.orElse(null);
    }

    public Table createTable(Table table) {
        return tableRepository.save(table);
    }

    public Table updateTable(int id, Table table) {
        if (tableRepository.existsById(id)) {
            table.setTable_id(id);
            return tableRepository.save(table);
        }
        return null;
    }

    public void deleteTable(int id) {
        tableRepository.deleteById(id);
    }
}

