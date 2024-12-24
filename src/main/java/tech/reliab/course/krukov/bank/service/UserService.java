package tech.reliab.course.krukov.bank.service;

import tech.reliab.course.krukov.bank.entity.User;

public interface UserService extends CrudOperations<User> {
    int calculateCreditRating();
}