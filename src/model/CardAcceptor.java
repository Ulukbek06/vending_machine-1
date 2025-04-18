package model;

import java.util.Scanner;

public class CardAcceptor implements PaymentAcceptor {
    private int amount;

    public CardAcceptor() {
        this.amount = 0;
    }

    @Override
    public void acceptPayment() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер карты: ");
        String cardNumber = scanner.nextLine().trim();

        System.out.print("Введите одноразовый пароль: ");
        String otp = scanner.nextLine().trim();

        if (isValidCard(cardNumber, otp)) {
            System.out.println("Платёж прошёл. Баланс пополнен на 100");
            amount += 100;
        } else {
            System.out.println("Ошибка: Неверные данные карты. Попробуйте ещё раз.");
        }
    }

    private boolean isValidCard(String cardNumber, String otp) {
        return cardNumber.startsWith("3010") && otp.equals("2006");
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void reset() {
        this.amount = 0;
    }
}
