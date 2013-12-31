/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sugeng.belajar;

import com.sugeng.belajar.service.BelajarService;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:com/sugeng/**/applicationContext.xml")
public class TestKota {
    @Autowired
    BelajarService service;
    
    @Test
    public void tampilkanKota(){
        Object hasil=service.getAllKota();
        System.out.println("Hasil:\n"+ (List<HashMap<String, Object>>)hasil);
    }
    @Test
    public void tampilkanPasien(){
        Object hasil=service.getAllPasien();
        System.out.println("\n");
        System.out.println("Pasien:\n"+ (List<HashMap<String, Object>>)hasil);
    }
}
