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
import com.mindtree.mall.service.AdminService;
@Configuration
@EnableWebSecurity
@Order(1)
public class AdminSecurityConfigure extends WebSecurityConfigurerAdapter{
	@Autowired
	private AdminService adminService;

	@Bean
	public AuthenticationProvider authProviderAdmin() {
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(adminService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
	}
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {

		http
		.antMatcher("/admin/**")
		.authorizeRequests().anyRequest().authenticated()
		.and().formLogin().loginPage("/admin/login")
		.defaultSuccessUrl("/getAdminMenu", true)
		.permitAll()
		.and().logout().logoutUrl("/admin/logout").logoutSuccessUrl("/admin/login");
	    http.csrf().disable();
}
}
