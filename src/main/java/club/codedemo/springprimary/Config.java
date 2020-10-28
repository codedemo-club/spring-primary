package club.codedemo.springprimary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

    @Bean
    @Primary
    public Employee JohnEmployee() {
        return new Employee("John");
    }

    @Bean
    public Employee TonyEmployee() {
        return new Employee("Tony");
    }
}
