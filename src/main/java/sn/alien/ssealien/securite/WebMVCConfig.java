package sn.alien.ssealien.securite;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

       // registry.addViewController("/home").setViewName("home");
       // registry.addViewController("/").setViewName("home");
       registry.addViewController("/error").setViewName("errors");
        //registry.addViewController("/login").setViewName("login");


    }
}
