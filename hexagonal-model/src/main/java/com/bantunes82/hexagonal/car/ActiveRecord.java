package com.bantunes82.hexagonal.car;

import org.jmolecules.ddd.annotation.Identity;

import java.util.Collections;
import java.util.List;

public class ActiveRecord {

    @Identity
    public Long id;

    public static<T extends ActiveRecord> List<T> findAll() {
        return Collections.emptyList();
    }

    public static void insert() {
    }

    public static void delete() {
    }
}
