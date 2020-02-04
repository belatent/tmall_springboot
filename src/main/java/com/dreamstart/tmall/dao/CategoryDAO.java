package com.dreamstart.tmall.dao;
  
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.dreamstart.tmall.pojo.Category;
 
public interface CategoryDAO extends JpaRepository<Category,Integer>{
 
}