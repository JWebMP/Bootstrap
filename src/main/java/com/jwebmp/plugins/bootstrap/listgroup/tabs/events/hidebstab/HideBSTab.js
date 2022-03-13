JW_APP_NAME.directive('hideBsTab', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.hideBsTab);
        element.on('hide.bs.tab', function (event) {
           // alert('hide bs tab');
           // alert('hide bs tab - ' + event);
            scope.$apply(function () {
             //   event.preventDefault();
               // alert('performing hide - ' + fn);
                fn(scope, {$event:event});
               // alert('dones hide - ' + fn);
            });
        });
    };
});
