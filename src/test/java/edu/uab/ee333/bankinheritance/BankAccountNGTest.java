/*
 * Author: David Green <DGreen@uab.edu>
 * Assignment:  bank - EE333 Summer 2021
 *
 * Credits:  (if any for sections of code)
 */
package edu.uab.ee333.bankinheritance;

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** */
public class BankAccountNGTest {

  private BankAccount ba;

  public BankAccountNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {
    ba = new CheckingAccount("ca for ba", 1000, null);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of deposit method, of class BankAccount. */
  @Test
  public void testDeposit() {
    ba.deposit(1000);
    assertEquals(ba.getBalance(), 2000);
  }

  /** Test of withdraw method, of class BankAccount. */
  @Test
  public void testWithdraw() {
    assertTrue(ba.withdraw(100));
    assertEquals(ba.getBalance(), 900);

    assertFalse(ba.withdraw(4000));
    assertEquals(ba.getBalance(), 900);
  }
}