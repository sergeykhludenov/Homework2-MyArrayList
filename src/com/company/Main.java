package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(10, 3);
        System.out.println(Arrays.toString(myArrayList.getArray()));
        System.out.println(Arrays.toString(myArrayList.addInEnd(4)));
        System.out.println(Arrays.toString(myArrayList.addInCenter(3,5)));
        System.out.println(Arrays.toString(myArrayList.deleteIndex(8)));
        System.out.println(Arrays.toString(myArrayList.deleteData(4)));
    }

}