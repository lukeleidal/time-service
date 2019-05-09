package com.leidal.timeservice.service

import com.leidal.timeservice.model.CurrentTime

class TimeServiceTest extends GroovyTestCase {
    TimeService service

    void testGetCurrentDateTimeIsCurrentTimeObj() {
        service = new TimeService()
       assert service.getCurrentDateTime().class == CurrentTime
    }

    void testGetCurrentDateTimeHasCurrentTimeString() {
        service = new TimeService()
       assert service.getCurrentDateTime().hasProperty("currentTime")
    }
}
