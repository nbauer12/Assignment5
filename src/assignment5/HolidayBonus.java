package assignment5;

public class HolidayBonus {

    private static final double HIGH_BONUS = 5000.0;
    private static final double LOW_BONUS = 1000.0;
    private static final double OTHER_BONUS = 2000.0;

    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] >= 0) { 
                    if (data[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(data, j)) {
                        bonuses[i] += HIGH_BONUS;
                    } else if (data[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(data, j)) {
                        bonuses[i] += LOW_BONUS;
                    } else {
                        bonuses[i] += OTHER_BONUS;
                    }
                }
            }
        }
        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] data) {
        double totalBonus = 0.0;
        double[] bonuses = calculateHolidayBonus(data);
        for (double bonus : bonuses) {
            totalBonus += bonus;
        }
        return totalBonus;
    }
}

