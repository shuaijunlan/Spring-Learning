package springbootlearning;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 13:12 2017/12/10.
 */
public class HelloWorld {

    public String getMessage(boolean bigger) {
        if (bigger) {
            return "Hello Universe!";
        } else {
            return "Hello World!";
        }
    }

}