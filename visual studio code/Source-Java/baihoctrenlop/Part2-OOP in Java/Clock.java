public class Clock  {
	int minutes;
	int seconds;
    int hours;
    Clock( ) {
            minutes = 0;
            seconds = 0;
            hours = 0;
    }                       
   	Clock(int h, int m, int s ) {
            minutes = m;
            seconds = s;
            hours = h;
    }
       
	public void setTime(int h, int m, int s) {
            minutes = m;
            seconds = s;
            hours = h;
	}

	public int getHours() {
            return hours;
	}
	
	public int getMinutes() {
                return minutes;
	}

	public int getSeconds() {
                return seconds;
	}
    public String getTime() {
                return hours+":"+minutes+":"+seconds;
     }

	public void addSeconds(int x) {
          //put the current time x seconds ahead
	}

	public int totalSeconds()  {
          int total = 0;
          //calculate total numer of seconds and store in total
	  return total;
	}
	
}
