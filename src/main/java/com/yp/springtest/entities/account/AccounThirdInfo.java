package com.yp.springtest.entities.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 第三方支付收款账户信息
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_account_third_info")
@ApiModel(value = "第三方支付收款账户信息")
public class AccounThirdInfo implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty(value = "用户ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer person;

    @Column(length = 255)
    @ApiModelProperty(value = "用户名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String personName;

    @Column(length = 10)
    @ApiModelProperty(value = "账户ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer accountId;

    @Column(length = 10)
    @ApiModelProperty(value = "支付渠道 1-微信 2-支付宝 3-银行卡")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payChannel;

    @Column(length = 255)
    @ApiModelProperty(value = "appId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String appId;

    @Column(length = 255)
    @ApiModelProperty(value = "appSecret")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String appSecret;

    @Column(updatable = false)
    @ApiModelProperty(value = "创建时间",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;

    @ApiModelProperty(value = "修改时间",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getPerson() {
        return person;
    }

    public void setPerson(Integer person) {
        this.person = person;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
