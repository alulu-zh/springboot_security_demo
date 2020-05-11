package com.mypro2020.demo.springboot.security_demo.entity;

import lombok.Data;

@Data
public class SysPermission {
    private Integer id;

    //权限名称
    private String name;

    //权限描述
    private String description;

    //授权链接
    private String url;

    //父节点id
    private Integer pid;
}
