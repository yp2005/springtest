package com.yp.springtest.entities.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 优惠券类型
 *
 * @Author: yupeng
 */

@Entity
@Table(name = "t_provider_coupon_type")
@ApiModel(value = "优惠券类型")
public class CouponType {
    @Id
    @Column(length = 10, nullable = false)
    @ApiModelProperty(value = "主键ID", hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 255)
    @ApiModelProperty(value = "优惠券名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String couponName;

    @Column(length = 10)
    @ApiModelProperty(value = "是否全平台优惠券 0-否 1-是")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isGlobal;

    @Column(length = 10)
    @ApiModelProperty(value = "是否免费 0-否 1-是")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isFree;

    @Column(length = 20)
    @ApiModelProperty(value = "售价")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double price;

    @Column(length = 10)
    @ApiModelProperty(value = "商铺ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer storeId;

    @Column(length = 10)
    @ApiModelProperty(value = "是否全部服务适用 0-否 1-是")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isAllService;

    @Column(length = 10)
    @ApiModelProperty(value = "服务ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer serviceId;

    @Column(length = 20)
    @ApiModelProperty(value = "满多少金额可用，0表示无限制")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ColumnDefault("0")
    private Double limitAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "抵扣金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double amount;

    @Column(length = 10)
    @ApiModelProperty(value = "是否限时 0-否 1-是")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isLimitTime;

    @Column(length = 10)
    @ApiModelProperty(value = "状态 0-未开始 1-进行中 2-结束")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

    @ApiModelProperty(value = "开始时间")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @ApiModelProperty(value = "结束时间")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

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

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getIsAllService() {
        return isAllService;
    }

    public void setIsAllService(Integer isAllService) {
        this.isAllService = isAllService;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getIsLimitTime() {
        return isLimitTime;
    }

    public void setIsLimitTime(Integer isLimitTime) {
        this.isLimitTime = isLimitTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
