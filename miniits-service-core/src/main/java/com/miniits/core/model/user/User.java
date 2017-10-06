package com.miniits.core.model.user;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author: wq
 * @Date: 2017/10/4
 * @Time: 20:28
 * <p>
 * Description:
 * ***
 */

@Entity
@Table(name = "user")
public class User {

    private String id;
    private Integer age;

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, length = 32)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "age", length = 3)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
