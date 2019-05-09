package com.leidal.timeservice.controller

import com.leidal.timeservice.model.CurrentTime
import com.leidal.timeservice.service.TimeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TimeServiceController  {

    @Autowired
    TimeService service

    @GetMapping(value = "/api/currentTime")
    CurrentTime getCurrentDateTime() {
        service.getCurrentDateTime()
    }

}