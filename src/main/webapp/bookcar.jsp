<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Cars</title>
<style>
.form-group
{
width:350px;
float:center;
}
.container
{
font:white;
}
.pic
  {
   width:700px;
 
  margin-top:-450px;
  margin-left:100px;
  float:right;
 
  }
</style>
</head>
<body>
<!-- jspscriplet -->

<form action="UserBookCarServlet" method="get">

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">DAIL YOUR CAR</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="cartypes.html">Home</a></li>
      
    </ul>
     <ul class="nav navbar-nav navbar-right"></ul>
  </div>
 
</nav>
 <div class="container">
  <h2>BOOK YOUR CAR</h2>
  
  <div class="left">
  <div class="form-group">
      <label for="ename">Car-ID:</label>
      <input type="text" class="form-control" placeholder="Enter Car ID" name="car_id" value=<%=Integer.parseInt(request.getParameter("car_id")) %> required/>
      
    </div>
    <div class="form-group">
      <label for="ename">Date:</label>
      <input type="date" class="form-control" placeholder="Enter Date" name="date" required/>
    </div>
    <div class="form-group">
      <label for="ename">CID:</label>
      <input type="text" class="form-control" placeholder="Enter CID" name="cid" required/>
    </div>
    <div class="form-group">
      <label for="ename">PICK UP POINT:</label>
      <input type="text" class="form-control" placeholder="Enter Pick Up Point" name="pickuppoint" required/>
    </div>
    <div class="form-group">
      <label for="eadd">KM:</label>
      <input type="text" class="form-control" placeholder="Enter your Distance in KM" name="km" required/>
    </div>
    <div class="form-group">
      <label for="emobile">PAYMENT TYPE :</label>
    <select name="paymenttype">
    <option>select</option>
    <option>cash</option>
    <option>online</option>
    </select>
    <!-- <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button"  data-toggle="dropdown">
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">CASH PAYMENT</a></li>
      <li><a href="#">CARD PAYMENT</a></li>
      <li><a href="#">WALLET PAYMENT</a></li>
    </ul>
  </div> -->
</div>
    
 
    <button type="submit" class="btn btn-default">ADD</button>
     
    <div class="pic">
<img src="./images/g (1).gif">
</div>

</div>
</form>
</body>
<script>
var id=
</script>
</html>