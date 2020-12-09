package com.java.bitmap;

import java.util.BitSet;

/**
 * Created by 燃烧杯 on 2018/2/24.
 */
public class BitSetTest {

    public static void main(String[] args) {
        int [] array = new int [] {1,2,3,22,0,3,63,100};
        BitSet bitSet  = new BitSet(1);
        System.out.println(bitSet.size());   //64，long数组，1个元素，所以1*64
        bitSet  = new BitSet(65);
        System.out.println(bitSet.size());   //128,long数组，2个元素，所以2*64
        bitSet  = new BitSet(23);
        System.out.println(bitSet.size());   //64，long数组，1个元素，所以1*64

        //将数组内容组bitmap
        for(int i=0;i<array.length;i++)
        {
            bitSet.set(array[i], true);
        }

        System.out.println(bitSet.get(22));//true
        System.out.println(bitSet.get(63));//false

        System.out.println("下面开始遍历BitSet：");
        for ( int i = 0; i < bitSet.size(); i++ ){
            System.out.println(bitSet.get(i));
        }
    }

}