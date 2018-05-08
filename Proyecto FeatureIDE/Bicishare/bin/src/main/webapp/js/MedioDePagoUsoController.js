'use strict';

module.controller('MedioDePagoUsoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/MedioDePagoUso', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarMedioDePago=function(){
            $http.get('./webresources/MedioDePago', {})
                .success(function (data, status, headers, config) {
                    $scope.listaMedioDePago = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de MedioDePago, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarMedioDePago();
            $scope.listarPago=function(){
            $http.get('./webresources/Pago', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPago = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de Pago, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPago();
        

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
        $http.post('./webresources/MedioDePagoUso', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/MedioDePagoUso/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de MedioDePagoUso, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
