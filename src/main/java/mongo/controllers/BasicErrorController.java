package mongo.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by Usman on 15.04.2017.
 */

@RestController
@ApiIgnore
public class BasicErrorController {

    @RequestMapping(value = "/error", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String error()
    {
        return "";
    }

}
