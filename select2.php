<?php
//if ($_SERVER['REQUEST_METHOD'] == 'POST')
// {
 require_once('db_conn.php');
$Name=$_REQUEST["Name"];
$Class=$_REQUEST["Class"];
$Phone_No=$_REQUEST["Phone_No"];

 $query ="select * from record where (Name like '%$Name%') and (Class '%$Class%') and (Phone_No like '%$Phone_No%')";
 $res = mysqli_query($conn, $query);
 $result = array();
  

 while ($row = mysqli_fetch_array($res,MYSQL_ASSOC))
 {
 array_push($result, array("id"=>$row['id'],"Name"=>$row['Name'],"Ride_to"=>$row['Name'],"Class"=>$row['Class'],"Phone_No"=>$row['Phone_No']));
 }

 //array_push($result,array("name"=>$res['name'],"image"=>$res['image']));
if($result!=null){
echo json_encode(array("result"=>$result));
 }
 else
 {
 echo json_encode(array("result not found"));
 }
 
//}
?>