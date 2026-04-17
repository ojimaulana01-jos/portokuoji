/* WOW.js - Animasi saat scroll */
(function() {
    new WOW().init();
})();

/* Logika Navigasi Halaman */
$(document).ready(function() {
    var pageNum;
    if (window.location.hash.substring(0, 7) === '#/page/') {
        pageNum = parseInt(window.location.hash.replace('#/page/', ''), 10);
        // Fungsi untuk memperbarui status halaman
    }
});

/* Validasi Atribusi (Footer) */
$(document).ready(function(){
    if($('#keepit').attr('href') != "https://blogger-templatees.blogspot.com/"){
        window.location.href = "https://blogger-templatees.blogspot.com/";
    }
});
