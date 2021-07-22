/*
 * Author: David Green <DGreen@uab.edu>
 * Assignment:  bank - EE333 Summer 2021
 *
 * Credits:  (if any for sections of code)
 */
package edu.uab.ee333.bankinheritance;

/** Interface to I/O that logs transactions */
public interface TLogger {

  /**
   * Log a transaction
   *
   * @param name account name
   * @param reason deposit, withdrawal, fee
   * @param amount transaction amount
   * @param newBalance new balance of account
   */
  void logTransaction(String name, String reason, int amount, int newBalance);
}
