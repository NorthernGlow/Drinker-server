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
}
