'use strict';

module.controller('BiciusuarioCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Biciusuario', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarPrestamos=function(){
            $http.get('./webresources/Prestamo', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPrestamos = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de prestamos, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPrestamos();
            $scope.listarTarjetaCredito=function(){
            $http.get('./webresources/TarjetaCredito', {})
                .success(function (data, status, headers, config) {
                    $scope.listaTarjetaCredito = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de tarjetaCredito, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarTarjetaCredito();
            $scope.listarLogro=function(){
            $http.get('./webresources/Logro', {})
                .success(function (data, status, headers, config) {
                    $scope.listaLogro = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de logro, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarLogro();
            $scope.listarBonificacion=function(){
            $http.get('./webresources/BonificacionGanada', {})
                .success(function (data, status, headers, config) {
                    $scope.listaBonificacion = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de bonificacion, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarBonificacion();
        

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
        $http.post('./webresources/Biciusuario', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/Biciusuario/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Biciusuario, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
