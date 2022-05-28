import java.util.ArrayDeque;
import java.util.Scanner;

public class p05_PrintQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!fileName.equals("print")) {
             if (fileName.equals("cancel")){
                 if (printerQueue.isEmpty()){
                     System.out.println("Printer is on standby");
                 } else {
                     System.out.println("Canceled " + printerQueue.poll());
                 }

             }else {
                 printerQueue.offer(fileName);
             }

            fileName = scanner.nextLine();
        }
        for (String file : printerQueue) {
            System.out.println(printerQueue.poll());
        }
    }
}
