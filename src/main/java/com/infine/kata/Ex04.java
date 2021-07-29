package com.infine.kata;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex04 {
    static Set<String> printAllSubsets(List<Integer> list) {
        Set<String> result = new HashSet<>();
        result.add("");
        combination("", list, 0, result);
        
        return result;
    }
    static void combination(String s, List<Integer> list, int index, Set<String> result)
    {
    	for(int i = index; i < list.size(); i++)
    	{
    		String newCombi = s+ String.valueOf(list.get(i))+",";
    		result.add(newCombi);
    		combination(newCombi, list, i+1, result);
    	}
    }
}
