package com.teachmeskills.lesson_8.model.card;

import com.teachmeskills.lesson_8.utils.Constants;

import java.util.Date;

public class MasterCard extends BaseCard {
    public String country;

    public MasterCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, double balance, String country) {
        super(cardNumber, cvv, validDate, cardHolder, currency, balance);
        this.country = country;
    }

    @Override
    public boolean checkCardLimitTransfer(double amount) {
        // TODO реализовать проверку лимита. суть проверки в том, что сумма для перевода не превышает лимит

        // это пока стоит как ответ-заглушка
        return amount<= Constants.MASTER_CARD_LIMIT;
    }
}
