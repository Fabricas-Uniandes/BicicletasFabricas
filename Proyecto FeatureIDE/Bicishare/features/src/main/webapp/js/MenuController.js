'use strict';

module.controller('MenuCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    $scope.logo = "https://cdn.pixabay.com/photo/2012/04/24/18/13/bicycle-40756_960_720.png";
    $scope.mainColor = "#FFF";
    $scope.sponsor = "BiciShare";
    $scope.textColor = "#000";
    $http.get('./assets/config.json', {})
            .success(function (data, status, headers, config) {
              $scope.logo = data.logo;
              $scope.mainColor = "#" + data.mainColor;
              $scope.sponsor = data.sponsor;
              $scope.textColor = "#" + data.textColor;
            }).error(function (data, status, headers, config) {
              alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
  }]);
