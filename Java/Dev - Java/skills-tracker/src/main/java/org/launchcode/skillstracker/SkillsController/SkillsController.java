package org.launchcode.skillstracker.SkillsController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String programmingLanguages() {
        return "<html>" +
                "<body>" +
                "<H1> Skills Tracker </H1>" +
                "<H2> Programming Languages </H2>" +
                "<ol> " +
                "<li> JavaScript </li>" +
                "<li> Java </li>" +
                "<li> Python </li>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String favoriteLanguageForm() {
        return "<html>" +
                "<body>" +
                "<form action='favorite' method='post'>" +
                "<p>Name:</p>" +
                "<input type='text' name='name'>" +
                "<p>My favorite language:</p>" +
                "<select name='favoriteLanguage' id='favorite-select'>" +
                "<option value='favoriteLanguage'>--First Favorite--</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br>" +

                "<p>My second favorite language:</p>" +
                "<select name='secondFavoriteLanguage' id='second-favorite-select'>" +
                "<option value='secondFavoriteLanguage'>--Second Favorite--</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +

                "<p>My third favorite language:</p>" +
                "<select name='thirdFavoriteLanguage' id='third-favorite-select'>" +
                "<option value='thirdFavoriteLanguage'>--Third Favorite--</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br>" +

                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "favorite")
    @ResponseBody
    public String favoriteLanguagesRanked(@RequestParam String name, @RequestParam String favoriteLanguage, @RequestParam String secondFavoriteLanguage, @RequestParam String thirdFavoriteLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favoriteLanguage + "</li>" +
                "<li>" + secondFavoriteLanguage + "</li>" +
                "<li>" + thirdFavoriteLanguage + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}

