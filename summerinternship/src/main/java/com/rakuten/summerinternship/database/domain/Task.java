package com.rakuten.summerinternship.database.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.rakuten.summerinternship.persistable.AbstractPersistable;

@Entity
public class Task extends AbstractPersistable<Integer> {

    @NotNull
    @Size(min = 1, max = 50)
    private String title;

    @NotNull
    @Size(min = 1, max = 100)
    private String description;

    protected Task() {}

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
