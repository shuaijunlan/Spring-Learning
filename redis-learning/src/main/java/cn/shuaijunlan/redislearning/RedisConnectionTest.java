package cn.shuaijunlan.redislearning;

import redis.clients.jedis.Jedis;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:50 PM 1/21/19.
 */
public class RedisConnectionTest {
    public static void main(String[] args) {
        //构造一个reids的客户端对象
        Jedis jedis = new Jedis("218.199.102.33",6379);
        //发送一个ping命令
        String ping = jedis.ping();
        System.out.println(ping);
    }
}
