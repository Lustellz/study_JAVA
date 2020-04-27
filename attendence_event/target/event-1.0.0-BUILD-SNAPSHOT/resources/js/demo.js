
var events = [
  {'Date': new Date(2020, 2, 7), 'Title': 'Doctor appointment at 3:25pm.'},
  {'Date': new Date(2020, 2, 18), 'Title': 'New Garfield movie comes out!', 'Link': 'https://garfield.com'},
  {'Date': new Date(2020, 2, 27), 'Title': '25 year anniversary', 'Link': function(){console.log('여가 어디냐!!!!!');}},
];
var settings = {};
var element = document.getElementById('calendar');
calendar(element, events, settings);
