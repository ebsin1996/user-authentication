package configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@org.springframework.context.annotation.Configuration
public class AppConfig {

	@Bean
	public BCryptPasswordEncoder bCryptEncoder() {
		return new BCryptPasswordEncoder();
		

	}

}
