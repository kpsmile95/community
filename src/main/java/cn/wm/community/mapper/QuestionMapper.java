package cn.wm.community.mapper;

import cn.wm.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question(title,description,gmt_create,gmt_modified,creator,tag) values(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    int create(Question question);

    @Select("select * from question")
    List<Question> selectAll();

    @Select("select count(1) from question")
    Integer count();

    @Select("select * from question limit  #{offset},#{size}")
    List<Question> list(@Param("offset") Integer offset,@Param("size") Integer size);

    @Select("select * from question where creator=#{id} limit  #{offset},#{size}")
    List<Question> listById(@Param("id") Long id, @Param("offset") Integer offset,@Param("size") Integer size);

    @Select("select count(1) from question where creator=#{id}")
    Integer countById(@Param("id")Long id);
}
