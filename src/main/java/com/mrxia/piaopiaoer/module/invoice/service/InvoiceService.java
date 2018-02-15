package com.mrxia.piaopiaoer.module.invoice.service;

import com.mrxia.piaopiaoer.module.invoice.domain.Invoice;

import java.util.List;

/**
 * @author xiazijian
 */
public interface InvoiceService {

    /**
     * @return
     */
    List<Invoice> listAll();

    /**
     * @param invoice
     * @return
     */
    Invoice saveOrUpdate(Invoice invoice);
}
