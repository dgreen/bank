/*
 * Author: David Green <DGreen@uab.edu>
 * EE 333 Example
 */

package edu.uab.ee333.bankinheritance;

/** Model a checking account as a specialization of a bank account */
public class CheckingAccount extends BankAccount {

  /**
   * Construct a checking account given
   *
   * @param name owner
   * @param balance in cents
   */
  public CheckingAccount(String name, int balance, TLogger logger) {
    super(name, balance, logger);
  }

  /**
   * toString - convert to a string representation showing the name of the checking account and the
   * present balance
   *
   * @return a string representation of a checking account
   */
  @Override
  public String toString() {
    return name + "'s checking account has " + balance + " cents in it at present";
  }

  /**
   * clearCheck - processes a check with overdraft penalty
   *
   * @param cents - amount of check
   * @return boolean - true if the check clears
   */
  public boolean clearCheck(int cents) {
    if (withdraw(cents)) {
      return true;
    } else {
      balance -= 1500;
      log(name, "failed clear with penalty", cents, balance);
      return false;
    }
  }

  /** Assess a 150 cent fee each month */
  @Override
  public void assessMonthlyFee() {
    balance -= 150;
    log(name, "monthly fee", -150, balance);
  }
}
