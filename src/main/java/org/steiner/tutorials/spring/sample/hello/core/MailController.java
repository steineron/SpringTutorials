package org.steiner.tutorials.spring.sample.hello.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.steiner.tutorials.spring.sample.hello.mail.MailSender;
import org.steiner.tutorials.spring.sample.hello.mail.MockMailSender;

import javax.annotation.Resource;

/**
 * Created by rosteiner on 4/15/15.
 */

@RestController
public class MailController {

    /*@Resource // look for (inject) an instance of this class 'somewhere' (
    public void setMailSender(final MailSender mailSender) {
        this.mailSender = mailSender;
    }*/

    @Autowired // look for (inject) an instance of this class 'somewhere' (
    public MailController( /*@Qualifier("smtp")*/ final MailSender mailSender) {
        this.mailSender = mailSender;
    }

    private MailSender mailSender ;

    @RequestMapping("/mail")
    public String sendMail(){
        mailSender.send("mail@email.com","hello", "world");
        return "Mail sent";
    }
}
