package com.mrxia.piaopiaoer.module.invoice.web.controller;

import com.mrxia.piaopiaoer.module.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

}
