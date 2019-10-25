package com.hassan.JamatStatus;

import com.google.gson.Gson;
import static com.hassan.JamatStatus.Time.*;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class main {
    public static void main(String[] args){


        Map<Integer,Person> dataMap = Database.getInstance();
        Gson gson = new Gson();

        get("/hello",(req,res) -> "Hello World");

        get("/hello/:name", (request, response) -> "Hello: " + request.params(":name"));

        get("/updateStatus/:id/:password/:city/:state/:country/:transport",(request, response)->{
            Person person = dataMap.get(Integer.valueOf(request.params(":id")));
            if(person.getPassword().equals(request.params(":password"))){
                person.setCurrentCity(request.params(":city"));
                person.setCurrentState(request.params(":state"));
                person.setCurrentCountry(request.params(":country"));
                person.setModeOfTransport(request.params(":transport"));
                dataMap.put(person.getId(),person);
                return "Updated Successfully! " + person.toString();
            }
            return "Incorrect password. Try again with correct password for this ID";
        });

        get("/show/:id",(request, response) -> {
            if(request.params(":id").equalsIgnoreCase("all")){
                StringBuilder sb = new StringBuilder();
                for(Map.Entry<Integer,Person> entry : dataMap.entrySet()){
                    Person person = entry.getValue();
                    sb.append(person.toString()).append("  *****  ");
                }
                response.body(sb.toString());
                return sb;
            }
            else {
                return dataMap.get(Integer.valueOf(request.params(":id"))).toString();
            }
        });
    }
}
