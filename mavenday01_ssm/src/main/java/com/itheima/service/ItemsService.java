package com.itheima.service;

import com.itheima.domain.Items;

public interface ItemsService {

    /**
     * 根据id查找
     * @param id
     * @return
     */
    Items findById(Integer id);
}
