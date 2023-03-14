package com.example.drinker.services;

import com.example.drinker.dao.CommentDAO;
import com.example.drinker.models.Comment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentService {

    private CommentDAO commentDAO;

    public void saveComment(Comment comment) throws Exception {
        if (comment != null) {
            commentDAO.save(comment);
        } else {
            throw new Exception();
        }
    }

    public List<Comment> getAllCommentAboutBuild(int id){
      return commentDAO.findByBuildingId(id);
    }

    public void likes(int id, int like){
        Comment comment = commentDAO.findById(id).get();
        comment.setLikes(like);
        commentDAO.save(comment);
    }
    public void dislike(int commentId, int dislike){
        Comment comment = commentDAO.findById(commentId).get();
        comment.setDislikes(dislike);
        commentDAO.save(comment);
    }
}
