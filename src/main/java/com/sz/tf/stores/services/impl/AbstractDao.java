package com.sz.tf.stores.services.impl;

import com.sz.tf.stores.models.Entity;
import com.sz.tf.stores.services.IDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public abstract class AbstractDao<T extends Entity> implements IDao<T> {

    private JdbcTemplate jdbcTemplate;

    protected AbstractDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    protected abstract String queryGet();
    protected abstract RowMapper<T> getMapper();
    @Override
    public T get(int id) {
        return jdbcTemplate.queryForObject(queryGet(), new Object[]{id}, getMapper());
    }

    protected abstract String queryAll();
    @Override
    public List<T> all() {
        return jdbcTemplate.query(queryAll(), getMapper());
    }

    protected abstract String queryAdd();
    protected abstract Object[] paramsAdd(T t);
    @Override
    public T add(T t) {
        int id = jdbcTemplate.update(queryAdd(), paramsAdd(t));
        t.setId(id);
        return t;
    }
}