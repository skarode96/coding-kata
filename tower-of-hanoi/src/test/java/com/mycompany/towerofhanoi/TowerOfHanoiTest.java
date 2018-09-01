package com.mycompany.towerofhanoi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TowerOfHanoiTest {
    private PrintStream printStream;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        printStream = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPlaceFromSourceToDestinationIfOnePresent() {
        TowerOfHanoi.solveTower(1, "A", "B", "C");
        Assert.assertEquals("Move Disk 1 from A to B\n", outContent.toString());
    }

    @Test
    public void shouldPlaceForHeightTwo() {
        TowerOfHanoi.solveTower(2, "A", "B", "C");
        Assert.assertEquals("Move Disk 1 from A to C\nMove Disk 2 from A to B\nMove Disk 1 from C to B\n", outContent.toString());
    }

    @Test
    public void shouldPlaceForHeightThree() {
        TowerOfHanoi.solveTower(3, "A", "B", "C");
        Assert.assertEquals("Move Disk 1 from A to B\n" +
                "Move Disk 2 from A to C\n" +
                "Move Disk 1 from B to C\n" +
                "Move Disk 3 from A to B\n" +
                "Move Disk 1 from C to A\n" +
                "Move Disk 2 from C to B\n" +
                "Move Disk 1 from A to B\n", outContent.toString());
    }

    @After
    public void revertStreams() {
        System.setOut(printStream);
    }
}
