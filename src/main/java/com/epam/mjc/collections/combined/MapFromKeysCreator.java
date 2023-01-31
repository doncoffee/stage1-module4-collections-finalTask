package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (String keys : sourceMap.keySet()){
            int newKey = keys.length();
            if (resultMap.containsKey(newKey)) {
                resultMap.get(newKey).add(keys);
            } else {
                Set<String> value = new HashSet<>();
                value.add(keys);
                resultMap.put(newKey, value);
            }
        }
        return resultMap;
    }
}
