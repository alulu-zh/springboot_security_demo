package com.mypro2020.demo.springboot.security_demo.service;

import com.mypro2020.demo.springboot.security_demo.entity.SysUser;
import com.mypro2020.demo.springboot.security_demo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class SysUserService {
    private final SysUserMapper sysUserMapper;
    @Autowired
    public SysUserService(SysUserMapper sysUserMapper) {
        this.sysUserMapper = sysUserMapper;
    }
    public SysUser getSysUserByName(String name) {
        return sysUserMapper.getSysUserByName(name);
    }
}
