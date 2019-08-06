package com.rakuten.summerinternship.persistable;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.springframework.data.domain.Persistable;
import org.springframework.lang.Nullable;

@MappedSuperclass
public abstract class AbstractPersistable<PK extends Serializable> implements Persistable<PK> {
    @Id @GeneratedValue 
    private @Nullable PK id;

    @Nullable
    public PK getId() { return id; }

    protected void setId(@Nullable PK id) { this.id = id; }

    @Transient
    public boolean isNew() { return null == getId(); }
}
