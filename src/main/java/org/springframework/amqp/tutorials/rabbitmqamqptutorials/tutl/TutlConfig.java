package org.springframework.amqp.tutorials.rabbitmqamqptutorials.tutl;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Profile({"tutl", "hello-world"})
@Configuration
public class TutlConfig {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public TutlReceiver receiver() {
        return new TutlReceiver();
    }

    @Profile("sender")
    @Bean
    public TutlSender sender() {
        return new TutlSender();
    }
}
