package com.mrxia.piaopiaoer.module.invoice.web.request;

import com.mrxia.piaopiaoer.common.validation.Group.Create;
import com.mrxia.piaopiaoer.common.validation.Group.Delete;
import com.mrxia.piaopiaoer.common.validation.Group.Update;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

/**
 * @author xiazijian
 */
@Data
public class InvoiceRequest {

    @NotNull(groups = {Update.class, Delete.class}, message = "发票id不能为空")
    private Long id;

    /**
     * 客户公司
     */
    @NotBlank(groups = {Create.class, Update.class}, message = "客户名称不能为空")
    private String customerCompany;

    /**
     * 开票金额
     */
    @NotNull(groups = {Create.class, Update.class}, message = "开票金额不能为空")
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
