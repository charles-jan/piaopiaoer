package com.mrxia.piaopiaoer.module.invoice.web.controller;

import com.mrxia.piaopiaoer.common.bean.BeanMapperFactory;
import com.mrxia.piaopiaoer.common.validation.Group.Create;
import com.mrxia.piaopiaoer.module.invoice.domain.Invoice;
import com.mrxia.piaopiaoer.module.invoice.service.InvoiceService;
import com.mrxia.piaopiaoer.module.invoice.web.request.InvoiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 发票rest接口
 *
 * @author xiazijian
 */
@RestController
@RequestMapping("/invoice")
public class InvoiceRestController {

    private InvoiceService invoiceService;

    @Autowired
    public InvoiceRestController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    /**
     * 保持或更新发票信息
     *
     * @param saveRequest
     * @return
     */
    @PostMapping("")
    public String saveOrUpdate(@Validated(Create.class) InvoiceRequest saveRequest) {

        Invoice invoice = BeanMapperFactory.getMapper().map(saveRequest, Invoice.class);
        invoiceService.saveOrUpdate(invoice);

        return "redirect:/invoice/list";
    }
}
