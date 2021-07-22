/*
 * Author: David Green <DGreen@uab.edu>
 * Assignment:  bank - EE333 Summer 2021
 *
 * Credits:  (if any for sections of code)
 */
package edu.uab.ee333.bankinheritance;

/** Transaction logger to stdout */
public class PrintTLogger implements TLogger {

  public PrintTLogger() {}

  @Override
  public void logTransaction(String name, String reason, int amount, int newBalance) {
    System.out.println(name + "," + reason + "," + amount + "," + newBalance);
  }
}
