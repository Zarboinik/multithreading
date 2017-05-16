package com.company;

public class Group implements Runnable {
    private int itemId = 5;
    private int groupId;


    public Group(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public void run() {
            for (int i = 0; i < itemId; i++){
                System.out.println("Элемент группы " + groupId + ", под номером " + i);
                Thread.yield();
            }

    }
}
