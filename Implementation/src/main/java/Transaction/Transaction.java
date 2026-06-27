package Transaction;

import Person.Person;

import java.time.LocalDate;

abstract class Transaction {
    protected String idTransaction;
    protected LocalDate dateExecution;
    protected Person act;
    protected Object target;
}
