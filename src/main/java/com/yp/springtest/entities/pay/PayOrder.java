package com.yp.springtest.entities.pay;

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
 * 支付公用订单
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_pay_order")
@ApiModel(value = "支付公用订单")
public class PayOrder implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 255)
    @ApiModelProperty(value = "业务ID，其他业务系统可自定义")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Deprecated
    private String businessId;

    @Column(length = 10)
    @ApiModelProperty(value = "用户订单ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer userOrderId;

    @Column(length = 10)
    @ApiModelProperty(value = "退款订单ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer refundOrderId;

    @Column(length = 255)
    @ApiModelProperty(value = "业务标识")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String businessKey;

    @Column(length = 255)
    @ApiModelProperty(value = "业务名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String businessName;

    @Column(length = 10)
    @ApiModelProperty(value = "订单状态 0-取消 1-待付款 2-付款中 3-付款成功 4-付款失败")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer orderStatus;

    @Column(length = 10)
    @ApiModelProperty(value = "支付渠道 1-微信 2-支付宝 3-合作银行")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payChannel;

    @Column(length = 10)
    @ApiModelProperty(value = "支付终端：1-web 2-app")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payTerminal;

    @Column(length = 10)
    @ColumnDefault("0")
    @ApiModelProperty(value = "开票状态 0-未开 1-已开")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer openInvoice;

    @Column(length = 255)
    @ApiModelProperty(value = "备注")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String note;

    @Column(length = 20)
    @ApiModelProperty(value = "订单费用")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double money;

    @Column(length = 10)
    @ApiModelProperty(value = "1-充值 2-支付 3-退款")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer type;

    @Column(length = 255)
    @ApiModelProperty(value = "业务系统标识")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String systemKey;

    @Column(length = 10)
    @ApiModelProperty(value = "支付人ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payUserId;

    @Column(length = 255)
    @ApiModelProperty(value = "支付人名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String payUserName;

    @Column(length = 10)
    @ApiModelProperty(value = "用户ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer person;

    @Column(length = 255)
    @ApiModelProperty(value = "用户名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String personName;

    @Column(length = 10)
    @ApiModelProperty(value = "商铺ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer storeId;

    @Column(length = 10)
    @ApiModelProperty(value = "服务ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer serviceId;

    @Column(length = 10)
    @ApiModelProperty(value = "收款人ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payeeId;

    @Column(length = 10)
    @ApiModelProperty(value = "收款人账户")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payeeAccountId;

    @ApiModelProperty(value = "支付时间")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    private Date payTime;

    @Column(length = 20)
    @ApiModelProperty(value = "实际支付费用")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double payMoney;

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

    public Integer getOpenInvoice() {
        return openInvoice;
    }

    public void setOpenInvoice(Integer openInvoice) {
        this.openInvoice = openInvoice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getSystemKey() {
        return systemKey;
    }

    public void setSystemKey(String systemKey) {
        this.systemKey = systemKey;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayUserName() {
        return payUserName;
    }

    public void setPayUserName(String payUserName) {
        this.payUserName = payUserName;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public Integer getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(Integer payUserId) {
        this.payUserId = payUserId;
    }

    public Integer getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(Integer payeeId) {
        this.payeeId = payeeId;
    }

    public Integer getPayeeAccountId() {
        return payeeAccountId;
    }

    public void setPayeeAccountId(Integer payeeAccountId) {
        this.payeeAccountId = payeeAccountId;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(Integer userOrderId) {
        this.userOrderId = userOrderId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getPayTerminal() {
        return payTerminal;
    }

    public void setPayTerminal(Integer payTerminal) {
        this.payTerminal = payTerminal;
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

    public Integer getRefundOrderId() {
        return refundOrderId;
    }

    public void setRefundOrderId(Integer refundOrderId) {
        this.refundOrderId = refundOrderId;
    }
}
