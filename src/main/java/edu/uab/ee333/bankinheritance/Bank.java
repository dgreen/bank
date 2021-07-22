/*
 * Author: David Green <DGreen@uab.edu>
 * Bank - EE333
 */
package edu.uab.ee333.bankinheritance;

/** Models a bank with many accounts */
public class Bank {

  private static final int MAX_ACCOUNTS = 100;
  private String name;
  private BankAccount[] accounts;
  private int numAccounts;
  private String newLine;

  /**
   * Make a named bank using supplied name if available
   *
   * @param name desired name for bank, if null one will be created
   */
  public Bank(String name) {
    if (name == null) {
      this.name = "Unnamed bank";
    } else {
      this.name = name;
    }
    accounts = new BankAccount[MAX_ACCOUNTS];
    numAccounts = 0;
  }

  // queries

  /**
   * get the name of the bank
   *
   * @return name of bank as a String
   */
  public String getName() {
    return name;
  }

  /**
   * get the number of accounts in the bank
   *
   * @return the number of accounts as an integer
   */
  public int getNumAccounts() {
    return numAccounts;
  }

  /**
   * Make statements for all accounts in bank
   *
   * @return String representation of a (simple) report
   */
  public String getStatements() {

    String report = "";
    String reportSeparator = System.getProperty("line.separator");

    for (int i = 0; i < numAccounts; i++) {
      report += getStatement(i) + reportSeparator;
    }
    return report;
  }

  /**
   * Make a statement for the specified account
   *
   * @param accountNumber of the account to supply statement for
   * @return string representing account statement
   */
  public String getStatement(int accountNumber) {
    String statement;

    if (accountNumber < 0 || accountNumber >= numAccounts) {
      statement = "";
    } else {
      statement = accounts[accountNumber].toString();
    }
    return statement;
  }

  // commands

  /**
   * addAccount to bank
   *
   * <p>TBD: Handle error (presently silently ignores request) TBD: Avoid duplicate names (should be
   * done on making account)
   *
   * @param account to be added
   */
  public void addAccount(BankAccount account) {
    if (numAccounts < MAX_ACCOUNTS) {
      accounts[numAccounts++] = account;
    } else {
      // handle error
    }
  }

  /** Pay interest on appropriate accounts */
  public void payInterest() {
    // TBD
  }
}
