import java.time.LocalTime;
import java.util.*;
import java.lang.*;

class Clock {

    public LocalTime localtime;

    public Clock(LocalTime xyz) {
        this.localtime = xyz;
    }
    public LocalTime getLocaltime() {
        return localtime;
    }
    public String toString()    {
        return localtime.toString();
    }
}
class Program {

    public static void main(String[] args) {

        LinkedList<Clock> clockList = new LinkedList<>();

        clockList.add(new Clock( LocalTime.of(6, 59, 32)));
        clockList.add(new Clock( LocalTime.of(6, 57, 31)));

        for (int i = 0; i < clockList.size(); i++) {
            System.out.println(clockList.get(i).getLocaltime().plusMinutes(1));
        }
    }
}