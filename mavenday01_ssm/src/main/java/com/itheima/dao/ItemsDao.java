package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select * from items where id = #{id}")
    Items findById(Integer id);

}
