JW_APP_NAME.directive('bsCollapseShow', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngActivate);
        element.on('show.bs.collapse', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
