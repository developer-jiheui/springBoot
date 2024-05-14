package com.gdu.myapp2.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gdu.myapp2.dto.LeaveUserDto;
import com.gdu.myapp2.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
  UserDto getUserByMap(Map<String, Object> map);
  LeaveUserDto getLeaveUserByMap(Map<String, Object> map);
  int insertUser(UserDto user);
  int deleteUser(int userNo);
  int insertAccessHistory(Map<String, Object> map);
  int updateAccessHistory(String sessionId);
}
