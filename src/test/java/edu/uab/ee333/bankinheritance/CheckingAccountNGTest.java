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
public class CheckingAccountNGTest {

  private CheckingAccount ca;

  public CheckingAccountNGTest() {}

  @BeforeMethod
  public void setUpMethod() throws Exception {
    ca = new CheckingAccount("Checking account", 1000, null);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {}

  /** Test of toString method, of class CheckingAccount. */
  @Test
  public void testToString() {
    assertEquals(
        ca.toString(), "Checking account's checking account has 1000 cents in it at present");
  }

  /** Test of clearCheck method, of class CheckingAccount. */
  @Test
  public void testClearCheck() {
    assertTrue(ca.clearCheck(10));
    assertEquals(ca.getBalance(), 990);

    assertFalse(ca.clearCheck(1000));
    assertEquals(ca.getBalance(), 990 - 1500);
  }

  /** Test of assessMonthlyFee method, of class CheckingAccount. */
  @Test
  public void testAssessMonthlyFee() {
    ca.assessMonthlyFee();
    assertEquals(ca.getBalance(), 850);
  }
}