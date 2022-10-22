package com.proiect.mrc.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{
	 
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		/*UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication().withUser(users.username("client1").password("client1"))
			.withUser(users.username("handyman1").password("handyman1"));*/
		
		auth
			.inMemoryAuthentication()
				.withUser("client1")
				.password("client1")
				.roles("CLIENT")
			.and()
				.withUser("handyman1")
				.password("handyman1")
				.roles("HANDYMAN");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.anyRequest().authenticated()
			.and().formLogin()
			.loginPage("/showMyLoginPage")
			.loginProcessingUrl("/authenticateTheUser")
			.permitAll();
	}
	
}
