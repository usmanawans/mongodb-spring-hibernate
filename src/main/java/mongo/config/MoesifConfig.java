package mongo.config;

/**
 * Created by Usman on 15.04.2017.
 *
 * Moesif is an API monitoring tool
 * It keeps the log log of every API call
 * It tells wether the API call was succedful or a failed
 *
 */


import com.moesif.servlet.MoesifFilter;

import javax.servlet.Filter;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.http.converter.*;

@Configuration
public class MoesifConfig extends WebMvcConfigurerAdapter {

    @Bean
    public Filter moesifFilter() {
        return new MoesifFilter("eyJhcHAiOiI1MTk6MiIsInZlciI6IjIuMCIsIm9yZyI6IjQzNjo0IiwiaWF0IjoxNDkyMjE0NDAwfQ.WJXPo2OCahVu5Z6GaAk5_EAz-rh7oAaH6MCEJ5VoFqA");
    }
}