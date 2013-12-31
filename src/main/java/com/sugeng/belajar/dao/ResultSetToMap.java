/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sugeng.belajar.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
public class ResultSetToMap {

    @Autowired
    DataSource dataSource;

    public Object castArray(String sql) {
        List<HashMap<String, Object>> hasil = new ArrayList<HashMap<String, Object>>();
        try {
            
            ResultSet rs = dataSource.getConnection().createStatement().executeQuery(sql);
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next()) {
                HashMap<String, Object> a = new HashMap();
                for (int i = 0; i < md.getColumnCount(); i++) {
                    a.put(md.getColumnName(i + 1), rs.getObject(i + 1));
                }
                hasil.add(a);
            }
            rs.close();
        } catch (SQLException se) {

        }
        return hasil; 

    }
    public Object castObject(String sql) {
        HashMap<String, Object> hasil = new HashMap<String, Object>();
        try {
            
            ResultSet rs = dataSource.getConnection().createStatement().executeQuery(sql);
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next()) {
                for (int i = 0; i < md.getColumnCount(); i++) {
                    hasil.put(md.getColumnName(i + 1), rs.getObject(i + 1));
                }
            }
            rs.close();
        } catch (SQLException se) {

        }
        return hasil; 

    }
}
