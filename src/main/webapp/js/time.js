
function getMonth(i) {
    var month = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
    return month[i];
}

function startTime() {
    var today = new Date();
    var dd = today.getDate();
    var MMM = today.getMonth();
    var yyyy = today.getFullYear();
    var hh = today.getHours();
    var mm = today.getMinutes();
    var ss = today.getSeconds();
    hh = checkTime(hh);
    mm = checkTime(mm);
    ss = checkTime(ss);
    document.getElementById('txt').innerHTML =
            checkTime(dd) + " " +
            getMonth(MMM) + " " +
            yyyy + " : " +
            hh + ":" +
            mm + ":" +
            ss;
    var t = setTimeout(startTime, 500);
}
function checkTime(i) {
    // add zero in front of numbers < 10
    if (i < 10) {
        i = "0" + i;
    }
    ;
    return i;
}

