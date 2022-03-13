JW_APP_NAME.directive('bsCarouselSlide', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.bsCarouselSlide);
        element.on('slide.bs.carousel', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});