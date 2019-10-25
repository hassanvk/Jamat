package com.hassan.JamatStatus;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


import com.google.gson.Gson;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import static org.junit.Assert.assertNotNull;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DatabaseIT {

//    @Test
//    public void getMessage101(){
//        try {
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/get/messages/101");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("GET");
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Gson gson = new Gson();
//            Data data = gson.fromJson(content.toString(), Data.class);
//            assertEquals(101,data.getId());
//            assertEquals("text for 101",data.getText());
//            assertEquals("Dave",data.getFrom());
//            assertEquals("Hassan",data.getTo());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void getMessage102(){
//        try {
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/get/messages/102");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("GET");
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Gson gson = new Gson();
//            Data data = gson.fromJson(content.toString(), Data.class);
//            assertEquals(102,data.getId());
//            assertEquals("text for 102",data.getText());
//            assertEquals("Dave",data.getFrom());
//            assertEquals("Hassan",data.getTo());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void getMessage103(){
//        try {
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/get/messages/103");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("GET");
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Gson gson = new Gson();
//            Data data = gson.fromJson(content.toString(), Data.class);
//            assertEquals(103,data.getId());
//            assertEquals("text for 103",data.getText());
//            assertEquals("Dave",data.getFrom());
//            assertEquals("Hassan",data.getTo());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    @Test
//    public void getMessage104(){
//        try {
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/get/messages/104");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("GET");
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Gson gson = new Gson();
//            Data data = gson.fromJson(content.toString(), Data.class);
//            assertEquals(104,data.getId());
//            assertEquals("text for 104",data.getText());
//            assertEquals("Dave",data.getFrom());
//            assertEquals("Hassan",data.getTo());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void getMessage105(){
//        try {
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/get/messages/105");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("GET");
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Gson gson = new Gson();
//            Data data = gson.fromJson(content.toString(), Data.class);
//            assertEquals(105,data.getId());
//            assertEquals("text for 105",data.getText());
//            assertEquals("Dave",data.getFrom());
//            assertEquals("Hassan",data.getTo());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void postMessage110A(){
//        try {
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/post/messages");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            Gson gson = new Gson();
//            con.setRequestMethod("POST");
//            con.setDoOutput(true);
//            con.setRequestProperty("Content-Type","application/json");
//            OutputStream os = con.getOutputStream();
//            OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
//            Data data = new Data(110,"text for 110", "Dave", "Hassan");
//            osw.write(gson.toJson(data));
//            osw.flush();
//            osw.close();
//            os.close();
//            con.connect();
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Data dataResponse = gson.fromJson(content.toString(), Data.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void postMessage110ACheck(){
//
//        try {
//            TimeUnit.SECONDS.sleep(15);
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/get/messages/110");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("GET");
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Gson gson = new Gson();
//            Data data = gson.fromJson(content.toString(), Data.class);
//            assertEquals(110,data.getId());
//            assertEquals("text for 110",data.getText());
//            assertEquals("Dave",data.getFrom());
//            assertEquals("Hassan",data.getTo());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void postMessage110B(){
//        try {
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/post/messages");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            Gson gson = new Gson();
//            con.setRequestMethod("POST");
//            con.setDoOutput(true);
//            con.setRequestProperty("Content-Type","application/json");
//            OutputStream os = con.getOutputStream();
//            OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
//            Data data = new Data(110,"null", "null", "null");
//            osw.write(gson.toJson(data));
//            osw.flush();
//            osw.close();
//            os.close();
//            con.connect();
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Data dataResponse = gson.fromJson(content.toString(), Data.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void postMessage110BCheck(){
//
//        try {
//            TimeUnit.SECONDS.sleep(15);
//            URL url = new URL("http://hassanvkmm.us-east-1.elasticbeanstalk.com/get/messages/110");
//            HttpURLConnection con = (HttpURLConnection) url.openConnection();
//            con.setRequestMethod("GET");
//
//            int status = con.getResponseCode();
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            String inputLine;
//            StringBuffer content = new StringBuffer();
//            while((inputLine = in.readLine()) != null){
//                content.append(inputLine);
//            }
//            in.close();
//            con.disconnect();
//            System.out.println(content.toString());
//            Gson gson = new Gson();
//            Data data = gson.fromJson(content.toString(), Data.class);
//            assertEquals(110,data.getId());
//            assertEquals("null",data.getText());
//            assertEquals("null",data.getFrom());
//            assertEquals("null",data.getTo());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

}
