package com.spirng_jpa.jpa_demo.pojo;

import javax.persistence.*;

/**
 * ClassName:User
 * Package:com.spirng_jpa.jpa_demo.pojo
 * Description:
 *
 * @Date:2020/2/28 0:30
 * @Author: To change this template use File | Settings |Editor| File and Code Templates.
 */
//使用jpq注解配置映射关系
@Entity
//用来对应数据库中那张表，如果不写就代表user表
@Table(name = "tk_user")
public class User {

    //这是一个主键
    @Id
    //主键自增长
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column(name = "ages")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
