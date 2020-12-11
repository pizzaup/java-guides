package com.lzg.java8.streams;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author: lzg
 * @Date: 2020-12-09 20:10
 */
public class ConsumerFunctionalInterfaceTest {

    @Test
    public void shouldPrintATextByUsingConsumerWithoutLambdaExpression() throws Exception {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("i love you");
    }


    @Test
    public void shouldPrintATextByUsingConsumerWithLambdaExpression() throws Exception {
        Consumer<String> consumer = guide -> System.out.println("Awesome Guide:" + guide);
        consumer.accept("java 8 ");
    }

    @Test
    public void shouldSendAnEmail() throws Exception {
        User javaWarrior = new User("java-warrior@craft-coder.com");
        User javaBrave = new User("java-brave@craft-coder.com");
        User javaHipster = new User("java-hipster@craft-coder.com");

        List<User> javaFans = Arrays.asList(javaWarrior, javaBrave, javaHipster);

        javaFans.forEach(user -> EmailSender.sendFor(user));

    }

}


class User {
    private String email;

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class EmailSender {

    public static void sendFor(User user) {
        System.out.println("Sending email to: " + user.getEmail());
    }

}