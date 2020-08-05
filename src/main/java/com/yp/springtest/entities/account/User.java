package com.yp.springtest.entities.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_auth_user")
@ApiModel(value = "用户表")
public class User implements Serializable {
    @Id
    @Column(length = 10, nullable = false)
    @ApiModelProperty(value = "用户ID", hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    @ApiModelProperty(value = "姓名或昵称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String personName;

    @Column
    @ApiModelProperty(value = "用户账号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
