<!DOCTYPE html>
<html>
<body>

Welcome <?php echo $_POST["id"]; ?><br>
Your password is: <?php echo $_POST["password"]; ?>
<?php

$url = 'http://jamatstatus.us-east-1.elasticbeanstalk.com/'.$_POST["id"].'/'.$_POST["password"];
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
</body>
</html>