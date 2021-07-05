package com.test.dao;

import com.test.entities.Batch;
import com.test.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchDAO extends JpaRepository<Batch, Long> {
}
