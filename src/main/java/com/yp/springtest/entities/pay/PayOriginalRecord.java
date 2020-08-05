package com.yp.springtest.entities.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * 支付回调原始记录
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_pay_original_record")
@ApiModel(value = "支付回调原始记录")
public class PayOriginalRecord implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty(value = "支付渠道 1-微信 2-支付宝 3-合作银行")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payChannel;

    @Column(length = 10)
    @ApiModelProperty(value = "支付记录ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payRecordId;

    @Column(length = 255)
    @ApiModelProperty(value = "验证结果")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String verify;

    @Column(length = 255)
    @ApiModelProperty(value = "状态码")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String resultCode;

    @Column(length=3000)
    @ApiModelProperty(value = "平台交易回调参数信息")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String resultInfo;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getVerify() {
        return verify;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getPayRecordId() {
        return payRecordId;
    }

    public void setPayRecordId(Integer payRecordId) {
        this.payRecordId = payRecordId;
    }
}
