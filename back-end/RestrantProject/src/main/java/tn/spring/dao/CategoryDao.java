package tn.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.Category;


@Repository
public interface CategoryDao extends JpaRepository<Category, Long>{

}
