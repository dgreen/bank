/*
 * Author: David Green <DGreen@uab.edu>
 * Assignment:  bank - EE333 Summer 2021
 *
 * Credits:  (if any for sections of code)
 */
package edu.uab.ee333.bankinheritance;

/** */
public class BankingDemo {

  /**
   * Small program to test this class
   *
   * @param args from command line - unused
   */
  public static void main(String[] args) {

    TLogger logger = new PrintTLogger();

    Bank bank = new Bank("Birmingham");
    CheckingAccount ca1 = new CheckingAccount("Joe Checking", 10000, null);
    CheckingAccount ca2 = new CheckingAccount("Jill Checking", 20000, null);

    bank.addAccount(ca1);
    bank.addAccount(ca2);

    System.out.println(bank.getStatements());

    //    CheckingAccount mine = new CheckingAccount("David Green", 200000, logger);
    //    System.out.println("The account has " + mine.getBalance());
    //    System.out.println(mine);
    //
    //    mine.deposit(1000);
    //    System.out.println(mine);
    //
    //    mine.withdraw(200000);
    //    System.out.println(mine);
    //
    //    // trying to remove too much
    //    boolean status = mine.withdraw(200000);
    //    System.out.println(mine);
    //    System.out.println("Withdraw returned " + status);
    //
    //    System.out.println(mine.clearCheck(1));
    //    System.out.println(mine);
    //
    //    System.out.println(mine.clearCheck(10000));
    //    System.out.println(mine);
    //
    //    mine.assessMonthlyFee();
    //    System.out.println(mine);
  }
}
