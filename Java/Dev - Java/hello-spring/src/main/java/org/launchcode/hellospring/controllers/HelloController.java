package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dottie Quick
 */
@Controller
public class HelloController {

    // Responds to /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
  //  @ResponseBody
    public String hello(@RequestParam String name, Model model) {
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    // Responds to /hello/LaunchCode
    @GetMapping("hello/{name}")
   // @ResponseBody
    public String helloAgain(@PathVariable String name, Model model) {
        String theGreeting = "Hello, " + name + "!";
        model.addAttribute("greeting", theGreeting);
        return "hello";
    }

    @GetMapping("form")
   // @ResponseBody
    public String helloForm() {
//        String html = "<html>" +
//                "<body>" +
//                "<form method = 'post' action = '/hello'>" +
//                "<input type = 'text' name = 'name; />" +
//                "<input type = 'submit' value = 'Greet Me!' />" +
//                "</form>" +
//                "</body>" +
//                "</html>";
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("theNames", names);
        return "hello-list";

    }
}




//@Controller
////@RequestMapping("hello")
//public class HelloController {
//
//    // Handles requests at /hello
////    @GetMapping("hello")
////    @ResponseBody
////    public String hello() {
////        return "Hello, Spring!";
////    }
//
//    // Handles requests at /goodbye
//    @GetMapping("goodbye")
//    @ResponseBody
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    // Handles requests of the form /hello?name=LaunchCode
//
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "helloLang")
//    @ResponseBody
//    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
//        return language + ", "+ name + "!";
//    }
//
//
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    @ResponseBody
//    public String hello(@RequestParam String name) {
//        return "Hello, "+ name + "!";
//    }
//
//    //Handles requests of the form /hello/LaunchCode
//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//
//    @GetMapping("form")
//    public String helloForm(){
//        return "form";
//    }
//
//    @GetMapping("formLanguage")
//    @ResponseBody
//    public String createMessage(){
//        return "<html>" +
//                "<body>" +
//                "<form action='helloLang' method='post'>" +
//                "<input type='text' name='name'>" +
//                "<select name='language' id='language-select'>" +
//                "<option value='Hello'>--Select a language--</option>" +
//                "<option value='Hallo'>German</option>" +
//                "<option value='Sveiki'>Lithuanian</option>" +
//                "<option value='Hei'>Finnish</option>" +
//                "<option value='Buna'>Romanian</option>" +
//                "<option value='Hola'>Spanish</option>" +
//                "</select>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
//
//
//}
