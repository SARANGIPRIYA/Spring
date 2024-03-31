package com.Springsecurity.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@EnableWebSecurity
@EnableOAuth2Sso
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;
	@Bean
	public AuthenticationProvider authprovider() {
		
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService());
		   //to get password from databse as plain text.passwords in plaintext without any encoding or hashing.
		//provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		
		//to get password from database but bycrpt password will be stored in database 
		//,which is a widely recommended password-hashing algorithm.
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		return provider;
	}
	
	//for custom login page we will use this part of code.
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http
//			.csrf().disable()
//			.authorizeRequests().requestMatchers("/login").permitAll()
//			.anyRequest().authenticated()
//			.and()
//			.formLogin()
//			.loginPage("/login").permitAll()
//			.and()
//			.logout().invalidateHttpSession(true)
//			.clearAuthentication(true)
//			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//			.logoutSuccessUrl("/logout-success").permitAll();
//		
//	}
	
	
	//OAuth2 spring security
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.csrf().disable()
			.authorizeRequests().requestMatchers("/login").permitAll()
			.anyRequest().authenticated()
			.and().httpBasic();
		
		
	}
	//to create our own user name and password this code is used
//	@Bean
//	@Override
//	//we imported from methods source 
//	protected UserDetailsService userDetailsService() {
//		//userDetails class is built in class
//		List<UserDetails>users=new ArrayList<>();
//		//we can add no .of users
//		
//		users.add(User.withDefaultPasswordEncoder().username("jyoshna").password("1234").roles("user").build());
//		return new InMemoryUserDetailsManager(users);
//	}
	
	
	
		
}
