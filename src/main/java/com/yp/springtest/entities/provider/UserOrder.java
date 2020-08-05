package com.yp.springtest.entities.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户订单
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_provider_user_order")
@ApiModel(value = "用户订单")
public class UserOrder implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty(value = "商铺ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer storeId;

    @Column(length = 10)
    @ApiModelProperty(value = "服务ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer serviceId;

    @Column(length = 10)
    @ApiModelProperty(value = "用户ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer person;

    @Column(length = 255)
    @ApiModelProperty(value = "用户名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String personName;

    @Column(length = 255)
    @ApiModelProperty(value = "服务名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serviceName;

    @Column(length = 255)
    @ApiModelProperty(value = "标题")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;

    @Column(length = 1000)
    @ApiModelProperty(value = "简介")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;

    @Column(length = 20)
    @ApiModelProperty(value = "价格")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double price;

    @Column(length = 10)
    @ApiModelProperty(value = "数量")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer number;

    @Column(length = 20)
    @ApiModelProperty(value = "总价")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double amount;

    @Column(length = 20)
    @ApiModelProperty(value = "抵扣金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double deductAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "已付金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double payedAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "未付金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double notPayedAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "退款金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double refundAmount;

    @Column(length = 10)
    @ApiModelProperty(value = "优惠券ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer couponId;

    @Column(length = 255)
    @ApiModelProperty(value = "优惠券名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String couponName;

    @Column(length = 10)
    @ApiModelProperty(value = "付款状态 0-未付款 1-已付款 2-部分付款 3-退款中 4-全额退款 5-部分退款")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payStatus;

    @Column(length = 10)
    @ApiModelProperty(value = "订单状态，具体业务和服务进行定义，如（0-未完成 1-已完成 2-取消)")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

    @ApiModelProperty(value = "支付时间")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    private Date payTime;

    @Column(length = 3000)
    @ApiModelProperty(value = "备注")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String note;

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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getDeductAmount() {
        return deductAmount;
    }

    public void setDeductAmount(Double deductAmount) {
        this.deductAmount = deductAmount;
    }

    public Double getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(Double payedAmount) {
        this.payedAmount = payedAmount;
    }

    public Double getNotPayedAmount() {
        return notPayedAmount;
    }

    public void setNotPayedAmount(Double notPayedAmount) {
        this.notPayedAmount = notPayedAmount;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
}
