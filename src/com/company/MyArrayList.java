package com.company;
import java.util.Arrays;

public class MyArrayList {
    Integer[] array;
    Integer[] helpArray;

    public MyArrayList(int size, Integer content) {
        this.array = new Integer[size];
        Arrays.fill(array, content);
    }

    public Integer[] getArray() {
        return array;
    }

    public Integer[] addInEnd(int newElement) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = newElement;
        return array;
    }

    public Integer[] addInCenter(Integer position, int newElement) {
        helpArray = Arrays.copyOf(array, array.length + 1);
        if ((position < 0) || (position >= helpArray.length)) {
            return null;
        } else {
            for (int i = position; i < helpArray.length - 1; i++) {
                helpArray[i + 1] = array[i];
            }
            helpArray[position] = newElement;
            array = helpArray;
            return array;
        }
    }

    public Integer[] deleteIndex(Integer position) {
        if (position == array.length - 1) {
            helpArray = Arrays.copyOf(array, array.length - 1);
        }
        if ((position < 0) || (position >= array.length)) {
            return null;
        } else {
            helpArray = Arrays.copyOf(array, array.length - 1);
            for (int i = position; i < array.length - 1; i++) {
                helpArray[i] = array[i + 1];
            }
            array = helpArray;
            return array;
        }
    }

    public Integer[] deleteData(Integer data) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                count = i;
                break;
            }
        }
        if (array[array.length - 1] == count) {
            return Arrays.copyOf(array, array.length - 1);
        }
        else {
            helpArray = Arrays.copyOf(array, array.length - 1);
            for (int i = count; i < array.length - 1; i++) {
                helpArray[i] = array[i + 1];
            }
            array = helpArray;
            return array;
        }
    }
}

