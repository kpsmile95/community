package cn.wm.community.mapper;

import cn.wm.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where token=#{token}")
    User selectByToken(@Param("token") String token);

    @Insert("insert into user(accountid,name,token,avatarUrl) values(#{accountId},#{name},#{token},#{avatarUrl})")
    int insertUser(User user);

    @Select("select * from user where id=#{id}")
    User selectById(@Param("id")Long id);
}
