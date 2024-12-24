package tech.reliab.course.krukov.bank.service;

import tech.reliab.course.krukov.bank.entity.*;

import java.util.List;
import java.util.Optional;

public interface AtmService {
    BankAtm createBankAtm(String name,
                          String address, Bank bank, BankOffice location, Employee employee,
                          boolean cashWithdrawal, boolean cashDeposit, double maintenanceCost);

    Optional<BankAtm> getAtmById(int id);

    List<BankAtm> getAllAtms();

    List<BankAtm> getAllAtmsByBank(Bank bank);
}