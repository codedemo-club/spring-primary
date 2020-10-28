package club.codedemo.springprimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPrimaryApplication {
    /**
     * 在没有使用@Primary的情况下
     * 将发生NoUniqueBeanDefinitionException异常
     */
    @Autowired
    Employee employee;

    public static void main(String[] args) {
        SpringApplication.run(SpringPrimaryApplication.class, args);
    }

}
