package com.mrxia.piaopiaoer.module.invoice.service.impl;

import com.mrxia.piaopiaoer.module.invoice.domain.Invoice;
import com.mrxia.piaopiaoer.module.invoice.repository.InvoiceRepository;
import com.mrxia.piaopiaoer.module.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 发票服务实现类
 *
 * @author xiazijian
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository repository;

    @Autowired
    public InvoiceServiceImpl(InvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Invoice> listAll() {
        return repository.findAll();
    }

    @Override
    public Invoice saveOrUpdate(Invoice invoice) {
        return repository.save(invoice);
    }
}
