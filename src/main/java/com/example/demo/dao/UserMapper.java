package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 添加该注解为了解决idea爆红，不有实际作用
 * @Repository
 */
@Repository
public interface UserMapper {
    User getUserInfo(int id);
}
