/*
 * Author: David Green <DGreen@uab.edu>
 * EE 333 Example
 */
package edu.uab.ee333.bankinheritance;

/**
 * An interface that describes access to a logging capability that can be used by model objects that
 * wish to create a record of activity without putting I/O code into a model.
 */
public interface Logger {
  /**
   * Conditionally log a message if level of the message is >= than the logLevel
   *
   * <p>A developer might define the logLevel values according to the following scheme
   *
   * <ul>
   *   <li>0 - log all messages
   *   <li>10 - log everything but debug messages
   *   <li>20 - log only warnings and error messages
   *   <li>30 - log only error messages
   *   <li>40 - log only fatal error messages
   * </ul>
   *
   * @param level the level of this message
   * @param message text of the message
   */
  void log(int level, String message);

  /**
   * Set the logLevel that must be met or exceeded before a message is logged
   *
   * @param logLevel value for the threshold
   */
  void setLevel(int logLevel);
}
