package com.sz.tf.stores.services;

import com.sz.tf.stores.models.Entity;

import java.util.List;

public interface IDao<T extends Entity> {
    T get(int id);
    List<T> all();
    T add(T t);
}