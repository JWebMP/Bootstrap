JW_APP_NAME.directive('ngShownBootstrapModal', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngShowBootstapModal);
        element.on('shown.bs.modal', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
