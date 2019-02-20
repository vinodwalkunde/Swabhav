let moment=require('moment')
var wrapped = moment(new Date());
console.log(wrapped);

var date = wrapped.toDate(); 
console.log(date);
console.log(moment("12-25-1995", "MM-DD-YYYY").toDate()); 
var a = moment([2007, 0, 15]);
console.log(a.fromNow());