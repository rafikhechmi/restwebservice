package com.rafik;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {
   // @RequestMapping(method= RequestMethod.GET, path="/welcome")
    @GetMapping(path = "/welcome/{msg}")
    public WelcomeBean welcomeMessage(@PathVariable String msg){
        return new WelcomeBean("Welcome to Rest Web Services : " +msg);

}
}
