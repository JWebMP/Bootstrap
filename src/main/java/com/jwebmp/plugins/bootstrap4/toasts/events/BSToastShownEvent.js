JW_APP_NAME.directive('ngBsToastShownDirective', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngBsToastShowDirective);
        element.on('shown.bs.toast', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
