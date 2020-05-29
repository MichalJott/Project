package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product p1 = new Product("Wood Home");
        Invoice i1 = new Invoice("2020_05");
        Item item1 = new Item(1, p1, new BigDecimal("123"), new BigDecimal("123"));

        p1.getItems().add(item1);
        i1.getItems().add(item1);
        item1.setInvoice(i1);

        //When
        productDao.save(p1);
        invoiceDao.save(i1);
        itemDao.save(item1);

        //Then
        try {
            Assert.assertTrue(i1.getId() > 0);
        } finally {
            invoiceDao.deleteById(i1.getId());
        }

    }
}