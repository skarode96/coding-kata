package com.mycompany.model;

import java.util.HashMap;
import java.util.Map;

public class OutputModel {
    private Map<String, Integer> vowelCountMap;

    public OutputModel(final Map<String, Integer> vowelCountMap) {
        this.vowelCountMap = vowelCountMap;
    }

    public OutputModel() {
        this.vowelCountMap = new HashMap<String, Integer>();
        this.vowelCountMap.put("a", 0);
        this.vowelCountMap.put("e", 0);
        this.vowelCountMap.put("i", 0);
        this.vowelCountMap.put("o", 0);
        this.vowelCountMap.put("u", 0);
    }

    public Map<String, Integer> getVowelCountMap() {
        return this.vowelCountMap;
    }

    public void setVowelCountMap(final Map<String, Integer> vowelCountMap) {
        this.vowelCountMap = vowelCountMap;
    }

    @Override
    public String toString() {
        return "OutputModel{" +
                "vowelCountMap=" + vowelCountMap +
                '}';
    }
}
