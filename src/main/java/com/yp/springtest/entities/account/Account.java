package com.yp.springtest.entities.account;

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
 * 账户
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_accout")
@ApiModel(value = "账户")
public class Account implements Serializable {
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

    @Column(length = 10)
    @ApiModelProperty(value = "账户类型 1-总账户 2-商户账户 3-普通用户账户")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer type;

    @Column(length = 10)
    @ApiModelProperty(value = "收款方式 1-合作银行虚拟账户收款 2-第三方支付渠道收款")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer collectType;

    @Column(length = 20)
    @ApiModelProperty(value = "总金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double amount;

    @Column(length = 20)
    @ApiModelProperty(value = "可用余额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double usableAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "待结算金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double notSettleAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "结算冻结金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double settlingAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "风险预留金")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double depositAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "冻结金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double frozenAmount;

    @Column(length = 20)
    @ApiModelProperty(value = "待结算优惠券金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double couponAmount;

    @Column(length = 10)
    @ApiModelProperty(value = "账户状态 0-未生效 1-生效中 3-冻结")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(Double usableAmount) {
        this.usableAmount = usableAmount;
    }

    public Double getNotSettleAmount() {
        return notSettleAmount;
    }

    public void setNotSettleAmount(Double notSettleAmount) {
        this.notSettleAmount = notSettleAmount;
    }

    public Double getSettlingAmount() {
        return settlingAmount;
    }

    public void setSettlingAmount(Double settlingAmount) {
        this.settlingAmount = settlingAmount;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Double getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(Double frozenAmount) {
        this.frozenAmount = frozenAmount;
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

    public Integer getCollectType() {
        return collectType;
    }

    public void setCollectType(Integer collectType) {
        this.collectType = collectType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }
}
