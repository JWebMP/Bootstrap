JW_APP_NAME.directive('ngHiddenBootstrapModal', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngShowBootstapModal);
        element.on('hidden.bs.modal', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
