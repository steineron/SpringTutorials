package org.steiner.tutorials.spring.sample.hello.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by rosteiner on 4/16/15.
 */
public class DemoObject {

    private static Log log = LogFactory.getLog(DemoObject.class);

    public DemoObject() {

        log.info("Creating demo object");
    }
}
