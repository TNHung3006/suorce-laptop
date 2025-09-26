$(document).ready(function() {
    $('.navbar-toggler').click(function() {
        var target = $(this).data('bs-target');
        $('.collapse').not(target).removeClass('show');
    });
});