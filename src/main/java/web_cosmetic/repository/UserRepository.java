package web_cosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web_cosmetic.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
