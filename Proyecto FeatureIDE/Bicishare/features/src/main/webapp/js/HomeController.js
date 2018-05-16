'use strict';

module.controller('HomeCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    $scope.currentPosition = 0;
    $scope.moveLeft = function(event) {
      if($scope.currentPosition > 0) {
        $scope.currentPosition--;
      }
    };
    
    $scope.moveRight = function(event) {
      if($scope.currentPosition < 2) {
        $scope.currentPosition++;
      }
    };
}]);
