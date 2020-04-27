
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
	
