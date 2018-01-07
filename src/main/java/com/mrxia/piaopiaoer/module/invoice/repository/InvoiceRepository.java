package com.mrxia.piaopiaoer.module.invoice.repository;

import com.mrxia.piaopiaoer.module.invoice.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiazijian
 */
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
