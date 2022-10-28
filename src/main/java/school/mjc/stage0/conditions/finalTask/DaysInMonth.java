package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month == 1) {
            System.out.println(31);
        }
        if (month == 2 && (year == 2028 || year == 2024 || year == 2020 || year == 2016 || year ==
                2012 || year == 2008 || year == 2004 || year == 2000 || year == 1996 || year ==
                1992 || year == 1988 || year == 1984 || year == 1980 || year == 1976 || year ==
                1972 || year == 1968 || year == 1964 || year == 1960 || year == 1956 || year == 1952 || year == 1948
                || year == 1944 || year == 1940 || year == 1936 || year == 1932 || year == 1928 || year ==
                1924 || year == 1920 || year == 1916 || year == 1912 || year == 1908 || year == 1904)) {
            System.out.println(29);
            return;
        } else if (month == 2) {
            System.out.println(28);
        } else if (month == 3) {
            System.out.println(31);
        } else if (month == 4) {
            System.out.println(30);
        } else if (month == 5) {
            System.out.println(31);
        } else if (month == 6) {
            System.out.println(30);
        } else if (month == 7) {
            System.out.println(31);
        } else if (month == 8) {
            System.out.println(31);
        } else if (month == 9) {
            System.out.println(30);
        } else if (month == 10) {
            System.out.println(31);
        } else if (month == 11) {
            System.out.println(30);
        } else if (month == 12) {
            System.out.println(31);
        } else {
            System.out.println("invalid date");
        }
    }
}
