package com.mrxia.piaopiaoer.module.invoice.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 * 发票记录实体
 * @author xiazijian
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Invoice extends AbstractPersistable<Long> {

    /**
     * 客户公司
     */
    private String customerCompany;

    /**
     * 开票金额
     */
    private BigDecimal invoiceAmount;

    /**
     * 具体要求
     */
    private String requirementDetail;

    /**
     * 备注
     */
    private String comments;

    /**
     * 开票状态
     */
    private Integer status;

    /**
     * 是否寄送合同原件
     */
    private Boolean sendContract;

    /**
     * 是否有打款截图
     */
    private Boolean printScreen;

    /**
     * 票口来源
     */
    private String invoiceSource;

    /**
     * 提货来源
     */
    private String goodsSource;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
