/*
 * Author: David Green <DGreen@uab.edu>
 * Bank - EE333
 */
package edu.uab.ee333.bankinheritance;

import java.util.ArrayList;

/** Models a bank with many accounts */
public class Bank {

  private String name;
  private ArrayList<BankAccount> accounts;
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
    accounts = new ArrayList<>();
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
    return accounts.size();
  }

  /**
   * Make statements for all accounts in bank
   *
   * @return String representation of a (simple) report
   */
  public String getStatements() {

    String report = "";
    String reportSeparator = System.getProperty("line.separator");

    for (var account : accounts) {
      report += account.toString() + reportSeparator;
    }
    return report;
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
    accounts.add(account);
  }

  /** Pay interest on appropriate accounts */
  public void payInterest() {
    // TBD
  }
}
