package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface UserMapper {

   /**
    * 返回单条数据是1个Map，1个Map放在List中用<Map<String,String>>接收返回数据
    * 返回多条数据是多个Map，多个Map放在List中用List<Map<String,String>>接收返回数据
    * @return
    */
   List<Map<String,String>> queryByUser();

   Map<String,Object> queryById(Map<String,Object> map);


   User selectById(int id);

   User selectByName(String username);

   User selectByEmail(String eamil);

   int insertUser(User user);

   int updateStatus(int id,int status);

   int updateHeader(int id,String headerUrl);

   int updatePassword(int id,String password);

}
