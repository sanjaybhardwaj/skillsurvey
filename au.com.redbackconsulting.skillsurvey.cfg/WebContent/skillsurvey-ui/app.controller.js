
sap.ui.controller("skillsurvey-ui.app", {

/**
* Called when a controller is instantiated and its View controls (if available) are already created.
* Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
* @memberOf skillsurvey-ui.app
*/
	onInit: function() {
		var view = this.getView();
		
		var data=	'{"Items":[{"viewName":"Individual"},{"viewName":"Supervisons"},{"viewName":"Department"},{"viewName":"RoleAssingment"},{"viewName":"Survey"},{"viewName":"Pathway"},{"viewName":"Role"},{"viewName":"Claim"},{"viewName":"ClaimAssingment"},{"viewName":"SurveyAnswer"},{"viewName":"Function"},{"viewName":"FunctionOccupations"},{"viewName":"Level"},{"viewName":"Occupation"},{"viewName":"Uoc"},{"viewName":"UocQuestion"},{"viewName":"Question"},{"viewName":"UocGroupMembers"},{"viewName":"UocGroup"},{"viewName":"Need"},{"viewName":"Dapssco"},{"viewName":"DapsscoLevel"},{"viewName":"DapsscoSkills"},{"viewName":"BreakSchedule"}]}';
		var oModel = new sap.ui.model.json.JSONModel();
		oModel.setJSON(data, false);
		sap.ui.getCore().setModel(oModel,"menuModel");

		this.app = view.app;
	
     	var bus = sap.ui.getCore().getEventBus();
		bus.subscribe("nav","to", this.navToHandler, this);
		bus.subscribe("nav","toEdit", this.navToEditHandler, this);
		bus.subscribe("nav","toNewSave", this.navToNewSave, this);
		bus.subscribe("nav","toOverview", this.navToOverviewHandler, this);
		bus.subscribe("nav","toSave", this.navToSaveHandler, this);
		bus.subscribe("nav","from", this.navToBackHandler, this);
		
		
		
	},
	navToNewSave:function (channelId, EventId, data){
		
		var myapp = this.app;
		this.serviceCallforNewSave(data.id,myapp);
	},
	navToSaveHandler:function (channelId, EventId, data){
		var myapp = this.app;
		this.serviceCallforEdit(data.id,myapp);
	},
	navToOverviewHandler:function (channelId, EventId, data){
		var myapp = this.app;
		if(data && data.id ){
		
		if(myapp.getDetailPage(data.id) === null){
			//jQuery.sap.log.info("Now Loading page'"+data.id+ "'", sDetails, sComponent)
			var newPage = sap.app.viewCache.get(data.id);
			myapp.addDetailPage(newPage);
		} 
		
	
		myapp.to(data.id, "slide");
		}

	},
	
	navToEditHandler : function (channelId, EventId, data){
		var myapp = this.app;
		if(data && data.id ){
		
		if(myapp.getDetailPage(data.id) === null){
			//jQuery.sap.log.info("Now Loading page'"+data.id+ "'", sDetails, sComponent)
			var newPage = sap.app.viewCache.get(data.id);
			myapp.addDetailPage(newPage);
		} 
		//navigate
		myapp.to(data.id, "slide");
		}

	},
	
	navToHandler : function (channelId, EventId, data){
		//alert("In NavToHandler");
	
		var myapp = this.app;
		if(data && data.id ){
		
//		if(myapp.getDetailPage(data.id) === null){
//			//jQuery.sap.log.info("Now Loading page'"+data.id+ "'", sDetails, sComponent)
//			var newPage = sap.app.viewCache.get(data.id);
//			myapp.addDetailPage(newPage);
//		} 
		
		///service call
		this.serviceCallforInit(data.id,myapp);
		//navigate
		//myapp.to(data.id, "sss");
		}
	},
	
	navToBackHandler : function (){
		alert("nav To Back");
	},
	
	serviceCallforInit : function(viewName,myapp){
		var serviceurl =sap.app.config.hostName+":"+sap.app.config.hostPort+"/"+sap.app.config.applicationContextPath+"/";
		var data=null;
		switch (viewName) {
		case 'Need':
		 var data={};
			serviceurl=serviceurl+"need/managed";
			break;
		case 'Role':
			serviceurl=serviceurl+"role/managed";
			break;
		default:
			break;
		}
		
	//	alert(serviceurl);
		var oModel =sap.ui.getCore().getModel("overviewModel");
		if(oModel==null){
		 oModel = new sap.ui.model.json.JSONModel();
		}
		
		//oModel.setData(data,false);
		//sap.ui.getCore().setModel(oModel,"overviewModel");
		
		if(sap.app.config.useLocalData == false)
        {
	    	$.ajax(
	    	{ 
				 type: 'GET', 
				 url: serviceurl,
				 crossDomain: false,
				 cache: false,
				// contentType: "application/json; charset=utf-8",
				 contentType: "application/json; charset=utf-8",
				 
				 beforeSend: function( xhr ){
					var bytes = Crypto.charenc.Binary.stringToBytes("bmays1"+ ":"+"sap");
					var base64 = Crypto.util.bytesToBase64(bytes);
						xhr.setRequestHeader("Authorization", "Basic "+base64);
						return;
					},			 
				 success: function(data) {
					 debugger;
					// alert(data);
					// alert(JSON.stringify(data));
						
						oModel.setData(data,false);
						oModel.setDefaultBindingMode("OneWay");
						sap.ui.getCore().setModel(oModel,"overviewModel");
						
						
						if(myapp.getDetailPage(viewName) === null){
							//jQuery.sap.log.info("Now Loading page'"+data.id+ "'", sDetails, sComponent)
							var newPage = sap.app.viewCache.get(viewName);
							myapp.addDetailPage(newPage);
						} 
						myapp.to(viewName, "slide");
					 
				 }, 
				 error : function (e, textStatus,errorThrown ){ alert ("error in ajax call"+":::" + e.message+ errorThrown+":::" +textStatus);}
			});
        
        }
        
		
		
		
	},
	serviceCallforEdit : function(viewName,myapp){
		var serviceurl =sap.app.config.hostName+":"+sap.app.config.hostPort+"/"+sap.app.config.applicationContextPath+"/";
		var data=null;
		var oModel =sap.ui.getCore().getModel("transientModel").oData;
		switch (viewName) {
		case 'Need':
		 var data={};
			serviceurl=serviceurl+"need/managed";
			break;
		case 'Role':

			serviceurl=serviceurl+"role/edit/"+oModel.id;
			break;
		default:
			break;
		}
		
		//alert(serviceurl);
		//var oModel = new sap.ui.model.json.JSONModel();
		//oModel.setData(data,false);
		//sap.ui.getCore().setModel(oModel,"overviewModel");
		
		if(sap.app.config.useLocalData == false)
        { 
	    	$.ajax(
	    	{ 
				 type: 'POST', 
				 url: serviceurl,
				 crossDomain: false,
				 cache: false,
				// contentType: "application/json; charset=utf-8",
				 contentType: "json",
				 data:oModel,
				 beforeSend: function( xhr ){
					var bytes = Crypto.charenc.Binary.stringToBytes("bmays1"+ ":"+"sap");
					var base64 = Crypto.util.bytesToBase64(bytes);
						xhr.setRequestHeader("Authorization", "Basic "+base64);
						return;
					},			 
				 success: function(data) {
					 debugger;
					
					// var page = oEvent.oSource.data("id");
						//alert("Page"+page);
						var bus = sap.ui.getCore().getEventBus();
						bus.publish("nav","to",{id : viewName,	});
				 }, 
				 error : function (e, textStatus,errorThrown ){ alert ("error in ajax call"+":::" + e.message+ errorThrown+":::" +textStatus);}
			});
        
        }
        
		
		
		
	},
	serviceCallforNewSave : function(viewName,myapp){
		var serviceurl =sap.app.config.hostName+":"+sap.app.config.hostPort+"/"+sap.app.config.applicationContextPath+"/";
		var data=null;
		var oModel =sap.ui.getCore().getModel("transientModel").oData;
		switch (viewName) {
		case 'Need':
		 var data={};
			serviceurl=serviceurl+"need/managed";
			break;
		case 'Role':

			serviceurl=serviceurl+"role/create/"+oModel.id;
			break;
		default:
			break;
		}
		
		//alert(serviceurl);
		//var oModel = new sap.ui.model.json.JSONModel();
		//oModel.setData(data,false);
		//sap.ui.getCore().setModel(oModel,"overviewModel");
		
		if(sap.app.config.useLocalData == false)
        {
	    	$.ajax(
	    	{ 
				 type: 'POST', 
				 url: serviceurl,
				 crossDomain: false,
				 cache: false,
				// contentType: "application/json; charset=utf-8",
				 contentType: "json",
				 data:oModel,
				 beforeSend: function( xhr ){
					var bytes = Crypto.charenc.Binary.stringToBytes("bmays1"+ ":"+"sap");
					var base64 = Crypto.util.bytesToBase64(bytes);
						xhr.setRequestHeader("Authorization", "Basic "+base64);
						return;
					},			 
				 success: function(data) {
					 debugger;
					// var page = oEvent.oSource.data("id");
					//	alert("Page"+page);
						var bus = sap.ui.getCore().getEventBus();
						bus.publish("nav","to",{id : viewName,	});
					 
				 }, 
				 error : function (e, textStatus,errorThrown ){ alert ("error in ajax call"+":::" + e.message+ errorThrown+":::" +textStatus);}
			});
        
        }
        
		
		
		
	}
	
	

/**
* Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
* (NOT before the first rendering! onInit() is used for that one!).
* @memberOf skillsurvey-ui.app
*/
//	onBeforeRendering: function() {
//
//	},

/**
* Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
* This hook is the same one that SAPUI5 controls get after being rendered.
* @memberOf skillsurvey-ui.app
*/
//	onAfterRendering: function() {
//
//	},

/**
* Called when the Controller is destroyed. Use this one to free resources and finalize activities.
* @memberOf skillsurvey-ui.app
*/
//	onExit: function() {
//
//	}

});