package com.bird.helloworld;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * testNG 测试类
 */
public class TestngHelloWorld {

    /**
     * 测试邮件地址
     */
    @Test
    public void testEmailGenerator(){

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email,"yzpbird@qq.com");

    }

}
