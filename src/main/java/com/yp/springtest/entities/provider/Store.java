package com.yp.springtest.entities.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 商铺/店铺/商家
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_provider_store")
@ApiModel(value = "商铺/店铺/商家")
public class Store implements Serializable {
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
    @ApiModelProperty(value = "公司ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer company;

    @Column(length = 255)
    @ApiModelProperty(value = "公司名")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyName;

    @Column(length = 255)
    @ApiModelProperty(value = "商铺名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String storeName;

    @Column(length = 255)
    @ApiModelProperty(value = "经营范围")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String businessScope;

    @Column(length = 10)
    @ApiModelProperty(value = "是否被关停 0-否 1-是")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ColumnDefault("0")
    private Integer isForbidden;

    @Column(length = 500)
    @ApiModelProperty(value = "关停说明")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String forbidNote;

    @Column(length = 10)
    @ApiModelProperty(value = "是否开业 0-否 1-是")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ColumnDefault("0")
    private Integer isOpened;

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

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
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

    public Integer getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(Integer isForbidden) {
        this.isForbidden = isForbidden;
    }

    public String getForbidNote() {
        return forbidNote;
    }

    public void setForbidNote(String forbidNote) {
        this.forbidNote = forbidNote;
    }

    public Integer getIsOpened() {
        return isOpened;
    }

    public void setIsOpened(Integer isOpened) {
        this.isOpened = isOpened;
    }
}
