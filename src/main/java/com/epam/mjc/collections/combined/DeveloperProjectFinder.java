package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<String>();
        for (Map.Entry<String, Set<String>> item : projects.entrySet()){
            if (item.getValue().contains(developer)) {
                result.add(item.getKey());
            }
        }
        result.sort(Comparator.comparingInt(String::length)
                .reversed()
                .thenComparing(Collections.reverseOrder()));
        return result;
    }
}
