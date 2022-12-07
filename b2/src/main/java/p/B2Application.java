package p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class B2Application {

    protected static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(B2Application.class, args);
    }
}
