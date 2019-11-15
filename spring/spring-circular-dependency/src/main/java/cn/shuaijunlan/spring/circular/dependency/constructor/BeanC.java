package cn.shuaijunlan.spring.circular.dependency.constructor;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:36 AM 3/14/19.
 */
public class BeanC {
    private BeanA beanA;
    public BeanC(BeanA beanA){
        this.beanA = beanA;
    }
}
