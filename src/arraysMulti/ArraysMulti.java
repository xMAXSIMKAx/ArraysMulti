package arraysMulti;

import java.util.Scanner;

public class ArraysMulti {
    static int extraTicket = 54;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] tickets = {

                {58, 43, 23, 78},
                {53, 11, 22, 66},
                {59, 54, 21, 97},
                {88, 32, 29, 19}

        };

        System.out.println("Введіть ваш номер білету:");

        int userTicketNumber = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < tickets.length; i++) {
            for (int j = 0; j < tickets[i].length; j++) {
                if (tickets[i][j] == userTicketNumber) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            if (userTicketNumber == extraTicket) {
                System.out.println("Ви виграли автомобіль!!!!!!!!!!!!");
            }
        } else {
            System.out.println("Нічого не виграли, спробуйте ще раз.");
        }
    }
}