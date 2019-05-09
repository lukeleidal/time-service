package com.leidal.timeservice.controller

import com.leidal.timeservice.model.CurrentTime
import com.leidal.timeservice.service.TimeService


class TimeServiceControllerTest extends GroovyTestCase {
    TimeServiceController controller

    void testGetCurrentDateTime() {
        controller = new TimeServiceController()
        controller.service = new TimeService()
        CurrentTime currentTime = new CurrentTime()
        currentTime.currentTime = "2019-05-08 19:22:25"
        controller.service.metaClass.getCurrentDateTime = { currentTime }

        assert controller.currentDateTime.currentTime == currentTime.currentTime
    }
}
