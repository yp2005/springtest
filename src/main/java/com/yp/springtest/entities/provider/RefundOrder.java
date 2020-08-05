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
 * 退款订单
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_provider_refund_order")
@ApiModel(value = "退款订单")
public class RefundOrder implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty(value = "用户订单ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer userOrderId;

    @Column(length = 10)
    @ApiModelProperty(value = "商铺ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer storeId;

    @Column(length = 10)
    @ApiModelProperty(value = "用户ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer person;

    @Column(length = 20)
    @ApiModelProperty(value = "退款金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double amount;

    @Column(length = 10)
    @ApiModelProperty(value = "订单状态，1-申请中 2-商家同意 3-商家拒绝 4-退款中 5-退款完成")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

    @Column(length = 3000)
    @ApiModelProperty(value = "申请说明")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String applyNote;

    @Column(length = 3000)
    @ApiModelProperty(value = "拒绝利用")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String refuseNote;

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

    public Integer getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(Integer userOrderId) {
        this.userOrderId = userOrderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getApplyNote() {
        return applyNote;
    }

    public void setApplyNote(String applyNote) {
        this.applyNote = applyNote;
    }

    public String getRefuseNote() {
        return refuseNote;
    }

    public void setRefuseNote(String refuseNote) {
        this.refuseNote = refuseNote;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getPerson() {
        return person;
    }

    public void setPerson(Integer person) {
        this.person = person;
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
