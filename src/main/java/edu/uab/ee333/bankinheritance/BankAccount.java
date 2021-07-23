/*
 * Author: David Green <DGreen@uab.edu>
 * EE 333 Example
 */

package edu.uab.ee333.bankinheritance;

/** A generic BankAccount */
public abstract class BankAccount {

  /** Present balance in account in cents */
  protected int balance;

  /** (Formal) Name of owner of account */
  protected String name;

  /**
   * Transaction logger
   *
   * <p>A null for logger means don't log
   */
  protected TLogger logger;

  /**
   * Constructor with name, initial balance
   *
   * @param name name of account
   * @param balance initial amount in cents
   */
  public BankAccount(String name, int balance, TLogger logger) {
    this.name = name;
    this.balance = balance;
    this.logger = logger;
  }

  /**
   * Change out the logger
   *
   * @param logger a new TLogger
   */
  public void setTLogger(TLogger logger) {
    this.logger = logger;
  }

  /**
   * getBalance
   *
   * @return present balance in cents
   */
  public int getBalance() {
    return balance;
  }

  /**
   * deposit money into account
   *
   * @param cents amount to add to present balance
   */
  public void deposit(int cents) {
    balance += cents;
    log(name, "deposit", cents, balance);
  }

  /**
   * withdraw remove money from account
   *
   * @param cents amount to remove from account (if possible)
   * @return boolean true if withdrawal is successful
   */
  public boolean withdraw(int cents) {

    if (cents <= balance) {
      balance -= cents;
      log(name, "withdraw", cents, balance);

      return true;
    }

    log(name, "failed withdraw", cents, balance);

    return false;
  }

  /**
   * toString return information about account
   *
   * @return string with type, name of account and balance
   */
  @Override
  public String toString() {
    return name + "'s bank account has " + balance + " cents in it at present";
  }

  public abstract void assessMonthlyFee();

  /**
   * Log only if logger is not null
   *
   * @param name account name
   * @param reason transaction type
   * @param amount amount of transaction
   * @param newBalance balance after transaction
   */
  protected void log(String name, String reason, int amount, int newBalance) {
    if (logger != null) {
      logger.logTransaction(name, reason, amount, newBalance);
    }
  }
}
