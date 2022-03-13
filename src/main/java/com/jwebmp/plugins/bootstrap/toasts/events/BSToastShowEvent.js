JW_APP_NAME.directive('ngBsToastShowDirective', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngBsToastShowDirective);
        element.on('show.bs.toast', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
