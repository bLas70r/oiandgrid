/**
 * 
 */
dontShowFields = ['BillingInfos','addresses','orderItems','orderAttributes','billingInfo'];

var createInputPanel = function(object,objectType,action) {
	changeSearchType(objectType,action);
	if(!object){
		return;
	}
	var searchCriteria = document.getElementById("searchCriteria");
	while (searchCriteria.firstChild) {
		searchCriteria.removeChild(searchCriteria.firstChild);
	}
	for(var i in object){
		if(typeof i !== "function" && !(action == 'create' && dontShowFields.includes(i))){
			var textNode = document.createTextNode(i);
			var input = document.createElement("input");
			input.className = 'searchComponet';
			input.setAttribute('daoType', i);
			if(i == 'id') {
				input.disabled = true;
			} else if (action == 'create') {
				input.required = true;
			}
			searchCriteria.appendChild(textNode);
			searchCriteria.appendChild(input);
		}
			
	}
	
}

var searchForObject = function (){
	var action = document.getElementById("actionBtn").innerText;
	var inputs = action == 'create' ? document.getElementsByClassName('createComponet') : document.getElementsByClassName('searchComponet');
	var el = document.getElementById("searchSomething").textContent;
	var searchObject;
	if(el.indexOf('Order') != -1) {
		searchObject = Object.create(Order);
	} else if (el.indexOf('Customer') != -1){
		searchObject = Object.create(Customer);
	} else if (el.indexOf('User') != -1){
		searchObject = Object.create(User);
	}
	for(var i in searchObject) {
		for(var t = 0; t< inputs.length;t++){
			if(inputs[t].getAttribute('daoType') == i){
				searchObject[i] = inputs[t].value;
			}
		}
	}
	sendObjectApi('POST',el.replace(" ",""),true,JSON.stringify(searchObject));
	
	createInputPanel(searchObject,el,action);
	
}
var sendObjectApi = function(method,URL,async,JSON){
	var xhttp = new XMLHttpRequest();
	xhttp.open(method, URL, async ? true : !!async);
	xhttp.setRequestHeader("Content-type", "application/json; charset=utf-8");
	xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      alert('Success');
	    } else {
	    	alert('Something went wrong! Try again!');
	    }
	  };
	xhttp.send(JSON)
}
var loginPageClearBntAction = function(){
		var xhttp = new XMLHttpRequest();
    	xhttp.open("GET", "logout", true);
    	xhttp.send();
    	window.location.href = 'login';
    }
    var loadingFunction = function(){
        innitLeftMenu();
    }
    var innitLeftMenu = function(){
        var coll = document.getElementsByClassName("collapsible");
        var i;

        for (i = 0; i < coll.length; i++) {            
            var content = coll[i].nextElementSibling;            
              content.style.display = "none";
        }
        innitLeftMenuActions();
    };
    var innitLeftMenuActions = function(){
        var coll = document.getElementsByClassName("collapsible");
        var i;

        for (i = 0; i < coll.length; i++) {
          coll[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var content = this.nextElementSibling;
            if (content.style.display === "block") {
              content.style.display = "none";
            } else {
              content.style.display = "block";
            }
          });
        }
    }
    var changeSearchType = function(objectId,action) {
        if(!objectId){
            return true;
        }
        if(document.getElementById("searchPanel") && document.getElementById("searchPanel").style.display != "block"){
            document.getElementById("searchPanel").style.display = 'block';
        }
        var el = document.getElementById("searchSomething");        
        el.textContent = action + " " + objectId;
        var elbtn = document.getElementById("actionBtn");
        elbtn.innerText = action;
    }