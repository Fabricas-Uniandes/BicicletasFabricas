'use strict';

module.controller('PagoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.listaBancos = [];
    $scope.bike;
    $scope.valTotal;
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    
    /*
    $scope.listar=function(){
        $http.get('./webresources/Pago', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };
	*/
    
    $scope.listarBancos=function(){
        $http.get('./webresources/Pago/bancos', {})
            .success(function (data, status, headers, config) {
                $scope.listaBancos = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de MedioDePagoUso, por favor intente m\xe1s tarde');
        });    
    };
    
    $scope.getBike = function(data){
        $http.get('./webresources/Bicicleta/1', {})
            .success(function (data, status, headers, config) {
                $scope.bike = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de getBike, por favor intente m\xe1s tarde');
        });
    }
        

    //$scope.listar();
    $scope.listarBancos();
    $scope.getBike();
    $scope.rangeDays = _.range(1, 11);
    
    $scope.calcTotal = function(data){
        if($scope.valTotal != undefined && $scope.bike != undefined){
            $scope.valTotal = $scope.bike.precioAlquiler * data;
        }
        else
            $scope.valTotal = 0;
    }
    $scope.calcTotal();
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        $http.post('./webresources/Pago', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('\xbfDesea elminar este registro?')) {    
            $http.delete('./webresources/Pago/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Pago, por favor intente m\xe1s tarde');
            });   
        }
    };
    
    $scope.continuarPSE = function(){
        $window.location.href = 'https://www.pse.com.co/inicio';
    }
}]);
