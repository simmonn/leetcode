package com.leetcode;

import java.util.*;

/**
 * @author: simmon
 * @description: LRU cache
 * @date: 2020/8/27 22:41
 */
public class CacheLRU<K, V> {

    private final float LOAD_FACTOR = 0.75f;

    private int MAX_CAPACITY;

    private LinkedHashMap<K,V> cacheMap;


    public CacheLRU(int cacheSize) {
        MAX_CAPACITY = cacheSize;
        cacheMap = new LinkedHashMap<K, V>(16, LOAD_FACTOR, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return MAX_CAPACITY + 1 == cacheMap.size();
            }
        };

    }

    public synchronized void put(K k, V v) {
        if (cacheMap.size() > MAX_CAPACITY) {

        }
        cacheMap.put(k, v);
    }

    public synchronized V get(K k) {
        return cacheMap.get(k);
    }

    public Set<Map.Entry<K, V>> getAll() {
        return cacheMap.entrySet();
    }


    public static void main(String[] args) {
        CacheLRU<String, Object> cache = new CacheLRU<>(3);
        cache.put("12", 21212);
        cache.put("21", 21212);
        cache.put("31", 21212);
        cache.put("41", 21212);
        cache.get("31");
        Set<Map.Entry<String, Object>> all = cache.getAll();
        all.forEach(entry->{
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        });

    }

}