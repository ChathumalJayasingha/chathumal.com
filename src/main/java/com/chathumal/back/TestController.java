package com.chathumal.back;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 9/4/22 | 2022-September-04[Sunday]
 */
@RestController
@CrossOrigin
public class TestController {

    @GetMapping
    public String testController(){
        return "Project Working ";
    }

}
