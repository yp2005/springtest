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
 * 发票管理在线电子票开票结果
 *
 * @Author: liyubai
 * @CreateDate: 2019/5/6 8:34 PM
 * @Version: v1.0
 */
@Entity
@Table(name = "t_pay_invoice_result")
@ApiModel(value = "发票管理在线电子票开票结果")
public class PayInvoiceResult implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty(value = "申请开票ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer payInvoiceId;

    @Column(length = 255)
    @ApiModelProperty(value = "操作码 0:下发成功 9999:下发失败")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String czdm;

    @Column(length = 255)
    @ApiModelProperty(value = "订单号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ddh;

    @Column(length = 255)
    @ApiModelProperty(value = "发票流水号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fpqqlsh;

    @Column(length = 255)
    @ApiModelProperty(value = "开票类型 1:正票 2:红票")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String kplx;

    @Column(length = 255)
    @ApiModelProperty(value = "开票日期")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String kprq;

    @Column(length = 255)
    @ApiModelProperty(value = "发票号码")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fphm;

    @Column(length = 255)
    @ApiModelProperty(value = "发票代码")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fpdm;

    @Column(length = 255)
    @ApiModelProperty(value = "检验码")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String jym;

    @Column(length = 255)
    @ApiModelProperty(value = "版式文件名称 流水号_发票代码_发票号码.pdf")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pdfFile;

    @Column(length = 255)
    @ApiModelProperty(value = "版式文件下载地址")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pdfUrl;

    @Column(length = 255)
    @ApiModelProperty(value = "结果代码 0:开票成功 00:开票成功，但未签章 5:单据不存在或未开票 7:单据已作废 3:或者其他，开票失败")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String returncode;

    @Column(length = 255)
    @ApiModelProperty(value = "错误原因")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String returnmessage;

    @Column(length = 3000)
    @ApiModelProperty(value = "请求参数信息")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String requestParamInfo;

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

    public Integer getPayInvoiceId() {
        return payInvoiceId;
    }

    public void setPayInvoiceId(Integer payInvoiceId) {
        this.payInvoiceId = payInvoiceId;
    }

    public String getCzdm() {
        return czdm;
    }

    public void setCzdm(String czdm) {
        this.czdm = czdm;
    }

    public String getDdh() {
        return ddh;
    }

    public void setDdh(String ddh) {
        this.ddh = ddh;
    }

    public String getFpqqlsh() {
        return fpqqlsh;
    }

    public void setFpqqlsh(String fpqqlsh) {
        this.fpqqlsh = fpqqlsh;
    }

    public String getKplx() {
        return kplx;
    }

    public void setKplx(String kplx) {
        this.kplx = kplx;
    }

    public String getKprq() {
        return kprq;
    }

    public void setKprq(String kprq) {
        this.kprq = kprq;
    }

    public String getFphm() {
        return fphm;
    }

    public void setFphm(String fphm) {
        this.fphm = fphm;
    }

    public String getFpdm() {
        return fpdm;
    }

    public void setFpdm(String fpdm) {
        this.fpdm = fpdm;
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public void setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getReturncode() {
        return returncode;
    }

    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    public String getReturnmessage() {
        return returnmessage;
    }

    public void setReturnmessage(String returnmessage) {
        this.returnmessage = returnmessage;
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

    public String getRequestParamInfo() {
        return requestParamInfo;
    }

    public void setRequestParamInfo(String requestParamInfo) {
        this.requestParamInfo = requestParamInfo;
    }
}
