
var events=[
	{'Date': new Date(2020, 2, 15), 'Title': 'Naver', },
];

var element = document.getElementById('calendar');

var settings = {
		NavShow: false,
		DateTimeShow: true,
		Color: '#337AFF',
		LinkColor: '#099500',

};

	calendar(element, events, settings);
	
	function getServerTime(){
		var xmlHttp;
		if (window.XMLHttpRequest){
			xmlHttp = new XMLHttpRequest();
			xmlHttp.open('HEAD',window.location.href.toString(),false);
			xmlHttp.setRequestHeader("Content-Type","text/html");
			xmlHttp.send('');
		}else if(window.AciveXObject){
			xmlHttp = new ActiveXObject('Msxml2.XMLHTTP');
			xmlHttp.open('HEAD', window.location.href.toString(),false);
			xmlHttp.setRequestHeader("Content-Type","text/html");
			xmlHttp.send('');
		}		
		var st = xmlHttp.getResponseHeader("Date");
		var servDate = new Date(st);
		formattedDate = moment(servDate);
		return formattedDate;
	}

	var serverTime = getServerTime();