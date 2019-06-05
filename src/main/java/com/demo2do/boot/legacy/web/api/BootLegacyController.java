package com.demo2do.boot.legacy.web.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootLegacyController {

    private static Logger logger = LoggerFactory.getLogger(BootLegacyController.class);


    @RequestMapping("/foo")
    public ResponseEntity foo() {

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
