public class ChineseZodiac {
    public static void main(String[] args) {
        chineseZodiac(1987);
    }

    private static void chineseZodiac(int year) {
        System.out.println(String.format("Entered year: %s", year));
        String[] animals = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Cow", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat"};
        String chineseZodiacAnimal = animals[year % 12];

        String chineseZodiacColor = null;
        int lastDigit = year % 10;
        if (lastDigit == 0 || lastDigit == 1) {
            chineseZodiacColor = "White";
        } else if (lastDigit == 2 || lastDigit == 3) {
            chineseZodiacColor = "Blue";
        } else if (lastDigit == 4 || lastDigit == 5) {
            chineseZodiacColor = "Green";
        } else if (lastDigit == 6 || lastDigit == 7) {
            chineseZodiacColor = "Red";
        } else if (lastDigit == 8 || lastDigit == 9) {
            chineseZodiacColor = "Yellow";
        }

        System.out.println(String.format("Chinese zodiac: %s %s", chineseZodiacColor, chineseZodiacAnimal));
    }

}