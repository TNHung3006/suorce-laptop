import java.util.*;

public class CurrentTime{
  public static void main(String[] args){
    Calendar calendar = new GregorianCalendar();
    String am_pm;
    int hour = calendar.get(Calendar.HOUR);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH);
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    if(calendar.get(Calendar.AM_PM) == 0)
      am_pm = "AM";
    else
      am_pm = "PM";
    System.out.println("Current Time : " + year +"/" + (month +1) +"/" + day +
    					" "+ hour + ":"+ minute + ":" + second + " " + am_pm);
  }
} 