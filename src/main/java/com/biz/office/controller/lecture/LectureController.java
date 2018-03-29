package com.biz.office.controller.lecture;

import com.biz.office.service.lecture.LectureService;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class LectureController {

    private LectureService service;

    @Inject
    public LectureController(LectureService service) {
        this.service = service;
    }


}
