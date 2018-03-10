JW_APP_NAME.directive('ngHideBootstrapModal', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngShowBootstapModal);
        element.on('hide.bs.modal', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
