package quoters;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = {"mySpring","quoters"})
@PropertySource("classpath:quotes.properties")
@EnableAspectJAutoProxy
public class QuoterConfig {

  /*  @Bean  only for ancient spring versions < 4.3
    public PropertySourcesPlaceholderConfigurer configurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }*/
}
