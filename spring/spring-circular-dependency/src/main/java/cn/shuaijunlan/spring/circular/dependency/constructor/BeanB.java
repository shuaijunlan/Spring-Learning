package cn.shuaijunlan.spring.circular.dependency.constructor;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 8:35 AM 3/14/19.
 */
public class BeanB {
    private BeanC bean;
    public BeanB(BeanC bean){
        this.bean = bean;
    }
}
