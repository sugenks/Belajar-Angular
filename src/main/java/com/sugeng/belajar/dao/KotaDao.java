/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sugeng.belajar.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */

@Repository
public class KotaDao {
    @Autowired
    DataSource dataSource;
    
    @Autowired
    ResultSetToMap rMap;
    
//    public Object getAllKota(){
//        try {
//            List<HashMap<String, Object>> hasil=new ArrayList<HashMap<String, Object>>();
//            
//            ResultSet rs=dataSource.getConnection().createStatement().executeQuery("select * from rm_kota order by 1");
//            ResultSetMetaData md=rs.getMetaData();
//            while(rs.next()){
//                HashMap<String, Object> a=new HashMap();
//                for (int i = 0; i < md.getColumnCount(); i++) {
//                    a.put(md.getColumnName(i+1), rs.getObject(i+1));
//                }
//                hasil.add(a);
//            }
//            rs.close();
//            return hasil;
//        } catch (SQLException ex) {
//            Logger.getLogger(KotaDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    } 
    
    public Object getAllKota(){
        String sql="select * from rm_kota order by 1";
        return rMap.castArray(sql);
    } 
    public Object getAllKotaByKode(String kode){
        String sql="select * from rm_kota where kode_kota='"+kode+"'";
        return rMap.castObject(sql);
    } 
    
    
}
