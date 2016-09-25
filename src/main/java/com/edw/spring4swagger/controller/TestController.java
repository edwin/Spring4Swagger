package com.edw.spring4swagger.controller;

import com.edw.spring4swagger.bean.Test;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *  com.edw.spring4swagger.controller.TestController 
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * Sep 25, 2016 1:18:47 PM
 *
 */
@RestController
public class TestController {

    @ApiOperation(value = "Testing Page")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Test test(@RequestParam String name, @RequestParam(required = false) String address) {
        Test test = new Test();
        test.setAddress(address);
        test.setName(name);
        return test;
    }
    
}
