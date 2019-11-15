package cn.shuaijunlan.spring.aop;

import org.springframework.stereotype.Service;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:54 PM 5/28/19.
 */
@Service
public class LoginService {
    public boolean login(String username, String password){
        if (username.equals("admin") && password.equals("123456")){
            return true;
        }
        return false;
    }
}
