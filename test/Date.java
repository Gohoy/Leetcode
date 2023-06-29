package test;

import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;
    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void addOneDay() {
        int daysInMonth = getDaysInMonth(year, month);
        if (day < daysInMonth) {
            day++;
        } else {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        }
    }

    public void addOneMonth() {
        if (month == 12) {
            year++;
            month = 1;
        } else {
            month++;
        }
    }

    public void addOneYear() {
        year++;
    }

    public int getDayOfWeek() {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int y = year;
        if (month < 3) {
            y--;
        }
        int dayOfWeek = (y + y / 4 - y / 100 + y / 400 + t[month - 1] + day) % 7;
        return dayOfWeek;
    }

    public Date getNextMonday() {
        Date nextMonday = new Date(year, month, day);
        int dayOfWeek = getDayOfWeek();
        if (dayOfWeek != 1) {
            int daysToAdd = 8 - dayOfWeek;
            nextMonday.addDays(daysToAdd);
        }
        return nextMonday;
    }
    public void addDays(int numDays) {
        while (numDays > 0) {
            day++;
            if (day > getDaysInMonth(year, month)) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
            numDays--;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int getDaysInMonth(int year, int month) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static void main(String[] args) {
        // create a date object
        Date date = new Date(2022, 3, 31);

        // test addOneDay() function
        System.out.println("Original date: " + date.toString());
        date.addOneDay();
        System.out.println("After adding one day: " + date.toString());

        // test addOneMonth() function
        System.out.println("Original date: " + date.toString());
        date.addOneMonth();
        System.out.println("After adding one month: " + date.toString());

        // test addOneYear() function
        System.out.println("Original date: " + date.toString());
        date.addOneYear();
        System.out.println("After adding one year: " + date.toString());

        // test getDayOfWeek() function
        System.out.println("Day of the week: " + date.getDayOfWeek());

        // test getNextMonday() function
        Date nextMonday = date.getNextMonday();
        System.out.println("Next Monday: " + nextMonday.toString());
    }
}