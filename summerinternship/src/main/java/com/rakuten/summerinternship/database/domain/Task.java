package com.rakuten.summerinternship.database.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.rakuten.summerinternship.persistable.AbstractPersistable;

@Entity
@Table(name="TASK")
public class Task extends AbstractPersistable<Integer> {

    @Column(name = "title", length = 32, nullable = false)
    private String title;

    @Column(name = "description", length = 64, nullable = false)
    private String description;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
