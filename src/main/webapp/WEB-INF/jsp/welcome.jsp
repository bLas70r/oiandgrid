<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="js/bootstrap.css">
<script src="js/mainJS.js"></script>
<script>

${dummyCustomer}
${dummyOrder}
${dummyAddress}
${dummyOrderAttribute}
${dummyOrderOrderItem}
${dummyBillingInfo}
</script> 
<title>Oi and Grid</title>
</head>
<body onload="loadingFunction()">

<div class="top-bar">
	<span id="userNameLbl" class="top-bar-items">Welcome</span>
	<span id="userNameLbl" class="top-bar-items">${UserName},</span>	
	<span id="userRoleLbl" class="top-bar-items">logged as</span>
	<span id="userRoleLbl" class="top-bar-items">${UserRole}</span>
	<span id="logOutBnt" onclick="loginPageClearBntAction()" class="top-bar-items">Exit</span>
</div>
<div class="left-menu">
    <div class="left-menu-header">
    Menu
    </div>
    <div>
    <button class="collapsible">User</button>
        <div class="content;left-menu-item">        
            <ul>
                <li class="left-menu-item" onclick="createInputPanel(User,'User','create');">Create</li>
                <li class="left-menu-item" onclick="createInputPanel(User,'User','search');">Search</li>
            </ul>
         </div>
    </div>
    
    <div>
    <button class="collapsible">Customer</button>
        <div class="content;left-menu-item">        
            <ul>
                <li class="left-menu-item" onclick="createInputPanel(Customer,'Customer','create');">Create</li>
                <li class="left-menu-item" onclick="createInputPanel(Customer,'Customer','search');">Search</li>
            </ul>
         </div>
    </div>
    
    <div>
    <button class="collapsible">Order</button>    
        <div class="content;left-menu-item">        
            <ul>
                <li class="left-menu-item" onclick="createInputPanel(Order,'Order','create');">Create</li>
                <li class="left-menu-item" onclick="createInputPanel(Order,'Order','search');">Search</li>
            </ul>
         </div>
    </div>
    
</div>
<div class="center">
<h1>
"OI & Grind EAD"
</h1>
<div class="search-panel" id='searchPanel'>
<div class"search-panel-header">
<span id='searchSomething'></span> by criteria
</div>
<div class="search-panel-bar" id="searchCriteria">

</div>
<button onclick="searchForObject()" id="actionBtn">Search</<button>
<div class="resultset" >
Results
<div>
<ul id='resultSet-list'>
</ul>
</div>
</div>
	<div class="footer">
		<h5>
			OI and Grid Project <br>
			Technical Univercity - Sofia<br>
			Petar Botanakov
		</h5>
	</div>
</body>
</html>
