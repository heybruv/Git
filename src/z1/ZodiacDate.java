package z1;

public class ZodiacDate {

    public ZodiacDate(int day, String month) {
        setDay(day);
        setMonth(month);
    }

    private int day;
    private String month;

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void ZodGuesser() {
        int day = getDay();
        String month = getMonth();
        String zodiacSign = "";

        if (day < 1 || day > 31 || !isValidMonth(month)) {
            System.out.println("Incorrect Date! Check your input...");
            return;
        }

        if ((month.equals("March") && day >= 21) || (month.equals("April") && day <= 19)) {
            zodiacSign = "Aries";
        } else if ((month.equals("April") && day >= 20) || (month.equals("May") && day <= 20)) {
            zodiacSign = "Taurus";
        } else if ((month.equals("May") && day >= 21) || (month.equals("June") && day <= 20)) {
            zodiacSign = "Gemini";
        } else if ((month.equals("June") && day >= 21) || (month.equals("July") && day <= 22)) {
            zodiacSign = "Cancer";
        } else if ((month.equals("July") && day >= 23) || (month.equals("August") && day <= 22)) {
            zodiacSign = "Leo";
        } else if ((month.equals("August") && day >= 23) || (month.equals("September") && day <= 22)) {
            zodiacSign = "Virgo";
        } else if ((month.equals("September") && day >= 23) || (month.equals("October") && day <= 22)) {
            zodiacSign = "Libra";
        } else if ((month.equals("October") && day >= 23) || (month.equals("November") && day <= 21)) {
            zodiacSign = "Scorpio";
        } else if ((month.equals("November") && day >= 22) || (month.equals("December") && day <= 21)) {
            zodiacSign = "Sagittarius";
        } else if ((month.equals("December") && day >= 22) || (month.equals("January") && day <= 19)) {
            zodiacSign = "Capricorn";
        } else if ((month.equals("January") && day >= 20) || (month.equals("February") && day <= 18)) {
            zodiacSign = "Aquarius";
        } else if ((month.equals("February") && day >= 19) || (month.equals("March") && day <= 20)) {
            zodiacSign = "Pisces";
        }

        System.out.printf("Your birthday is on the %d %s and your zodiac sign is: %s%n", day, month, zodiacSign);
    }

    private static boolean isValidMonth(String month) {
        String[] validMonths = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        for (String validMonth : validMonths) {
            if (validMonth.equals(month)) {
                return true;
            }
        }
        return false;
    }
}
