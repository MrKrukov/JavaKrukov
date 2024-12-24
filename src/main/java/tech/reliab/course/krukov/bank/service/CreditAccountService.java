package tech.reliab.course.krukov.bank.service;

import tech.reliab.course.krukov.bank.entity.*;

import java.time.LocalDate;
import java.util.List;

public interface CreditAccountService {
    CreditAccount createCreditAccount(User user, Bank bank, LocalDate startDate, int loanTermMonths,
                                      double loanAmount, double interestRate, Employee employee,
                                      PaymentAccount paymentAccount);

    CreditAccount getCreditAccountById(long id);

    List<CreditAccount> getCreditAccountByUserId(int userId);

    void updateCreditAccount(int id, Bank bank);
}