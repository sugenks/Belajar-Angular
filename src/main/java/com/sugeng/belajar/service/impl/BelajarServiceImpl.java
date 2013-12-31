/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sugeng.belajar.service.impl;

import com.sugeng.belajar.dao.KotaDao;
import com.sugeng.belajar.dao.PasienDao;
import com.sugeng.belajar.service.BelajarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class BelajarServiceImpl implements BelajarService{
    @Autowired
    KotaDao kotaDao;
    
    @Autowired
    PasienDao pasienDao;

    public Object getAllKota() {
        return kotaDao.getAllKota();
    }

    public Object getAllPasien() {
        return pasienDao.getAllPasien();
    }

    @Override
    public Object getKotaByKode(String k) {
        return kotaDao.getAllKotaByKode(k);
    }
    
    
}
