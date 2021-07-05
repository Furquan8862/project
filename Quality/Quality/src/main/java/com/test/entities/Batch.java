package com.test.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long batchId;
    private Long mtr;
    private Long stockId;

}
