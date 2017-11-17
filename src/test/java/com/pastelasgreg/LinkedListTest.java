package com.pastelasgreg;

import com.patselasgreg.LinkedList;
import org.junit.Assert;
import org.junit.Test;


public class LinkedListTest {


    @Test
    public void emptyListTest() {
        LinkedList testList = new LinkedList();

        LinkedList.Node expected = null;
        LinkedList.Node actual = testList.getHead();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void add() throws Exception {
        LinkedList testList = new LinkedList();

        testList.add(1);
        int expected = 1;
        int actual = testList.head.getValue();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void remove() throws Exception {
        LinkedList testList = new LinkedList();

        testList.add(32);
        testList.add(2);
        testList.add(99);
        testList.add(3);
        testList.remove(2);
        testList.remove(32);
        testList.remove(99);

        int expected = 3;
        int actual = testList.head.getNext().getValue();

        Assert.assertEquals(expected, actual);


    }
/*
    @Test
    public void contains() throws Exception {
        LinkedList testList = new LinkedList();

        testList.add(23);
       // testList.add(2);

        boolean actualA = testList.contains(testList.head.getNext());
      //  boolean actualB = testList.contains(testList.head.getNext().getNext());
      //  boolean actualC = testList.contains(testList.head.getNext().getNext().getNext());

        Assert.assertTrue(actualA);
      //  Assert.assertTrue(actualB);
     //   Assert.assertTrue(actualC);
    }

    @Test
    public void find() throws Exception {
        LinkedList testList = new LinkedList();

        testList.add();
        testList.add();
        testList.add();

        int expected = 1;
        LinkedList.Node findMe = testList.get(expected);
        int actual = testList.find(findMe);

        Assert.assertEquals(expected,actual);

    }*/

    @Test
    public void size() throws Exception {
        LinkedList testList = new LinkedList();

        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(3);
        int expected =4;
        int actual = testList.size();

        Assert.assertEquals(expected,actual);
    }

 /*    @Test
    public void get() throws Exception {
        LinkedList testList = new LinkedList();

        testList.add();
        testList.add();

        LinkedList.Node expected = testList.get(0);
        LinkedList.Node actual = testList.getHead();

        Assert.assertEquals(expected,actual);


    }

   @Test
    public void copy() throws Exception {
        LinkedList testList = new LinkedList();

        testList.add();
        testList.add();

        LinkedList copy = testList.copy();

        for(int i=0; i<testList.size(); i++){
            Assert.assertTrue(testList.get(i).equals(copy.get(i)));
        }

    }

    @Test
    public void sort() throws Exception {
        LinkedList testList = new LinkedList();

        testList.add();
        testList.add();
        testList.add();
        testList.add();

        testList.get(0).setValue(87);
        testList.get(1).setValue(15);
        testList.get(2).setValue(4);
        testList.get(3).setValue(99);

        testList.sort();



        Assert.assertEquals(4, testList.get(0).getValue());
        Assert.assertEquals(15, testList.get(1).getValue());
        Assert.assertEquals(87, testList.get(2).getValue());
        Assert.assertEquals(99, testList.get(3).getValue());

    }



*/

}