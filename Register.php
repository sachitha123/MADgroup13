<?php
    $con = mysqli_connect("localhost", "id1770781_androiddb", "android123", "id1770781_android");
    
    $fname = $_POST["fname"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $email = $_POST["email"];
    
    $statement = mysqli_prepare($con, "INSERT INTO user (fname, username, password, email) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $fname, $username, $password, $email);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>