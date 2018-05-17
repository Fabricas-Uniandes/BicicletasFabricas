'use strict';

module.controller('AccesorioCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    // listar
    /*if[Accesorios]*/
    $scope.lista = [];
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar = function () {
      $http.get('./webresources/Accesorio', {})
              .success(function (data, status, headers, config) {
                $scope.lista = data;
              }).error(function (data, status, headers, config) {
        alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
      });
    };
    
    $scope.addToCart = function (accesorio) {
      var carrito = localStorage.getItem("carrito");
      carrito = carrito ? JSON.parse(carrito) : [];
      accesorio.cantidad = 0;
      var existe = carrito.filter(function(current, index, array) {
        return current.nombre === accesorio.nombre;
      })[0];
      if(existe) {
        existe.cantidad++;
      } else {
        accesorio.cantidad++;
        carrito.push(accesorio);
      }
      localStorage.setItem("carrito", JSON.stringify(carrito));
    };
    /*end[Accesorios]*/
  }]);
