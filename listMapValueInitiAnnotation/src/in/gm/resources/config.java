package in.gm.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("in.gm.beans")
@PropertySource("classpath:in/gm/properies/student.properties")
public class config {
}
