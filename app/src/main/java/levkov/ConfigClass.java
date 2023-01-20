package levkov;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("levkov")
@PropertySource("classpath:musicPlayer.properties")
public class ConfigClass {

//  example of bean
/*   @Bean
    public User userBean() {
        return new User();
    }
*/

}
