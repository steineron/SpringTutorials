package org.steiner.tutorials.spring.sample.hello.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Created by rosteiner on 4/15/15.
 */

@Component // create an instance and keep it 'somewhere' (a bean in the application context)
public class MockMailSender implements MailSender {

    private static final Log log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body){
        log.info("Mock to: " + to);
        log.info("Mock subject: " + subject);
        log.info("Mock body: " + body);
    }
}
