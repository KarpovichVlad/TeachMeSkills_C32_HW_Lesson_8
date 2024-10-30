package com.teachmeskills.lesson_8.transfer.impl;

import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;

import java.util.Date;

// TODO реализовать имплементацию интерфейса
public class VisaCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard fromCard, BaseCard toCard, double amount) {
        if (fromCard.checkCardLimitTransfer(amount)) {
            fromCard.balance -= amount;
            toCard.balance += amount;
            return new Check(amount, new Date(), toCard.getCardNumber());
        }
        return null;
    }

    @Override
    public Check transferFromCardToAccount(BaseCard fromCard, String toAccount, double amount) {
        if (fromCard.checkCardLimitTransfer(amount)) {
            fromCard.balance -= amount;
            return new Check(amount, new Date(), toAccount);
        }
        return null;
    }
}



