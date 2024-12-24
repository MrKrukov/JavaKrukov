package tech.reliab.course.krukov.bank.service;

import tech.reliab.course.krukov.bank.entity.Bank;

public interface BankService extends CrudOperations<Bank> {
    void addOffice();

    void addAtm();

    void removeAtm();
}