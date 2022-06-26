package Calculator;
import java.util.*;

class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myVar = Math.abs(sc.nextInt());
        int minutes = 0;
        int hours = 0;
        int seconds = 0;
        for(int i = 0;myVar>60;){
            while(myVar>=60){
                minutes++;
                myVar = myVar-60;
            }
            while(minutes>=60){
                hours++;
                minutes = minutes-60;
            }
            seconds = myVar;

        }
        if(hours > 23){
            hours = hours -24;
        }
        String seconds2 = "";
        String minutes2 = "";
        String hours2 = "";
        if(hours < 10){
            hours2 = "0" + String.valueOf(hours);
        } else if (hours > 10){
            hours2 = String.valueOf(hours);
        }
        if(minutes < 10){
            minutes2 = "0" + String.valueOf(minutes);
        } else if (minutes > 10){
            minutes2 = String.valueOf(minutes);
        }
        if(seconds < 10){
            seconds2 = "0" + String.valueOf(seconds);
        } else if (seconds > 10){
            seconds2 = String.valueOf(seconds);
        }
        System.out.print(hours2 + ":" + minutes2 + ":" + seconds2);
    }
}