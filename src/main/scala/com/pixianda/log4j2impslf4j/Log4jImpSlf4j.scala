package com.pixianda.log4j2impslf4j

import org.slf4j.LoggerFactory

object Log4jImpSlf4j {

  val LOGGER = LoggerFactory.getLogger(Log4jImpSlf4j.getClass.getName)

  def main(args: Array[String]): Unit = {
    LOGGER.error("This is an error")
    LOGGER.info("this is info log")
    LOGGER.debug("A debug message, works only in debug mode")
    LOGGER.trace("This is a trace")
    LOGGER.warn("This is a warning")
  }
}
