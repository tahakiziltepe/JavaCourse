public class a003_Switch {
    public static void main(String[] args) {
        
        int n = 3;
        // It checks which case statement is equal to n. After matches one case, it runs this and every case codes. 
        // For example, if n would be 6, it would print "Saturday - Sunday".
        // That is why if we want switch to run only the equal case we have to use BREAK!
        // *** UPDATE *** There is a new way to not use BREAK for every statement! You can find this syntax below!
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Provide valid day number!");
        }

        // *** UPDATE *** There is a new way to not use BREAK for every statement! You can find this syntax below!
        String day = "Monday";
        switch(day){
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            case "Monday" -> System.out.println("First day of the week");
            default -> System.out.println("Other weekdays");
        }

        // There are 3 more alternatives, check them out!
        // 1. alternative
        String day1 = "Saturday";
        String msg1 = "";
        switch(day1){
            case "Saturday", "Sunday" -> msg1 = "Weekend";
            case "Monday" -> msg1 = "First day of the week";
            default -> msg1 = "Other weekdays";
        };
        System.out.println(msg1);

        // 2. alternative
        String day2 = "Tuesday";
        String msg2 = "";
        msg2 = switch(day2){
            case "Saturday", "Sunday" -> "Weekend";
            case "Monday" -> "First day of the week";
            default -> "Other weekdays";
        };
        System.out.println(msg2);

        // 3. alternative (There is only difference from 2, you use ": yield" instead of "->")
        String day3 = "Tuesday";
        String msg3 = "";
        msg3 = switch(day3){
            case "Saturday", "Sunday" : yield "Weekend";
            case "Monday" : yield "First day of the week";
            default : yield "Other weekdays";
        };
        System.out.println(msg3);

    }
}
