/**
 * Created by hoshen.mahmud on 17-Mar-16.
 */
//==================================================================================================================================
//  Select2
//----------------------------------------------------------------------------------------------------------------------------------
$(".select-with-search").select2();
$(".select-multiple").select2({
    multiple: true,
    placeholder: "Select One",
    allowClear: true
});
//==================================================================================================================================
//  iCheck
//----------------------------------------------------------------------------------------------------------------------------------
// $('.cb-square-blue').iCheck({
$('.cbxxxx').iCheck({
    checkboxClass: 'icheckbox_square-blue',
    radioClass: 'iradio_square-blue',
    increaseArea: '70%' // optional
});
//==================================================================================================================================
//  Date picker
//----------------------------------------------------------------------------------------------------------------------------------
var fd = "dd/mm/yyyy";
//dtp-date, dtp-time, dtp-range
$('.dtp-date').datepicker({
    //autoclose: false,
    //beforeShowDay: $.noop,
    //calendarWeeks: false,
    //clearBtn: false,
    //daysOfWeekDisabled: [],
    //endDate: Infinity,
    //forceParse: true,
    //format: 'mm/dd/yyyy',
    //keyboardNavigation: true,
    //language: 'en',
    //minViewMode: 0,
    //multidate: false,
    //multidateSeparator: ',',
    //orientation: "auto",
    //rtl: false,
    //startDate: -Infinity,
    //startView: 0,
    //todayBtn: false,
    //todayHighlight: false,
    //weekStart: 0

    autoclose: true,
    format: fd,
    clearBtn: true,
    keyboardNavigation: true,
    todayHighlight: true,
    weekStart: 0
}).prop('placeholder', fd);
//==================================================================================================================================
//  Spinner Icon (Window.onLoad(), AJAX Request fire)
//----------------------------------------------------------------------------------------------------------------------------------
//    $(window).load(function () {/*$(".spinner").fadeIn("slow");*/ $(".spinner").fadeOut("slow");});
//    $(window).load(function () { Pace.restart();});

//[ "ajaxStart", "ajaxStop", "ajaxComplete", "ajaxError", "ajaxSuccess", "ajaxSend" ]
$(document).ajaxStart(function () {
    Pace.restart();
}).ajaxStop(function () {
    Pace.stop();
});

//$(document)
//    .ajaxStart(function () {/*$(".spinner").fadeIn("slow");*/ $(".spinner").show();})
//    .ajaxStop(function () {$(".spinner").fadeOut("slow");});
//==================================================================================================================================
//  iCheck (Checkbox & Radio Button)
//----------------------------------------------------------------------------------------------------------------------------------
//    $('.cb, .rb').iCheck({
//        checkboxClass: 'icheckbox_square-green',
//        radioClass: 'iradio_square-green',
//    });
//==================================================================================================================================
jQuery(document).ready(function () {
    //$(".collapse-btn").click(function () {
    //    $(this).closest("legend").next(".collapse-block").slideToggle("slow", function () {
    //        $(this).find("i").toggleClass("fa fa-minus fa fa-plus");
    //    });
    //});

    //$("#btnExport").click(function (e) {
    //    window.open('data:application/vnd.ms-excel,' + $('#example').jsp());
    //Response.AddHeader("Content-Disposition", "attachment;filename=download.xlsx");
    //x-fast
    //e.preventDefault();
    //});
});

/*document.onscroll = function () {
 if ($(window).scrollTop() >= headerHeight + 75) {
 $('.navbar').removeClass('navbar-static-top').addClass('navbar-fixed-top');
 }
 else {
 $('.navbar').removeClass('navbar-fixed-top').addClass('navbar-static-top');
 }
 }
 document.onscroll = function () {
 var header = $('header.banner')
 if ($(window).scrollTop() > headerHeight + 75) {
 header.animate({
 // place your own css styles here
 opacity: 0.5,
 }, 5000, function () {
 header.removeClass('navbar-static-top').addClass('navbar-fixed-top');
 })
 }
 else {
 header.removeClass('navbar-fixed-top').addClass('navbar-static-top');
 }
 }*/
/*======================================================================================================================================================*/