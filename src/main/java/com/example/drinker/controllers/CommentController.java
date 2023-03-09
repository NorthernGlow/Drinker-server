package com.example.drinker.controllers;

import com.example.drinker.models.Comment;
import com.example.drinker.services.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
public class CommentController {
    private CommentService commentService;

    @PostMapping("saveComment")
    public void saveComment(@RequestBody Comment comment) throws Exception {
        commentService.saveComment(comment);
    }

    @PostMapping("allComments/{id}")
    public List<Comment> getAllCommentsAboutBuild(@PathVariable int id){
        return commentService.getAllCommentAboutBuild(id);
    }
}
