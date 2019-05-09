package com.leidal.timeservice.service

import com.leidal.timeservice.model.CurrentTime
import org.springframework.stereotype.Service

import static java.time.LocalDateTime.now
import static java.time.format.DateTimeFormatter.ofPattern

@Service
class TimeService {

    static CurrentTime getCurrentDateTime() {
        CurrentTime currentTime = new CurrentTime()
        currentTime.currentTime = now().format(ofPattern("yyyy-MM-dd k:mm:ss"))
        currentTime
    }
}