/*
 * Author: David Green <DGreen@uab.edu>
 * EE 333 Example
 */

package edu.uab.ee333.bankinheritance;

/** A version of logger which uses logs to the standard output */
public class PrintLogger implements Logger {

  private int logLevel = 0;

  /**
   * Create a print logger with specified loglevel
   *
   * @param logLevel logging threshold
   */
  public PrintLogger(int logLevel) {}

  /**
   * Log message using System.out.println() if level >= logLevel
   *
   * @param level message level
   * @param message text of message
   */
  @Override
  public void log(int level, String message) {}

  /**
   * Set the logLevel to a new value
   *
   * @param logLevel new value for logLevel
   */
  @Override
  public void setLevel(int logLevel) {}
}
