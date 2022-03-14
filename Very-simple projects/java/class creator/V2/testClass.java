import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mainShortcuts s = new mainShortcuts();

        int chose;

        System.out.println("Welcome!");

        do {

            s.menu();
            chose = input.nextInt();

            switch (chose) {
                case 1 -> s.addNewSection();
                case 2 -> s.showSections();
                case 3 -> s.addLab();
                case 4 -> s.addNewWeek();
                case 5 -> s.printSpecificWeek();
            }
        }while (chose!= 6);
    }
}

//iawos9 :)
//2022/3/14
