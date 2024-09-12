enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
public class Enum {
  public static void main(String[] args) {
    Day day = Day.MONDAY;
    System.out.println(day);

    // in if else  we use ennum like 

    if (day == Day.MONDAY) {
      System.out.println("Monday");
    }
    else if (day == Day.TUESDAY) {
      System.out.println("Tuesday");
    }


    // but in switch case we pass the day in switcvh so we can directly use it with its constant  in case

    switch(day){
        case MONDAY:
            System.out.println("Monday");
            break;
        case TUESDAY:
            System.out.println("Tuesday");
            break;
        default:
            System.out.println("Invalid day");
    }
  }  
}
