package com.rakuten.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rakuten.persistable.AbstractPersistable;

import lombok.Data;

@Data
@Entity
@Table(name="tasks")
public class Task extends AbstractPersistable<Integer> {
	@Column(length=100, nullable=false) // varchar(100) not null
    private String title;
    
	@Column(length=200, nullable=false) // varchar(100) not null
    private String description;
}
