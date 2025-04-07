package chapter5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class PractionQ_137 {
    public static void main(String[] args) {
        Deque<Integer> nums = new ArrayDeque<>();
        nums.add(1000);
        System.out.println(nums);//[1000]
        nums.push(2000);
        System.out.println(nums); //[2000, 1000]
        nums.add(3000);
        System.out.println(nums);//[2000, 1000, 3000]
        nums.push(4000);
        System.out.println(nums);//[4000, 2000, 1000, 3000]

        Integer i1 = nums.remove();//removed 4000
        System.out.println(nums);//[2000, 1000, 3000]

        Integer i2 = nums.pop(); //popped out 2000
        System.out.println(nums);//[1000, 3000]
        System.out.println(i1 + ":" + i2);
        //4000:2000
    }
    }