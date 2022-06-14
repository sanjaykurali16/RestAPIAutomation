package com.test.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Represents the properties file reader.
 *
 * @Sanjay testing
 *
 */
public class PropertiesFileReader {

  /**
   * Represents the method to read apiPath properties.
   */
  public static Properties getProperty() throws IOException {

    Properties properties = new Properties();
    try {

      properties.load(new FileInputStream("resources/apiPath.properties"));

    } catch (Exception e) {
      System.out.println("Exception: " + e);
    }
    return properties;
  }

}
