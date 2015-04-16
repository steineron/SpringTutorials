package org.steiner.tutorials.spring.sample.hello.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by rosteiner on 4/15/15.
 */

//@Component // create an instance and keep it 'somewhere' (a bean in the application context)
//@Primary // this is the primary instance for inject
//@Qualifier("smtp")
public class SmtpMailSender implements MailSender {

    private static final Log log = LogFactory.getLog(SmtpMailSender.class);
    private DemoObject mDemoObject;

    @Override
    public void send(String to, String subject, String body){
        log.info("Smtp to: " + to);
        log.info("Smtp subject: " + subject);
        log.info("Smtp body: " + body);
    }

    public void setDemoObject(final DemoObject demoObject) {
        mDemoObject = demoObject;
    }
}
