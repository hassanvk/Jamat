<!DOCTYPE html>
<html>
<body>

<?php

$url = 'http://jamatstatus.us-east-1.elasticbeanstalk.com/show'.'/'.$_POST["show"];
$data = array('key1' => 'value1', 'key2' => 'value2');

// use key 'http' even if you send the request to https://...
$opts = array(
'http' => array(
'header'  => "Content-type: application/x-www-form-urlencoded",
'method'  => 'GET',
'content' => http_build_query($data)
)
);
$context  = stream_context_create($opts);
$result = file_get_contents($url, false, $context);
if ($result === FALSE) { /* Handle error */ }
var_dump($url);
var_dump($result);
?>
<p id="demo"></p>
<script>
var txt = '{"A104":{"id":"A104","password":"password","name":"Ahmad Khan4","phoneNumber":"7737737733","currentCity":"Chicago","currentState":"IL","currentCountry":"USA","modeOfTransport":"Driving"},"A105":{"id":"A105","password":"password","name":"Ahmad Khan5","phoneNumber":"7737737733","currentCity":"Chicago","currentState":"IL","currentCountry":"USA","modeOfTransport":"Driving"},"A102":{"id":"A102","password":"password","name":"Ahmad Khan2","phoneNumber":"7737737733","currentCity":"Chicago","currentState":"IL","currentCountry":"USA","modeOfTransport":"Driving"},"A103":{"id":"A103","password":"password","name":"Ahmad Khan3","phoneNumber":"7737737733","currentCity":"Chicago","currentState":"IL","currentCountry":"USA","modeOfTransport":"Driving"},"A101":{"id":"A101","password":"password","name":"Ahmad Khan1","phoneNumber":"7737737733","currentCity":"Chicago","currentState":"IL","currentCountry":"USA","modeOfTransport":"Driving"}}'
var obj = JSON.parse(txt);
var text = "";
Object.keys(obj).forEach(function(key) {
	text = text + "<br>" + obj[key].id + ", " +
obj[key].password + ", " +
obj[key].name + ", " +
obj[key].phoneNumber + ", " +
obj[key].currentCity + ", " +
obj[key].currentState + ", " +
obj[key].currentCountry + ", " +
obj[key].modeOfTransport;


});
document.getElementById("demo").innerHTML =text;

</script>

</body>
</html>