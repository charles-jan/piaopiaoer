package com.mrxia.piaopiaoer.module.invoice.web.controller;

import com.mrxia.piaopiaoer.common.bean.BeanMapperFactory;
import com.mrxia.piaopiaoer.common.validation.Group;
import com.mrxia.piaopiaoer.module.invoice.domain.Invoice;
import com.mrxia.piaopiaoer.module.invoice.service.InvoiceService;
import com.mrxia.piaopiaoer.module.invoice.web.request.InvoiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 发票相关控制类
 *
 * @author xiazijian
 */
@Controller
@RequestMapping("invoice")
public class InvoiceController {

    private InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    /**
     * 发票列表页面
     *
     * @param model
     * @return
     */
    @GetMapping("list")
    public String listPage(Model model) {

        model.addAttribute("invoices", invoiceService.listAll());
        return "invoice/list";
    }

    /**
     * 保持或更新发票信息
     *
     * @param saveRequest
     * @return
     */
    @PostMapping("")
    public String saveOrUpdate(@Validated(Group.Create.class) InvoiceRequest saveRequest) {

        Invoice invoice = BeanMapperFactory.getMapper().map(saveRequest, Invoice.class);
        invoiceService.saveOrUpdate(invoice);

        return "redirect:/invoice/list";
    }
}
