package main.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Map;

@Controller
public class WelcomeController {


//    private GetCalenderData getCalenderData;

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

//    @Autowired
//    public WelcomeController(GetCalenderData getCalenderData) {
//        this.getCalenderData = getCalenderData;
//    }

    @RequestMapping(value = "/")
    public String index(Map<String, Object> model) throws IOException {

        logger.debug("index() is executed!");

//        List<Event> items = getCalenderData.getEventDetails();
//        model.put("msg", items.get(1).getSummary());

        return "index";
    }

//    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
//    public ModelAndView hello(@PathVariable("name") String name) {
//
//        logger.debug("hello() is executed - $name {}", name);
//
//        ModelAndView model = new ModelAndView();
//        model.setViewName("index");
//
//        model.addObject("title", getCalenderData.getTitle(name));
//        model.addObject("msg", getCalenderData.getDesc());
//
//        return model;
//
//    }

}
