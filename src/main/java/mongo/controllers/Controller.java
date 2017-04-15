package mongo.controllers;


import mongo.entities.Person;
import mongo.entities.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Usman on 03.04.2017.
 */

@RestController
public class Controller {

    @Autowired
    private PersonRepository personRepository;



    @RequestMapping(value="/", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String index(){

        String result = "";
        for( Person p: personRepository.findAll() ){
            result = result + p.getFirstName() + " ";
        }

        return result;
    }

    @RequestMapping(value = "/create", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String create( @RequestParam Map<String,String> requestParams ) throws Exception
    {
        Person p = new Person();
        if(!(requestParams.get("fname").equals(null)))
            p.setFirstName(requestParams.get("fname"));
        else if(!(requestParams.get("lname").equals(null)))
            p.setFirstName(requestParams.get("fname"));


        personRepository.save(p);
        //Person p = personRepository.findOne("58e0d4ecf36d2878e036d5eb");
        return Integer.toString(personRepository.findAll().size());
    }

    @RequestMapping(value = "/loop", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String loop()
    {


        for(int i=0; i<1334; i++){
            Person p = new Person();
            p.setFirstName("f.name "+(Integer.toString(i)));
            p.setLastName("l.name "+(Integer.toString(i)));
            personRepository.save(p);
        }


        //Person p = personRepository.findOne("58e0d4ecf36d2878e036d5eb");
        return Integer.toString(personRepository.findAll().size());
    }

    @RequestMapping(value = "/size", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String size()
    {
        return Integer.toString(personRepository.findAll().size());
    }




}
