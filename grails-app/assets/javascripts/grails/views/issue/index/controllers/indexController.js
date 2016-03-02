//= wrapped

angular
    .module("grails.views.issue.index")
    .controller("IndexController", IndexController);

function IndexController(applicationDataFactory, contextPath, $http) {
    var vm = this;

    vm.contextPath = contextPath;

    applicationDataFactory.get().then(function(response) {
        vm.applicationData = response.data;
    });

    $http.get('/persons').then(function(response){
        vm.persons = response.data
    });

    $http.get('/addresses').then(function(response){
        vm.addresses = response.data
    });
}
