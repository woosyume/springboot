package com.rakuten.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	@Column(length=100, nullable=false) // varchar(100) not null
    private String title;
    
	@Column(length=100, nullable=false) // varchar(100) not null
    private String description;
}
