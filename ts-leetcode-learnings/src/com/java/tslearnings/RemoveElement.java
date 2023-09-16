package com.java.tslearnings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        re.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
    }
    public int removeElement(int[] nums, int val) {
        List<Integer> numsList = Arrays.stream(nums)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
        List<Integer> updatedNumsList = numsList.stream().filter(n -> n != val).collect(Collectors.toList());
        System.out.println(updatedNumsList);
        System.out.println(updatedNumsList.size());
        return updatedNumsList.size();
    }
}