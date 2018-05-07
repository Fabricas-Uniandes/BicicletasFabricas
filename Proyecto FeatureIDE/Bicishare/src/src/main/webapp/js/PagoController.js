'use strict';

module.controller('PagoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Pago', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarMedioDePagoUso=function(){
            $http.get('./webresources/MedioDePagoUso', {})
                .success(function (data, status, headers, config) {
                    $scope.listaMedioDePagoUso = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de MedioDePagoUso, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarMedioDePagoUso();
            $scope.listarPrestamo=function(){
            $http.get('./webresources/Prestamo', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPrestamo = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de prestamo, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPrestamo();
        

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
}]);
