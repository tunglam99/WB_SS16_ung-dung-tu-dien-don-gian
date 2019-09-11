package com.codegym.repository.impl;

import com.codegym.repository.DirectoryRepository;

import java.util.HashMap;

public class DirectoryReposytoryImpl implements DirectoryRepository {
    HashMap<String, String> list = new HashMap<>();
    {
        list.put("hello","xin chao");
        list.put("book","sach");
        list.put("how","the nao");
    }
    @Override
    public String exchange(String word) {
        return list.get(word);

    }
}
