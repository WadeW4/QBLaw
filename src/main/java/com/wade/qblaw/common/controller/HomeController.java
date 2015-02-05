package com.wade.qblaw.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage() {
        LOGGER.info("Rendering homepage.");
        return "index";
    }

    @RequestMapping(value = "/base/about-us", method = RequestMethod.GET)
    public String aboutus() {
        LOGGER.info("Rendering about-us page.");
        return "base/about-us/index";
    }
}
