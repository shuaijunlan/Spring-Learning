package cn.shuaijunlan.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:28 2018/3/31.
 */
@Component

public class TransactionalTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor=Exception.class,propagation = Propagation.REQUIRED)
    public void testOne(){
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE spring_test set value = 331 WHERE id = 2");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new NullPointerException();
    }

    @Transactional(rollbackFor=Exception.class,propagation = Propagation.REQUIRED)
    public void testTwo(){
        String sql = "update spring_test set value = 13131 where id = 2";
        jdbcTemplate.update(sql);
        throw new NullPointerException();
    }
}
