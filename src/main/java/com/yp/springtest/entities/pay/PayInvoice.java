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
import java.util.List;

/**
 * 发票管理表
 *
 * @author yupeng
 */
@Entity
@Table(name = "t_pay_invoice")
@ApiModel(value = "发票管理表")
public class PayInvoice implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 10)
    @ApiModelProperty(value = "开票类型 1-企业 2-个人")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer invoiceType;

    @Column(length = 255)
    @ApiModelProperty(value = "业务系统标识")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String systemKey;

    @Column(length = 255)
    @ApiModelProperty(value = "公司名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyName;

    @Column(length = 255)
    @ApiModelProperty(value = "公司地址")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyAddress;

    @Column(length = 255)
    @ApiModelProperty(value = "公司电话")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String companyTel;

    @Column(length = 255)
    @ApiModelProperty(value = "开户银行")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String openBank;

    @Column(length = 255)
    @ApiModelProperty(value = "开户账号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String openCardNo;

    @Column(length = 255)
    @ApiModelProperty(value = "联系人")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contact;

    @Column(length = 255)
    @ApiModelProperty(value = "联系电话")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contactMobile;

    @Column(length = 255)
    @ApiModelProperty(value = "联系邮箱")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contactEmail;

    @Column(length = 255)
    @ApiModelProperty(value = "纳税证明")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String taxFile;

    @Column(length = 255)
    @ApiModelProperty(value = "税号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String taxNo;

    @Column(length = 11)
    @ApiModelProperty(value = "金额")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Double money;

    @Column(length = 255)
    @ApiModelProperty(value = "电子发票url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fileUrl;

    @Column(length = 255)
    @ApiModelProperty(value = "电子发票请求唯一流水号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fpqqlsh;

    @Column(length = 255)
    @ApiModelProperty(value = "电子发票请求订单号")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ddh;

    @Column(length = 10)
    @ColumnDefault("0")
    @ApiModelProperty(value = "申请人ID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer applyUserId;

    @Column(length = 10)
    @ColumnDefault("0")
    @ApiModelProperty(value = "开票状态 0-未开票 1-已开票 2-审核不通过")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer status;

    @Column(length = 1000)
    @ApiModelProperty(value = "审核原因")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String auditNote;

    @Transient
    @ApiModelProperty(value = "订单ID集合")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Integer> orderIds;

    @Transient
    @ApiModelProperty(value = "订单集合")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<PayOrder> payOrderList;

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

    public String getSystemKey() {
        return systemKey;
    }

    public void setSystemKey(String systemKey) {
        this.systemKey = systemKey;
    }

    public Double getMoney() {
        return money;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Integer> orderIds) {
        this.orderIds = orderIds;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getOpenCardNo() {
        return openCardNo;
    }

    public void setOpenCardNo(String openCardNo) {
        this.openCardNo = openCardNo;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTaxFile() {
        return taxFile;
    }

    public void setTaxFile(String taxFile) {
        this.taxFile = taxFile;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public String getAuditNote() {
        return auditNote;
    }

    public void setAuditNote(String auditNote) {
        this.auditNote = auditNote;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
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

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFpqqlsh() {
        return fpqqlsh;
    }

    public void setFpqqlsh(String fpqqlsh) {
        this.fpqqlsh = fpqqlsh;
    }

    public String getDdh() {
        return ddh;
    }

    public void setDdh(String ddh) {
        this.ddh = ddh;
    }

    public List<PayOrder> getPayOrderList() {
        return payOrderList;
    }

    public void setPayOrderList(List<PayOrder> payOrderList) {
        this.payOrderList = payOrderList;
    }
}
