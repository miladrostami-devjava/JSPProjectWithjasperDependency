package org.jsp.JSPProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * This is a simple project for jsp template
 * It is implemented by Spring Boot framework
 * It is only necessary to follow the following points jsp
 * Follow to introduce it to the project.
 * The tips include the following in order:
 * 1.	created spring web application using spring initializr (provided inside intellij IDEA)
 * 2.	created webapp folder under src/main
 * 3.	Opened project structure window (ctrl-shift-alt), selected modules under project settings
 * 4.	in the middle window pane, select Web
 * 5.	added newly created folder (src/main/webapp) under "web resources directory"
 * 6.	applied changes
 * */





@Controller
@RequestMapping("/api/v1/")
public class JSPController {

    @GetMapping("/jsp")
    public String getJsp(Model model, @RequestParam(value = "text",required = false
    ,defaultValue = "hello jsp") String text){
     model.addAttribute("text", "JSP Welcome" + text);
     return "index";

    }

    /*@GetMapping("/v1")
    public String getJsp(){
        return "hello";

    }*/


}
