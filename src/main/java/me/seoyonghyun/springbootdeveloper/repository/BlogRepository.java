package me.seoyonghyun.springbootdeveloper.repository;

import me.seoyonghyun.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {


}
