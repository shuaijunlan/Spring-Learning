package cn.shuaijunlan.dubbo.learning.service.impl;

import cn.shuaijunlan.dubbo.learning.service.IAddName;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:08 AM 2018/08/02.
 */
public class AddName implements IAddName {
    @Override
    public void addName(String name) {
        System.out.println("Add name:" + name);
    }
}
