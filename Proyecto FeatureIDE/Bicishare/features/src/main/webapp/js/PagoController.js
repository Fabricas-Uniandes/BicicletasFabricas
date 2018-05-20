'use strict';

module.controller('PagoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = [];
    $scope.listaBancos = [];
    $scope.bike;
    $scope.itemsCarrito = [];
    $scope.valTotal;
    $scope.pagoCredito = {};
    $scope.panelEditar = false;
    $scope.typePayment;
    $scope.datosPago = {};
    
  
    $scope.listarBancos=function(){
        $http.get('./webresources/Pago/bancos', {})
            .success(function (data, status, headers, config) {
                $scope.listaBancos = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de Bancos, por favor intente m\xe1s tarde');
        });    
    };
    
    $scope.getCarrito = function(data){
        let carrito = [];
        JSON.parse(localStorage.getItem('carrito')).forEach(function(element){
            element.valTotal = 0;
            carrito.push(element);
        });
        
    	$scope.itemsCarrito = carrito;
    	if(localStorage.getItem('creditPayment') != null){
    		$scope.pagoCredito = JSON.parse(localStorage.getItem('creditPayment'));
    	}
    }
        

    //$scope.listar();
    $scope.listarBancos();
    $scope.getCarrito();
    $scope.rangeDays = _.range(1, 11);
    
    $scope.calcTotal = function(data, item){
    	if($scope.valTotal != undefined && $scope.itemsCarrito != undefined){
            item.valTotal = item.precio * data * item.cantidad;
            $scope.valTotal = 0;
            $scope.itemsCarrito.forEach(function(element){
                $scope.valTotal += element.valTotal;
            });
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
    
    $scope.continuarPago = function(){
    	$scope.datosPago.valor = $scope.valTotal;
    	$scope.datosPago.medioPago = $scope.typePayment;
    	$http.post('./webresources/Pago', JSON.stringify($scope.datosPago), {}
        ).success(function (data, status, headers, config) {
            alert("Los datos han sido guardados con Exito");
            $scope.panelEditar = false;
            $scope.listar();
        }).error(function (data, status, headers, config) {
            alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
        });
    	if($scope.typePayment == 'creditCard'){
    		localStorage.setItem('creditPayment', $scope.pagoCredito);
    	}
    	//localStorate.removeItem('carrito');
        //$scope.itemsCarrito = []
    	$window.location.href = 'https://www.pse.com.co/inicio';
    }
}]);
