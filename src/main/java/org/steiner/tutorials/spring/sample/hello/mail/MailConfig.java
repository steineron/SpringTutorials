package org.steiner.tutorials.spring.sample.hello.mail;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by rosteiner on 4/16/15.
 */

@Configuration
public class MailConfig {

    @Bean
//    @Qualifier("mock")
//    @Profile("!dev")
    public MailSender mockMailSender() {
        return new MockMailSender();
    }

    @Bean
    @Primary
//    @Qualifier("smtp")
//    @Profile("dev")
    public MailSender smtpMailSender(DemoObject demoObject) {
        SmtpMailSender smtpMailSender = new SmtpMailSender();
        smtpMailSender.setDemoObject(demoObject);
        return smtpMailSender;
    }

    @Bean
    public DemoObject demoObject(){
        return new DemoObject();
    }
}
