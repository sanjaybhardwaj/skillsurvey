sap.ui.jsview("skillsurvey-ui.Role", {

	/** Specifies the Controller belonging to this View. 
	* In the case that it is not implemented, or that "null" is returned, this View does not have a Controller.
	* @memberOf level.LevelTest
	*/ 
	getControllerName : function() {
		return "skillsurvey-ui.Role";
	},

	/** Is initially called once after the Controller has been instantiated. It is the place where the UI is constructed. 
	* Since the Controller is given to this method, its event handlers can be attached right away. 
	* @memberOf level.LevelTest
	*/ 
	createContent : function(oController) {		
		
		var oTable = new sap.m.Table( {
     	
			growing : false,
			growingThreshold: 2,
			inset : false,
		//	mode: "MultiSelect",
			showUnread : true,
			growingScrollToLoad : false,
			//headerText : "Items (5)",
			headerToolbar : new sap.m.Toolbar({
				content : [
					
					new sap.m.ToolbarSpacer(),
					new sap.m.Button({
						//icon: "sap-icon://new",
						text:"Create New Entry",
						enabled:"{auth>/action/isCreate}",
						press : function() {
							//var context =this.getBindingContext().getObject();// BMays@ACECompany.com
							oController.handleSave();
//							var actionString='{"id":"","name":"","description":"","actions":{"id":'+false+',"name":,'+false+',"description":'+false+'}}';
//							alert(actionString);
//							var transientModel = new sap.ui.model.json.JSONModel();
//							transientModel.setDefaultBindingMode("TwoWay");
//							transientModel.setJSON(actionString ,false);
//							sap.ui.getCore().setModel(transientModel,"transientModel");
//							var app = sap.app.viewCache.get("app");
//							var level = sap.app.viewCache.get("CreateRole");
//							app.app.addPage(level, false);
//							app.app.to("CreateRole");
						}
					})
				]
			}),
			selectionChange : function(e) {
				jQuery.sap.log.info("selectionChanged", Date.now());
			},
			itemPress : function(e) {
				//jQuery.sap.log.info("itemPressed", e.getParameter("listItem").getId(), e.getParameter("srcControl").getId());
			},
			updateStarted : function(e) {
				//jQuery.sap.log.info("updateStarted ", JSON.stringify(e.getParameters()), Date.now());
			},
			updateFinished : function(e) {
				//jQuery.sap.log.info("updateFinished ", JSON.stringify(e.getParameters()), Date.now());
			},
			columns : [
				new sap.m.Column({
					hAlign : "Left",
					width : "10%",
					header : new sap.m.Label({
						text : "Id"
					}),
					demandPopin : true
				}),
			new sap.m.Column({
					hAlign : "Left",
					width : "10%",
					header : new sap.m.Label({
						text : "Name"
					}),
					demandPopin : true
				}),
				
				new sap.m.Column({
					hAlign : "Center",
					width : "5%",
				}),
				new sap.m.Column({
					hAlign : "Center",
					width : "5%",
				}),
				new sap.m.Column({
					hAlign : "Center",
					width : "5%",
				})
				
			]
	
	});
     var template = new sap.m.ColumnListItem({
				//type : "Navigation",
				unread : false,
				//vAlign : "Middle",
				cells : [
							new sap.m.Label({
								text : "{id}",
							}),
							 new sap.m.Label({
								text: "{name}"
							}),
		                      new sap.m.Button({
								width:"8px",
								icon : "sap-icon://hint",
								enabled:"{auth>/action/isRead}",
								press:function(evt){
									
									oController.handleOverview(this.getBindingContext().getObject());
									//var context =this.getBindingContext().getObject();// BMays@ACECompany.com
									
								
									//var app = sap.app.viewCache.get("app");
									//var level = sap.app.viewCache.get("OverviewRole");
								//	app.app.addPage(level, false);
								//	app.app.to("OverviewRole");
								}
							}),
		                     new sap.m.Button({
								text: "Edit",
								width:"8px",
								icon : "sap-icon://edit",
								enabled:"{auth>/action/isEdit}",
								press:function(evt){
									
									oController.handleEdit(this.getBindingContext().getObject());
									
									
									//var app = sap.app.viewCache.get("app");
									//var level = sap.app.viewCache.get("CreateRole");
									//app.app.addPage(level, false);
									//app.app.to("CreateRole");
								}
							}),
		                       new sap.m.Button({
								
								//enabled:"{auth>/action/isDelete}",
								icon : "sap-icon://delete",
								press:function(evt){
									//var context = this.getBindingContext().getObject();
									//Read Selected Data
								}
							})
				]
			});
     // // sap.app.config.setBindingContextModel("Administrators");
     debugger;
     var  temp = sap.ui.getCore().getModel("overviewModel");
     
			oTable.setModel(sap.ui.getCore().getModel("overviewModel"));
			oTable.bindAggregation("items", "/", template);
	

		var oControls = [];
		var iconBar = new sap.m.IconTabBar({
			id : this.createId("detail-tabs"),
			expanded : "{device>isNoPhone}",
			content : oTable
		});

		oControls.push(iconBar);
		return new sap.m.Page({
			title : "{i18n>DetailTitle}",
			showNavButton : "{device>/isPhone}",
			content : oControls,
			footer : new sap.m.Bar({
				id : this.createId("detail-footer"),
//				contentRight : [ new sap.m.Button({
//					id : this.createId("create-company-footer-save"),
//					text : "{i18n>SaveButtonText}",
//					icon : "sap-icon://save",
//					press : oController.handleSave
//				}), new sap.m.Button({
//					id : this.createId("create-company-footer-cancel"),
//					text : "{i18n>CancelButtonText}",
//					icon : "sap-icon://cancel",
//					press : oController.handleCancel
//				}) ]
			})
		});

		
		
	}

});

