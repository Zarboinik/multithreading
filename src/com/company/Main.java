package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        int number[] = new int[args.length];
        number[0] = Integer.parseInt(args[0]);
        int summ = number[0] + 1;
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < summ; i++){
            exec.execute(new Group(i));
        }
        exec.shutdown();
    }
}
