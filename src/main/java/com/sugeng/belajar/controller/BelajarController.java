/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sugeng.belajar.controller;

import com.sugeng.belajar.service.BelajarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author admin
 */
@Controller
public class BelajarController {
    @Autowired
    BelajarService service;
    
    @RequestMapping("/kota")
    @ResponseBody
    public Object tampilkanKota(){
        return service.getAllKota();
    }
    @RequestMapping("/kota/{kode}")
    @ResponseBody
    public Object tampilkanKota(@PathVariable String kode){
        return service.getKotaByKode(kode);
    }
    
    
    @RequestMapping("/pasien/list")
    @ResponseBody
    public Object tampilkanPasien(){
        return service.getAllPasien();
    }
}

