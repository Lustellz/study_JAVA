package com.board.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    
	@Autowired
	private UserDetailsService memberService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Override
    public void configure(WebSecurity web) throws Exception
    {
        web.ignoring()
        .antMatchers("/templates/**")
        .antMatchers("/resources/**")
        .antMatchers("/css/**")
        .antMatchers("/js/**")
        .antMatchers("/img/**")
        .antMatchers("/lib/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

    	http
    	.authorizeRequests()
                // 페이지 권한 설정

				.antMatchers("/signup").permitAll()
    			.antMatchers("/**").permitAll()
    			.antMatchers("/home").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/user/myinfo").hasRole("MEMBER")
                .anyRequest().permitAll()
            .and() // 로그인 설정
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/loginProcess")
                .defaultSuccessUrl("/user/login/result")
                .permitAll()
            .and() // 로그아웃 설정
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
                .logoutSuccessUrl("/user/logout/result")
                .invalidateHttpSession(true)
            .and().csrf().disable();
                // 403 예외처리 핸들링
//                .exceptionHandling()
//                .accessDeniedHandler(accessDeniedHandler())
//                .authenticationEntryPoint(authenticationEntryPoint());
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(memberService).passwordEncoder(passwordEncoder());
    }
    /*
    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler() {
        CustomizedLoginSuccessHandler successHandler = new CustomizedLoginSuccessHandler();
        successHandler.setDefaultTargetUrl("/index");
        return successHandler;
    }
    
    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        CustomizedLoginFailureHandler failureHandler = new CustomizedLoginFailureHandler();
        failureHandler.setDefaultFailureUrl("/loginPage?error=error");
        return failureHandler;
    }

    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        CustomAccessDeniedHandler accessDeniedHandler = new CustomAccessDeniedHandler();
        accessDeniedHandler.setErrorPage("/error/403");
        return accessDeniedHandler;
    }

    @Bean
    public AuthenticationEntryPoint authenticationEntryPoint() {
        return new CustomAuthenticationEntryPoint("/loginPage?error=e");
    }

*/

}
