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
 * 结算订单
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_account_settle_order")
@ApiModel(value = "结算订单")
public class SettleOrder implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty(value = "1-商户账户结算 2-优惠券结算")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer type;

    @Column(length = 10)
    @ApiModelProperty(value = "账户ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer accountId;

    @Column(length = 10)
    @ApiModelProperty(value = "结算规则id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer ruleId;

    @Column(length = 10)
    @ApiModelProperty(value = "银行信息ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer accountBankInfoId;

    @ApiModelProperty(value = "结算时间")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    private Date settleTime;

    @ApiModelProperty(value = "到账时间")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Temporal(TemporalType.TIMESTAMP)
    private Date finishTime;

    @Column(length = 255)
    @ApiModelProperty(value = "结算金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double amount;

    @Column(length = 10)
    @ApiModelProperty(value = "结算发起人")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer operator;

    @Column(length = 255)
    @ApiModelProperty(value = "结算发起人名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String operatornName;

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

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getAccountBankInfoId() {
        return accountBankInfoId;
    }

    public void setAccountBankInfoId(Integer accountBankInfoId) {
        this.accountBankInfoId = accountBankInfoId;
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getOperatornName() {
        return operatornName;
    }

    public void setOperatornName(String operatornName) {
        this.operatornName = operatornName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
