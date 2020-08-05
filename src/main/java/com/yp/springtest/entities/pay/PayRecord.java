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
 * 支付记录
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_pay_record")
@ApiModel(value = "支付记录")
public class PayRecord implements Serializable {
    @Id
    @Column(length = 10, nullable = false)
    @ApiModelProperty(value = "主键ID", hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty(value = "1-充值 2-支付 3-退款")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer orderType;

    @Column(length = 255)
    @ApiModelProperty(value = "生成唯一编号第三方支付订单号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String payOrderNumber;

    @Column(length = 10)
    @ColumnDefault("1")
    @ApiModelProperty(value = "1-单笔支付 2-批量支付")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payAction;

    @Column(length = 255)
    @ApiModelProperty(value = "单个支付，关联订单ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer orderId;

    @Column(length = 20)
    @ApiModelProperty(value = "支付金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double money;

    @Column(length = 10)
    @ApiModelProperty(value = "支付渠道 1-微信 2-支付宝 3-银行卡")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payChannel;

    @Column(length = 10)
    @ApiModelProperty(value = "支付终端：1-web 2-app")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payTerminal;

    @Column(length = 255)
    @ColumnDefault("0")
    @ApiModelProperty(value = "0-提交付款 1-调用第三方支付生成订单或得到支付流水号 2-第三方支付回调完成")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

    @Column(length = 255)
    @ColumnDefault("0")
    @ApiModelProperty(value = "支付状态 0-取消 1-待付款 2-付款中 3-付款成功 4-付款失败")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payStatus;

    @Column(length = 255)
    @ColumnDefault("0")
    @ApiModelProperty(value = "调用第三方支付唯一订单号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String outTradeNo;

    @Column(length = 3000)
    @ApiModelProperty(value = "支付参数信息")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String payParamInfo;

    @Column(length = 3000)
    @ApiModelProperty(value = "支付回调内容信息")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String payCallBackInfo;

    @Column(length = 3200)
    @ApiModelProperty(value = "批量支付，关联订单ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String linkOrderIds;

    @Column(updatable = false)
    @ApiModelProperty(value = "创建时间", hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;

    @ApiModelProperty(value = "修改时间", hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getPayOrderNumber() {
        return payOrderNumber;
    }

    public void setPayOrderNumber(String payOrderNumber) {
        this.payOrderNumber = payOrderNumber;
    }

    public Integer getPayAction() {
        return payAction;
    }

    public void setPayAction(Integer payAction) {
        this.payAction = payAction;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getPayParamInfo() {
        return payParamInfo;
    }

    public void setPayParamInfo(String payParamInfo) {
        this.payParamInfo = payParamInfo;
    }

    public String getPayCallBackInfo() {
        return payCallBackInfo;
    }

    public void setPayCallBackInfo(String payCallBackInfo) {
        this.payCallBackInfo = payCallBackInfo;
    }

    public String getLinkOrderIds() {
        return linkOrderIds;
    }

    public void setLinkOrderIds(String linkOrderIds) {
        this.linkOrderIds = linkOrderIds;
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
