package com.mycompany.towerofhanoi;

public class TowerOfHanoi {

    public static void solveTower(int height, String source, String destination, String spare) {
        if(height == 1) {
            System.out.format("Move Disk %d from %s to %s\n", height, source, destination);
            return;
        }
        solveTower(height-1, source, spare, destination);
        System.out.format("Move Disk %d from %s to %s\n", height ,source, destination);
        solveTower(height-1, spare, destination , source);
    }
}
