package com.example.drinker.dao;

import com.example.drinker.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDAO extends JpaRepository<Comment,Integer> {
    public List<Comment> findByBuildingId(int id);
}
