import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mainShortcuts s = new mainShortcuts();

        int chose;

        do {

            s.menu();
            chose = input.nextInt();

            switch (chose) {
                case 1 -> s.addNewSection();
                case 2 -> s.showSections();
                case 3 -> s.addLab();
            }
        }while (chose!= 4);
    }
}

//iawos9 :)
//2022/3/8
