JW_APP_NAME.directive('bsCarouselSlid', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.bsCarouselSlid);
        element.on('slid.bs.carousel', function (event) {
            scope.$apply(function () {
                event.preventDefault();
              //  alert('from : ' + event.from);
               // alert('to : ' + event.to);
                fn(scope, {$event: event});
            });
        });
    };
});
