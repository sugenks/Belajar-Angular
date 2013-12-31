/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module('belajar.service', ['ngResource'])
    .factory('KotaService', ['$resource', '$http', function($resource, $http){
//    return $resource('kota/:kode', {}, {
//      query: {method:'GET', params:{kode:''}, isArray:true}
//    });
    var service = {
            kota: $resource('kota/:kode', {}, {
                queryPage: {method:'GET', isArray: true}
            }),
            get: function(param, callback){ 
                console.log(param);
                return this.kota.get(param, callback) 
            },
            query: function(callback){ return this.kota.queryPage(callback) },
            save: function(obj){
                if(obj.id == null){
                    return $http.post('menu', obj);
                } else {
                    return $http.put('menu/'+obj.id, obj);
                }
            },
            remove: function(obj){
                if(obj.id != null){
                    return $http.delete('menu/'+obj.id);
                }
            }
        };
            
        return service;
}])