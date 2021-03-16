import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> floorDeque = new ArrayDeque<>();
        while (true) {
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            int numberFloor = scanner.nextInt();
            if (numberFloor == 0) {
                break;
            }
            if (numberFloor > 25 || numberFloor < 0) {
                System.out.println("Такого этажа нет в доме!");
                continue;
            }
            floorDeque.add(numberFloor);
        }
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = -1;
        System.out.println("Лифт проследовал по следующим этажам:");
        while (!floorDeque.isEmpty()) {
            int currentFloor = floorDeque.peekFirst();
            System.out.print(" этаж -> " + floorDeque.pollFirst());
            if (previousFloor != -1) {
                totalSeconds += Math.abs(currentFloor - previousFloor) * waitMoveInSeconds;
            }
            previousFloor = currentFloor;
            totalSeconds += waitDoorsInSeconds;
        }
        System.out.println();
        System.out.println("Время затраченное лифтом на маршрут = " + totalSeconds + " сек.");
        scanner.close();
    }
}
