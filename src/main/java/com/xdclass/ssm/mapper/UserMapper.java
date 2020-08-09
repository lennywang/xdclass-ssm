package com.xdclass.ssm.mapper;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/8/8 22:50
 */

import com.xdclass.ssm.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

/**
 *
 **/
@Repository
public interface UserMapper {
    @Insert("insert into user (name,phone) values(#{name},#{phone})")
    @Options(useGeneratedKeys = true, keyColumn = "id",keyProperty = "id")
    int save(User user);
}
