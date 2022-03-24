package Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Коммитов для решения задачи : " + main.winWarnings());
    }
    public int winWarnings() {
        int warnings = 0;
        int errors = 0;
        int commits = 0;
        int checkWarnings;
        int checkErrors;
        System.out.print("Введите колличество ерроров : ");
        if (sc.hasNextInt()) {
            errors = sc.nextInt();
            while (errors <= 0) {
                System.out.println("Введите число больше 0");
                System.out.print("Введите колличество ерроров : ");
                errors = sc.nextInt();
            }
        } else {
            System.out.println("Введите число!");
        }
        System.out.print("Введите колличество ворнингов : ");
        if (sc.hasNextInt()) {
            warnings = sc.nextInt();
            while (warnings >= 1000) {
                System.out.println("Введите число меньше 1000");
                System.out.print("Введите колличество ворнингов : ");
                warnings = sc.nextInt();
            }
        } else {
            System.out.println("Введите число!");
        }
        checkWarnings = warnings % 2;
        checkErrors = errors % 2;
        if (Objects.equals(checkWarnings, 0)) {
            if(Objects.equals(checkErrors,0)){
            while (warnings != 0){
                warnings = warnings - 2;
                commits++;
            }
            while (errors != 0 ){
                errors = errors - 2;
                commits++;
            }}else{
                if(Objects.equals(errors,1)){

                }
            }
        }
        return commits;
    }


}
/*  errors - x
    warnings - y
    x - 1 = x + 1
    x - 2 = null
    y - 1 = y + 2
    y - 2 = x + 1
 */