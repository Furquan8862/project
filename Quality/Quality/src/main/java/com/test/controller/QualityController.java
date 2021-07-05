package com.test.controller;

import com.test.dao.BatchDAO;
import com.test.dao.QualityDAO;
import com.test.dao.StockDAO;
import com.test.entities.Batch;
import com.test.entities.Quality;
import com.test.entities.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QualityController {
    @Autowired
    QualityDAO qualityDAO;
    @Autowired
    StockDAO stockDAO;
    @Autowired
    BatchDAO batchDAO;

    @GetMapping("/quality")
    public List<Quality> getAllQuality() { return
	  qualityDAO.findAll();
    }
    @PostMapping(value = "/add",produces = MediaType.APPLICATION_JSON_VALUE)
    public void add(@RequestBody Quality record)
    {
        System.out.println(record);
       qualityDAO.save(record);
    }

    @DeleteMapping("/quality/{id}")
    public ResponseEntity<HttpStatus> deleteQuality(@PathVariable("qualityId") long qualityId) {
        try {
            qualityDAO.deleteById(qualityId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/stock")
    public List<Stock> getAllStocks() { return
            stockDAO.findAll();
    }

    @PostMapping(value = "/stock",produces = MediaType.APPLICATION_JSON_VALUE)
    public void show(@RequestBody Stock entry)
    {
        System.out.println(entry);
        stockDAO.save(entry);
    }

    @GetMapping("/batch")
    public List<Batch> getAllBatch() { return
            batchDAO.findAll();
    }

    @PostMapping(value = "/batch",produces = MediaType.APPLICATION_JSON_VALUE)
    public void appear(@RequestBody Batch entry)
    {
        System.out.println(entry);
        batchDAO.save(entry);
    }


}

