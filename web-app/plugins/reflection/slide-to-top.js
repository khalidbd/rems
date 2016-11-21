/**
 * Created by hoshen.mahmud on 11-Jul-16.
 */

$(function () {
    //alert("slideToTop");

    var slideToTop = $("<div />");

    slideToTop.html('<i class="fa fa-chevron-up"></i>');

    slideToTop.css({
        position: 'fixed',
        bottom: '20px',
        right: '25px',
        width: '40px',
        height: '40px',
        color: '#eee',
        'font-size': '',
        'line-height': '40px',
        'text-align': 'center',
        'background-color': '#222d32',
        cursor: 'pointer',
        'border-radius': '5px',
        'z-index': '99999',
        opacity: '.7',
        'display': 'none'
    });

    $('.wrapper').append(slideToTop);

    $(window).scroll(function () {
        if ($(window).scrollTop() >= 150) {
            if (!$(slideToTop).is(':visible')) {
                $(slideToTop).fadeIn(500);
            }
        } else {
            $(slideToTop).fadeOut(500);
        }
    });

    slideToTop.on('mouseenter', function () {
        $(this).css('opacity', '1');
        //alert("slideToTop");
    });

    slideToTop.on('mouseout', function () {
        $(this).css('opacity', '.7');
        //alert("slideToTop");
    });

    $(slideToTop).click(function () {
        //alert("working...123")
        //jQuery Tag : >>> animate: function( prop, speed, easing, callback ){}
        //$("body").animate({scrollTop: 0}, 500);   //todo-check : bug.

        $(window).scrollTop(0);                     //temporary.
    });

    $(".sidebar-menu li:not(.treeview) a").click(function () {
        /*
        var $this = $(this);
        var target = $this.attr("href");
        if (typeof target === 'string') {
            $("body").animate({
                scrollTop: ($(target).offset().top) + "px"
            }, 500);
        }
        */

        $(window).scrollTop(0);                     //temporary.
    });

});
