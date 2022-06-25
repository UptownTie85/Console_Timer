import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int temp1;
        String temp2;
        int count = 0;
        String first = null;
        String second = null;

        System.out.println("Please enter the time you want to countdown(m:s):");
        String time = scanner.nextLine();

        String[] test = time.split(":");
        int[] numbers = new int[2];
        for(String i: test) {
            temp1 = Integer.parseInt(i);
            numbers[count] = temp1;
            count++;

        }

        while(numbers[0]!=0 || numbers[1]!=0) {

            if(numbers[0] < 10) {
                first = "0" + numbers[0];
            }
            else {
                first = "" + numbers[0];
            }
            if (numbers[1] < 10) {
                second = "0" + numbers[1];
            }
            else {
                second = "" + numbers[1];
            }

            temp2 = first + ":" + second;
            System.out.println(temp2);

            TimeUnit.SECONDS.sleep(1);

            if (numbers[1]==0) {
                numbers[0]--;
                numbers[1] = 59;
            }
            else {
                numbers[1]--;
            }
        }

        System.out.println("Finished!");


    }
}
