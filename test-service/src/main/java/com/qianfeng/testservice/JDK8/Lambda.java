package com.qianfeng.testservice.JDK8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * @Author pangzhenyu
 * @Date 2019/12/5
 */
public class Lambda {
    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run...");
            }
        };
        new Thread(runnable).start();

        Runnable runnable2 = ()->{
            System.out.println("Lambda...");
        };
        new Thread(runnable2).start();
        new Thread(()-> System.out.println("lambda-----")).start();

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        TreeSet<String> treeSet = new TreeSet<>(comparator);
        TreeSet<String> treeSet2 = new TreeSet<>((o1,o2)->o1.length()-o2.length());

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        long count = list.stream().filter(s->s.length()>1).count();
        System.out.println(count);
    }
}
