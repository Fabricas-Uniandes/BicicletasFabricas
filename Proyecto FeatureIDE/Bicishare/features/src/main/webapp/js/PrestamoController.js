'use strict';

module.controller('PrestamoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Prestamo', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarAccesorios=function(){
            $http.get('./webresources/Accesorio', {})
                .success(function (data, status, headers, config) {
                    $scope.listaAccesorios = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de accesorios, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarAccesorios();
        
        /*if[Pago]*/
        
            $scope.listarPago=function(){
            $http.get('./webresources/Pago', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPago = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de pago, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPago();
        
        /*end[Pago]*/
        
        $scope.listarBicicleta=function(){
            $http.get('./webresources/Bicicleta', {})
                .success(function (data, status, headers, config) {
                    $scope.listaBicicleta = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de bicicleta, por favor intente m\xe1s tarde');
            });    
        };
        
        $scope.listarBicicleta();
        
        $scope.listarMulta=function(){
            $http.get('./webresources/Multa', {})
                .success(function (data, status, headers, config) {
                    $scope.listaMulta = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de multa, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarMulta();
        

    $scope.listar();
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
        $http.post('./webresources/Prestamo', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/Prestamo/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Prestamo, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
