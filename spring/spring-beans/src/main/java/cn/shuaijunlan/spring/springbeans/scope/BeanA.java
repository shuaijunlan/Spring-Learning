package cn.shuaijunlan.spring.springbeans.scope;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:12 PM 3/13/19.
 */
public class BeanA {
    public void init(){
        System.out.println("beanA init");
    }
    public void destroy(){
        System.out.println("beanA destroy");
    }
}
