package com.server.youtube.controller;


import com.server.youtube.domain.Video;
import com.server.youtube.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/*")
public class VideoController {

    @Autowired
    private VideoService service;

    // 비디오 전체목록 보기
    @GetMapping("/video/")
    public ResponseEntity viewAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.viewAll());
    }
}
