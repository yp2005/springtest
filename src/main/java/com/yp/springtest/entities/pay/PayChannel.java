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
 * 支付渠道
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_pay_channel")
@ApiModel(value = "支付渠道")
public class PayChannel implements Serializable {
    @Id
    @Column(length = 10, nullable = false)
    @ApiModelProperty(value = "主键ID", hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 255)
    @ApiModelProperty(value = "渠道名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String channelName;

    @Column(length = 255)
    @ApiModelProperty(value = "渠道英文标识 WXPAY、ALIPAY、BANKPAY...")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String channelKey;

    @Column(length = 10)
    @ApiModelProperty(value = "支付渠道 1-微信 2-支付宝 3-合作银行 4...")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer type;

    @Column(length = 10)
    @ApiModelProperty(value = "是否启用 0-否 1-是")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isEffective;

    @Column(length = 500)
    @ApiModelProperty(value = "发起支付url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String payUrl;

    @Column(length = 500)
    @ApiModelProperty(value = "发起退款url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String refundUrl;

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

    public void setId(Integer id) {
        this.id = id;
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

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelKey() {
        return channelKey;
    }

    public void setChannelKey(String channelKey) {
        this.channelKey = channelKey;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getRefundUrl() {
        return refundUrl;
    }

    public void setRefundUrl(String refundUrl) {
        this.refundUrl = refundUrl;
    }
}
