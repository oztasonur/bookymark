package com.onuroztas.bookymark.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BookmarkController {
    @GetMapping("/bookmarks")
    public ResponseEntity<List<?>> getBookmarks() {
        return ResponseEntity.ok(List.of("Getting all bookmarks..."));
    }


}
