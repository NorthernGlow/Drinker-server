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

    @GetMapping("allComments/{id}")
    public List<Comment> getAllCommentsAboutBuild(@PathVariable int id){
        return commentService.getAllCommentAboutBuild(id);
    }

    @PutMapping("comment/{commentId}/like")
    public void like(@PathVariable int commentId, @RequestBody int like){
        commentService.likes(commentId,like);
    }
    @PutMapping("comment/{commentId}/dislike")
    public void dislike(@PathVariable int commentId, @RequestBody int dislike){
        commentService.dislike(commentId,dislike);
    }
}
