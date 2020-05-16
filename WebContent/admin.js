function get_ID(clicked){

    var clickedId = document.getElementById('get_ID');

    if(clickedId == "btn1"){

        var myDiv = document.getElementById('main-cont1');
        var displaySetting = myDiv.style.display;

        if (displaySetting == 'block') {
            // div is visible. hide it
            myClock.style.display = 'none';
            
        }
        else {
            // clock is hidden. show it
            myClock.style.display = 'block';
            
        }
    }

}