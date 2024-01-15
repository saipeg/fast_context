package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

//    @Bean
//    Parrot parrot1() {
//        var p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Primary
//    @Bean("Miki")
//    Parrot parrot2() {
//        var p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot3() {
//        var p = new Parrot();
//        p.setName("Riki");
//        return p;
//    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }

}
