package com.mrxia.piaopiaoer.module.invoice.service;

import com.mrxia.piaopiaoer.module.invoice.domain.Invoice;

import java.util.List;

/**
 * 发票操作服务类
 * @author xiazijian
 */
public interface InvoiceService {

    /**
     * 列出所有发票
     * @return 所有发票的集合
     */
    List<Invoice> listAll();

    /**
     * 保存或更新发票实体
     * @param invoice 发票实体
     * @return 保存或更新后的发票实体
     */
    Invoice saveOrUpdate(Invoice invoice);
}
