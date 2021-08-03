package com.mindtree.mall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.mindtree.mall.service.CustomerService;
@Configuration
@EnableWebSecurity
@Order(2)
public class CustomerSecurityConfigure extends WebSecurityConfigurerAdapter{
	@Autowired
	private CustomerService customerService;

	@Bean
	public AuthenticationProvider authProviderCustomer() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(customerService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
    
		http.csrf().disable().authorizeRequests()
		 .antMatchers("/home").permitAll()
		 .and()
		 .formLogin()
		 .loginPage("/login")
		 .and()
		 .logout().invalidateHttpSession(true).clearAuthentication(true)
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/logout-success").permitAll();
}
}
