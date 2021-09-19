import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс валюты");
        double exchangeRate = scanner.nextDouble();
        System.out.println("Введите кол-во рублей");
        double quantity = scanner.nextDouble();
        if (exchangeRate > 0 && quantity >= 0) {
            double total = Math.round(quantity / exchangeRate * 100.0) / 100.0;
            System.out.println("Итого: " + total);
        } else {
            System.out.println("Некорректное значение");
        }
    }
}
