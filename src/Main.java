

public class Main {
    public static void main(String[] args) {

        double way= 10;

        double percent = 0.10;
        for (int i=2; i<=10; i++) {
            way = way + (way * percent);

            System.out.println("пробег в день " + i + ": " + way + " км");
        }

    }
}