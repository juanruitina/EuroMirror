<?php
/*
 * Converts CSV to JSONP by Ændrew Rininsland
 * Gratuitous fork of "Converts CSV to JSON" by Rob Flaherty
 * -- See: http://www.ravelrumba.com/blog/json-google-spreadsheets/
 * Example uses Google Spreadsheet CSV feed
 */

header('Content-type: script/javascript');

// Set your CSV feed
$feed = 'https://docs.google.com/spreadsheet/pub?key=0Ai5im0N8JkIDdDNpZ1l4VVFSb2tqaHFtNk9nZG41UkE&single=true&gid=6&output=csv';

// Arrays we'll use later
$keys = array();
$newArray = array();

// Function to convert CSV into associative array
function csvToArray($file, $delimiter) { 
  if (($handle = fopen($file, 'r')) !== FALSE) { 
    $i = 0; 
    while (($lineArray = fgetcsv($handle, 4000, $delimiter, '"')) !== FALSE) { 
      for ($j = 0; $j < count($lineArray); $j++) { 
        $arr[$i][$j] = $lineArray[$j]; 
      } 
      $i++; 
    } 
    fclose($handle); 
  } 
  return $arr; 
} 

// Do it
$data = csvToArray($feed, ',');

$n = 15; //This is the number of CSV lines you want in your array, including header row; change accordingly.
$data = array_slice($data, 0, $n);

// Set number of elements (minus 1 because we shift off the first row)
$count = count($data) - 1;
  
//Use first row for names  
$labels = array_shift($data);  

foreach ($labels as $label) {
  $keys[] = $label;
}

// Add Ids, just in case we want them later
$keys[] = 'id';

for ($i = 0; $i < $count; $i++) {
  $data[$i][] = $i;
}
  
// Bring it all together
for ($j = 0; $j < $count; $j++) {
  $d = @array_combine($keys, $data[$j]); //Æ -- add "@" in from of array combine to surpress warnings.
  $newArray[$j] = $d;
}

// Print it out as JSON
echo $_GET['callback']. '(' . json_encode($newArray) . ');'; //Æ -- return as a callback for JSONP.

?>