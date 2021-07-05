package com.test.dao;

import com.test.entities.Quality;
import com.test.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDAO extends JpaRepository<Stock, Long> {
}
