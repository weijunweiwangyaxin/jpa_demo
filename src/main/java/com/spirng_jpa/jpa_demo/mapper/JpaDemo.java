package com.spirng_jpa.jpa_demo.mapper;

import com.spirng_jpa.jpa_demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName:JpaDemo
 * Package:com.spirng_jpa.jpa_demo.mapper
 * Description:
 *
 * @Date:2020/2/28 0:37
 * @Author: To change this template use File | Settings |Editor| File and Code Templates.
 */
public interface JpaDemo extends JpaRepository<User,Integer> {

    List<User> findByName(String name);
}
