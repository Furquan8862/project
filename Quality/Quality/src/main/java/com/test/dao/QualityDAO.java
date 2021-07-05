package com.test.dao;

import com.test.entities.Quality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface QualityDAO extends JpaRepository<Quality, Long> {
}
