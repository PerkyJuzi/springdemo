package com.example.demo.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.User;

@Mapper
public interface UserDao {

	public User find(@Param("name") String name, @Param("password") String password);

	// 注： CRTL+Shift+O，快捷导入所有import
	// Dao 有必要封装标准Dao
}
