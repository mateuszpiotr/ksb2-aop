package pl.piotrowski.ksb2aop.movies;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.piotrowski.ksb2aop.email.EmailService;

@Component
@Aspect
public class MovieAspect {
    private final EmailService emailService;

    @Autowired
    public MovieAspect(EmailService emailService) {
        this.emailService = emailService;
    }

    @After("@annotation(SendCreatedMovieConfirmationMail)")
    private void sendCreatedMovieConfirmationEmail() {
        emailService.sendSimpleMessage("pietruch0@gmail.com", "Foo", "Bar");
    }
}
