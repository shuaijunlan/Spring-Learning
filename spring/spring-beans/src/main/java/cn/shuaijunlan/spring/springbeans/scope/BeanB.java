package cn.shuaijunlan.spring.springbeans.scope;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:12 PM 3/13/19.
 */
public class BeanB {
    private BeanA beanA;

    public BeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

    public void init(){
        System.out.println("beanB init");
    }
    public void destroy(){
        System.out.println("beanC init");
    }
}
