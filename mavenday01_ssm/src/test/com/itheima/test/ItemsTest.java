package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    /**
     * 测试dao
     */
    @Test
    public void testDao() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = ac.getBean("itemsDao", ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items);
    }


    /**
     * 测试service
     */
    @Test
    public void testService() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService service = ac.getBean("itemsServiceImpl",ItemsService.class);
        Items items = service.findById(1);
        System.out.println(items);
    }

}
