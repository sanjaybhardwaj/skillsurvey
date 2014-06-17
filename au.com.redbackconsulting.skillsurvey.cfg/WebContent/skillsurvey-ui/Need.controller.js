sap.ui.controller("skillsurvey-ui.Need", {

/**
* Called when a controller is instantiated and its View controls (if available) are already created.
* Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
* @memberOf need.NeedTest
*/
	onInit: function() {
		var data = '{"items":[{"id":1,"name":"Need1","description":"Description1"},{"id":2,"name":"Need2","description":"Description2"}]}';
		
		var oModel = new sap.ui.model.json.JSONModel();
		oModel.setData(data,false);
		sap.ui.getCore().setModel(oModel);
		
		//alert(oModel.getJSON());
		
	
	},


/**
* Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
* (NOT before the first rendering! onInit() is used for that one!).
* @memberOf need.NeedTest
*/
//	onBeforeRendering: function() {
//
//	},

/**
* Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
* This hook is the same one that SAPUI5 controls get after being rendered.
* @memberOf need.NeedTest
*/
//	onAfterRendering: function() {
//
//	},

/**
* Called when the Controller is destroyed. Use this one to free resources and finalize activities.
* @memberOf need.NeedTest
*/
//	onExit: function() {
//
//	}

});