package web_cosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web_cosmetic.entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Integer>{

}
