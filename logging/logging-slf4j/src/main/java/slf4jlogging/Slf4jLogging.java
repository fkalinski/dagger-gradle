package slf4jlogging;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import logging.Logging;

public class Slf4jLogging implements Logging {

  private static final Logger logger = LoggerFactory.getLogger(Slf4jLogging.class.getName());

  @Inject
  Slf4jLogging() {}

  @Override
  public void log(String message) {
    logger.error(message);
  }
}
