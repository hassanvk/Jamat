package com.hassan.JamatStatus;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.StrictStubs.class)
public class DatabaseTest {

    @Test
    public void check(){

    }

//    @Mock
//    Database mockOfDatabase;
//
//    @Before
//    public void setUpMockDatabase(){
//
//        Map<Integer, Data> dataMap = new HashMap<>();
//        dataMap.put(101,new Data(101,"text for 101","Dave","Hassan"));
//        dataMap.put(102,new Data(102,"text for 102","Dave","Hassan"));
//        dataMap.put(103,new Data(103,"text for 103","Dave","Hassan"));
//        dataMap.put(104,new Data(104,"text for 104","Dave","Hassan"));
//        when(mockOfDatabase.getInstanceNonStatic()).thenReturn(dataMap);
//
//    }
//
//    @Test
//    public void checkId() {
//        Map<Integer, Data> dataMap = mockOfDatabase.getInstanceNonStatic();
//        for (int i = 1; i < dataMap.size() + 1; i++) {
//            assertEquals(100 + i, dataMap.get(100 + i).getId());
//        }
//    }
//
//    @Test
//    public void checkText() {
//        Map<Integer, Data> dataMap = mockOfDatabase.getInstanceNonStatic();
//        for (int i = 1; i < dataMap.size() + 1; i++) {
//            assertEquals("text for 10" + i, dataMap.get(100 + i).getText());
//        }
//    }
//
//    @Test
//    public void checkFrom() {
//        Map<Integer, Data> dataMap = mockOfDatabase.getInstanceNonStatic();
//        for (int i = 1; i < dataMap.size() + 1; i++) {
//            assertEquals("Dave", dataMap.get(100 + i).getFrom());
//        }
//    }
//
//    @Test
//    public void checkTo() {
//        Map<Integer, Data> dataMap = mockOfDatabase.getInstanceNonStatic();
//        for (int i = 1; i < dataMap.size() + 1; i++) {
//            assertEquals("Hassan", dataMap.get(100 + i).getTo());
//        }
//    }

}