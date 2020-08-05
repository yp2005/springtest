package com.yp.springtest.entities.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 服务模板
 *
 * @author: yupeng
 */
@Entity
@Table(name = "t_provider_service_template")
@ApiModel(value = "服务模板")
public class ServiceTemplate implements Serializable {
    @Id
    @Column(length = 10,nullable = false)
    @ApiModelProperty(value = "主键ID",hidden = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @ApiModelProperty(value = "服务详情（富文本编辑器生成）")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String detail;

    @Column(length = 255)
    @ApiModelProperty(value = "0-草稿 1-未发布 2-已发布")
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
