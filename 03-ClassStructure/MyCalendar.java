public class MyCalendar {
    static int year = 2023;
    static int month = 1;
    static int day = 11;

    static String MyDate() {
        String output = String.format("Date: %d-%02d-%02d", year, month, day);
        return output;

    }

    static String monthName() {
        // String[]
        // arr={"Jan","Feb","Mar","April","May","June","July","August","September","October","November","December"};
        String[] arr = new String[13];
        arr[1] = "January";
        arr[2] = "February";
        arr[3] = "March";
        arr[4] = "April";
        arr[5] = "May";
        arr[6] = "June";
        arr[7] = "july";
        arr[8] = "August";
        arr[9] = "September";
        arr[10] = "October";
        arr[11] = "November";
        arr[12] = "December";
        for (String a : arr) {
            if (arr[month] == a) {
                break;
            }
        }
        return arr[month];
    }

    // september, april,june,november=30
    static int days() {
        int[] daysInMonth = new int[13];
        int total = 0;
        for (int i = 1; i < 13; i++) {
            if (i == 2) {
                daysInMonth[i] = 28;

            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                daysInMonth[i] = 30;
            } else {

                daysInMonth[i] = 31;
            }
        }
        if (month < 13 && month > 0) {

            for (int i = 2; i <= month; i++) {
                total += daysInMonth[i - 1];
            }
        }
        total += day;
        return total;
    }
        public static void main(String[] args) {
        System.out.println(days());
        System.out.println(monthName());
    }


    
}
