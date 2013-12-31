/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module('belajar.controller', ['belajar.service'])
    .controller('KotaController', ['$http', '$scope', 'KotaService', function($http, $scope, KotaService) {
        $scope.listKota = KotaService.query();
        
        $scope.edit = function(x){
            console.log(x.kode_kota);
            $scope.currentKota = KotaService.get({kode: x.kode_kota}, function(data) {
                $scope.oriKota = angular.copy(data);
                console.log($scope.oriKota);
            });
        }
        $scope.hapus = function(data){
            console.log(data);
        }
    }])
