package com.mypro2020.demo.springboot.security_demo.mapper;

import com.mypro2020.demo.springboot.security_demo.entity.SysUser;
import org.apache.ibatis.annotations.Select;

public interface SysUserMapper {
    @Select("select * from sys_user where name = #{name}")
    SysUser getSysUserByName(String name);
}
