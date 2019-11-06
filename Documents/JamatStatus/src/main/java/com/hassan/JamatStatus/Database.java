package com.hassan.JamatStatus;

import java.util.HashMap;
import java.util.Map;
import static com.hassan.JamatStatus.Time.*;

public class Database {

    private static final Map<String, Person> dataMap = new HashMap<>();

    static{
        dataMap.put("A101",new Person("A101","password","Ahmad Khan1", "7737737733", "Chicago", "IL", "USA","Driving"));
        dataMap.put("A102",new Person("A102","password","Ahmad Khan2", "7737737733", "Chicago", "IL", "USA","Driving"));
        dataMap.put("A103",new Person("A103","password","Ahmad Khan3", "7737737733", "Chicago", "IL", "USA","Driving"));
        dataMap.put("A104",new Person("A104","password","Ahmad Khan4", "7737737733", "Chicago", "IL", "USA","Driving"));
        dataMap.put("A105",new Person("A105","password","Ahmad Khan5", "7737737733", "Chicago", "IL", "USA","Driving"));
        System.out.println(getZonedTime() + ": Database initialized");
    }

    public static Map<String, Person> getInstance(){
        return dataMap;
    }

    public Map<String, Person> getInstanceNonStatic(){
        return dataMap;
    }
}
