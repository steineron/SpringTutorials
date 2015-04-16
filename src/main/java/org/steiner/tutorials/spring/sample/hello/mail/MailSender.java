package org.steiner.tutorials.spring.sample.hello.mail;

/**
 * Created by rosteiner on 4/15/15.
 */
public interface MailSender {
    void send(String to, String subject, String body);
}
