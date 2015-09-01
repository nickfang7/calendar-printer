public class calendarprinter {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 30){
            if (x % 7 == 5 || x % 7 == 6)
            System.out.println("september"+ x + "- WEEKEND");
            else if (x == 7)
            System.out.println("september" + x + "– NO SCHOOL (LABOR DAY)");
            else if (x == 25)
            System.out.println("september" + x + "- END OF THE MARKING PERIOD");
            else 
            System.out.println("september" + x);
        x++;
        }
    }
}