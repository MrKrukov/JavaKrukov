package tech.reliab.course.krukov.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.reliab.course.krukov.bank.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Long> {
}
