package assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class TwoDimRaggedArrayUtilityTestStudent {

    private double[][] dataSet1 = {{1,2,3},{2,3,4}};
    private double[][] dataSet2 = {{1},{2},{3},{4}};
    private double[][] dataSet3 = {{1,2,3,4,5}};

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testReadFile() throws FileNotFoundException {
        File inputFile = new File("test.txt");
        PrintWriter out = new PrintWriter(inputFile);
        out.println("1 2 3");
        out.println("2 3 4");
        out.close();
        assertArrayEquals(dataSet1, TwoDimRaggedArrayUtility.readFile(inputFile));
    }

    @Test
    void testWriteToFile() throws FileNotFoundException {
        File outputFile = new File("output.txt");
        TwoDimRaggedArrayUtility.writeToFile(dataSet1, outputFile);
        assertArrayEquals(dataSet1, TwoDimRaggedArrayUtility.readFile(outputFile));
    }

    @Test
    void testGetTotal() {
        assertEquals(15, TwoDimRaggedArrayUtility.getTotal(dataSet1), 0.01);
        assertEquals(10, TwoDimRaggedArrayUtility.getTotal(dataSet2), 0.01);
        assertEquals(15, TwoDimRaggedArrayUtility.getTotal(dataSet3), 0.01);
    }

    @Test
    void testGetAverage() {
        assertEquals(3, TwoDimRaggedArrayUtility.getAverage(dataSet1), 0.01);
        assertEquals(2.5, TwoDimRaggedArrayUtility.getAverage(dataSet2), 0.01);
        assertEquals(3, TwoDimRaggedArrayUtility.getAverage(dataSet3), 0.01);
    }

    @Test
    void testGetRowTotal() {
        assertEquals(6, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 0), 0.01);
        assertEquals(9, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), 0.01);
    }

    @Test
    void testGetColumnTotal() {
        assertEquals(3, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0), 0.01);
        assertEquals(5, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 1), 0.01);
    }

    @Test
    void testGetHighestInRow() {
        assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 0), 0.01);
        assertEquals(4, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 1), 0.01);
    }

    @Test
    void testGetHighestInRowIndex() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 0), 0.01);
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 1), 0.01);
    }

    @Test
    void testGetLowestInRow() {
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 0), 0.01);
        assertEquals(2, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 1), 0.01);
    }

    @Test
    void testGetLowestInRowIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0), 0.01);
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 1), 0.01);
    }

    @Test
    void testGetHighestInColumn() {
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 0), 0.01);
        assertEquals(3, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 1), 0.01);
    }

    @Test
    void testGetHighestInColumnIndex() {
        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 0), 0.01);
        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 1), 0.01);
    }

    @Test
    void testGetLowestInColumn() {
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0), 0.01);
        assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 1), 0.01);
    }

    @Test
    void testGetLowestInColumnIndex() {
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0), 0.01);
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 1), 0.01);
    }

    @Test
    void testGetHighestInArray() {
        assertEquals(4, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), 0.01);
    }

    @Test
    void testGetLowestInArray() {
        assertEquals(1, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), 0.01);
    }
}
