import java.util.Scanner;


class StopWatchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        while (true){
            System.out.print("Menu:");
            System.out.print("1. Start time.");
            System.out.println("2. End time.");
            System.out.println("3. Show time.");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice){
                case 1:
                    stopWatch.setStartTime();
                    System.out.println("Start time is: " + stopWatch.getStartTime());
                    break;
                case 2:
                    stopWatch.setEndTime();
                    System.out.println("Stop time is: " + stopWatch.getEndTime());
                    break;
                case 3:
                    stopWatch.getElapsedTime();
                    System.out.println("show time is: " + stopWatch.getElapsedTime());
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}