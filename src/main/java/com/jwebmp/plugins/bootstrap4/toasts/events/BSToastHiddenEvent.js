JW_APP_NAME.directive('ngBsToastHiddenDirective', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngBsToastShowDirective);
        element.on('hidden.bs.toast', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
