package com.company;
import java.util.Arrays;

public class MyArrayList {
    Integer[] array = new Integer[10];
    Integer[] helpArray;

    public MyArrayList(Integer size, Integer content) {
        if (size > array.length) {
            array = Arrays.copyOf(array, array.length * 3 / 2);
        }
        Arrays.fill(array, 0, size, content);
    }

    public Integer[] getArray() {
        return array;
    }

    public Integer[] addInEnd(int newElement) {
        int i = 0;
        while ((i < array.length) && (array[i] != null)) {i += 1;}
        if (i == array.length) {
            array = Arrays.copyOf(array, array.length * 3 / 2);
            array[i] = newElement;
        } else {
            array[i] = newElement;
        }
        return array;
    }

    public Integer[] addInCenter(Integer position, int newElement) {
//        if (array[position] == null) {
//            array[position] = newElement;
//            return array;
//        } else {
//            return null;
//        }
//    }
        helpArray = Arrays.copyOf(array, array.length);
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
        if ((position < 0) || (position >= array.length)) {
            return null;
        } else {
            helpArray = Arrays.copyOf(array, array.length);
            for (int i = position; i < array.length - 1; i++) {
                helpArray[i] = array[i + 1];
            }
            array = helpArray;
            return array;
        }
    }

    public Integer[] deleteData(Integer data) {
        int count = 0;
        while ((count != array.length) && (array[count] != data)) {
            count += 1;
        }
//        if (array[array.length - 1] == count) {
//            return Arrays.copyOf(array, array.length - 1);
//        }
//        else {
        helpArray = Arrays.copyOf(array, array.length);
        for (int i = count; i < array.length - 1; i++) {
            helpArray[i] = array[i + 1];
        }
        array = helpArray;
        return array;
//        }
    }
}

