package cn.shuaijunlan.learning.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:46 2017/12/21.
 */
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Float height;

    //  age >= 18
    @Min(value = 18, message = "No admittance!")
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

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
