package com.spring.learning;

import com.spring.learning.prototype.ProtoFalse;
import com.spring.learning.prototype.ProtoTrue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);
    }

    @Bean
    public ProtoTrue protoTrue(){
        return new ProtoTrue();
    }

    @Bean
    @Scope("prototype")
    public ProtoFalse protoFalse(){
        return new ProtoFalse();
    }
}
