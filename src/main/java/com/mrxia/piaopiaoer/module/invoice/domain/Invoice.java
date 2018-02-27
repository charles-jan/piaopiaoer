package com.mrxia.piaopiaoer.module.invoice.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;

import com.mrxia.piaopiaoer.common.domain.AbstractAuditable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 发票记录实体
 * @author xiazijian
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Invoice extends AbstractAuditable<Long> {

    /**
     * 开票日期
     */
    private LocalDate invoiceDate;

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
}
