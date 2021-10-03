package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(3, 3);
        System.out.println(Arrays.toString(myArrayList.getArray()));
        System.out.println(Arrays.toString(myArrayList.addInEnd(4)));
        System.out.println(Arrays.toString(myArrayList.addInCenter(4,5)));
        System.out.println(Arrays.toString(myArrayList.deleteIndex(0)));
        System.out.println(Arrays.toString(myArrayList.deleteData(3)));
    }

}