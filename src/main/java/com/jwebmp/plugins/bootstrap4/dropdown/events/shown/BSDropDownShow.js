JW_APP_NAME.directive('bsDropDownShown', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngActivate);
        element.on('shown.bs.dropdown', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
