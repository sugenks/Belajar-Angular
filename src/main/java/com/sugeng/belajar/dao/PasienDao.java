/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sugeng.belajar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public class PasienDao {
    @Autowired 
    DataSource dataSource;
    
    @Autowired 
    ResultSetToMap rTo;
    
    public Object getAllPasien(){
        return rTo.castArray("select * from rm_pasien limit 100");
    }
}
