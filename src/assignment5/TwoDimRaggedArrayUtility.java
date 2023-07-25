package assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	public static double[][] readFile(File file) throws FileNotFoundException {
	    Scanner fileScan = new Scanner(file);
	    double[][] data = new double[10][];
	    int row = 0;
	    while (fileScan.hasNextLine()) {
	        String line = fileScan.nextLine();
	        String[] values = line.split(" ");
	        
	        if(values.length > 0) {
	            data[row] = new double[values.length];
	            for (int i = 0; i < values.length; i++) {
	                data[row][i] = Double.parseDouble(values[i]);
	            }
	            row++;
	        }
	    }
	    fileScan.close();
	    double[][] resizedData = new double[row][];
	    System.arraycopy(data, 0, resizedData, 0, row);
	    return resizedData;
	}


    public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(outputFile);
        for (double[] row : data) {
            for (int j = 0; j < row.length; j++) {
                pw.print(row[j]);
                if (j < row.length - 1) {
                    pw.print(" ");
                }
            }
            pw.println();
        }
        pw.close();
    }

    public static double getTotal(double[][] data) {
        double total = 0.0;
        for (double[] row : data) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] data) {
        int count = 0;
        double total = 0.0;
        for (double[] row : data) {
            for (double value : row) {
                total += value;
                count++;
            }
        }
        return total / count;
    }

    public static double getRowTotal(double[][] data, int row) {
        double total = 0.0;
        for (double value : data[row]) {
            total += value;
        }
        return total;
    }

    public static double getColumnTotal(double[][] data, int col) {
        double total = 0.0;
        for (double[] row : data) {
            if (col < row.length) {
                total += row[col];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] data, int row) {
        double highest = data[row][0];
        for (double value : data[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] data, int row) {
        int highestIndex = 0;
        for (int i = 0; i < data[row].length; i++) {
            if (data[row][i] > data[row][highestIndex]) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public static double getLowestInRow(double[][] data, int row) {
        double lowest = data[row][0];
        for (double value : data[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] data, int row) {
        int lowestIndex = 0;
        for (int i = 0; i < data[row].length; i++) {
            if (data[row][i] < data[row][lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public static double getHighestInColumn(double[][] data, int col) {
        double highest = Double.MIN_VALUE;
        for (double[] row : data) {
            if (col < row.length && row[col] > highest) {
                highest = row[col];
            }
        }
        return highest;
    }

    public static int getHighestInColumnIndex(double[][] data, int col) {
        int highestIndex = -1;
        double highest = Double.MIN_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] > highest) {
                highest = data[i][col];
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public static double getLowestInColumn(double[][] data, int col) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : data) {
            if (col < row.length && row[col] < lowest) {
                lowest = row[col];
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] data, int col) {
        int lowestIndex = -1;
        double lowest = Double.MAX_VALUE;
        for (int i = 0; i < data.length; i++) {
            if (col < data[i].length && data[i][col] < lowest) {
                lowest = data[i][col];
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public static double getHighestInArray(double[][] data) {
        double highest = Double.MIN_VALUE;
        for (double[] row : data) {
            for (double value : row) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] data) {
        double lowest = Double.MAX_VALUE;
        for (double[] row : data) {
            for (double value : row) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }
}

