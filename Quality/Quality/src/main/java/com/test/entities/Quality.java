package com.test.entities;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.ComponentScan;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Quality {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long qualityId;
    private String name;

    }

