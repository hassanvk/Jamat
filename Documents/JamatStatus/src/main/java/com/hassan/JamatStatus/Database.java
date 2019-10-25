package com.hassan.JamatStatus;

import java.util.HashMap;
import java.util.Map;
import static com.hassan.JamatStatus.Time.*;

public class Database {

    private static final Map<Integer, Person> dataMap = new HashMap<>();

    static{
        dataMap.put(101,new Person(101,"password","Ahmad Khan1", "7737737733", "Chicago", "IL", "USA","Driving"));
        dataMap.put(102,new Person(102,"password","Ahmad Khan2", "7737737733", "Chicago", "IL", "USA","Driving"));
        dataMap.put(103,new Person(103,"password","Ahmad Khan3", "7737737733", "Chicago", "IL", "USA","Driving"));
        dataMap.put(104,new Person(104,"password","Ahmad Khan4", "7737737733", "Chicago", "IL", "USA","Driving"));
        dataMap.put(105,new Person(105,"password","Ahmad Khan5", "7737737733", "Chicago", "IL", "USA","Driving"));
        System.out.println(getZonedTime() + ": Database initialized");
    }

    public static Map<Integer, Person> getInstance(){
        return dataMap;
    }

    public Map<Integer, Person> getInstanceNonStatic(){
        return dataMap;
    }
}
