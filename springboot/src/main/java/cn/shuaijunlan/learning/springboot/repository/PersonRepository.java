package cn.shuaijunlan.learning.springboot.repository;

import cn.shuaijunlan.learning.springboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:55 2017/12/22.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
