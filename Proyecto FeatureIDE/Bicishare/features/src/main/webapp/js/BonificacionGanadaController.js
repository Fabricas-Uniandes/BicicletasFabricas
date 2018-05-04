'use strict';

module.controller('BonificacionGanadaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/BonificacionGanada', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarBonificacion=function(){
            $http.get('./webresources/Bonificacion', {})
                .success(function (data, status, headers, config) {
                    $scope.listaBonificacion = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de Bonificacion, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarBonificacion();
            $scope.listarBiciusuario=function(){
            $http.get('./webresources/Biciusuario', {})
                .success(function (data, status, headers, config) {
                    $scope.listaBiciusuario = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de biciusuario, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarBiciusuario();
        

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
        $http.post('./webresources/BonificacionGanada', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/BonificacionGanada/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de BonificacionGanada, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
