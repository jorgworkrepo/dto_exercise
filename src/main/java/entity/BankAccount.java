package entity;

import java.time.LocalDate;

public class BankAccount {
    private int id;
    private int userId;
    private String accountNumber;
    private double balance;
    private LocalDate createdAT;
    private LocalDate updatedAt;

    public BankAccount() {
    }

    public BankAccount(int id, int userId, String accountNumber, double balance, LocalDate createdAT, LocalDate updatedAt) {
        this.id = id;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getCreatedAT() {
        return createdAT;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", userId=" + userId +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", createdAT=" + createdAT +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
