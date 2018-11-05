package com.li.generalmapper.Model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

@Data
@Table(name="users")
@NameStyle(value = Style.camelhumpAndLowercase)
public class User {

    @Id
    private Integer id;

    private String username;

    private String password;

    private String passwordSalt;

    @Transient
    private String role;
}
