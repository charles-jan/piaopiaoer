package com.mrxia.piaopiaoer.module.invoice.service;

import com.mrxia.piaopiaoer.module.invoice.domain.Invoice;

import java.util.List;

public interface InvoiceService {

    List<Invoice> listAll();

    Invoice saveOrUpdate(Invoice invoice);
}
