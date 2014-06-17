sap.ui.jsview("skillsurvey-ui.DapsscoLevels", {

	/** Specifies the Controller belonging to this View. 
	* In the case that it is not implemented, or that "null" is returned, this View does not have a Controller.
	* @memberOf level.LevelTest
	*/ 
	getControllerName : function() {
		return "skillsurvey-ui.DapsscoLevels";
	},

	/** Is initially called once after the Controller has been instantiated. It is the place where the UI is constructed. 
	* Since the Controller is given to this method, its event handlers can be attached right away. 
	* @memberOf level.LevelTest
	*/ 
	createContent : function(oController) {


		var oLayout = new sap.ui.commons.layout.AbsoluteLayout({
			height : "610px"
		});
		
		oLabel =  new sap.m.Label({ text : "Dapssco_ID:"	});
		
		oNameInput =new sap.m.InputBase({
			id : "dapsscolevelid",
			width:"250px",
			placeholder:"Enter Level id"
				
			
		});
		oLayout.addContent(oLabel, {left : "20px",	top : "70px"});
		oLayout.addContent(oNameInput, {left : "200px",	top : "60px"});
		//End Event Type
	
		oLabel = new sap.m.Label({	text : "LevelID:"	});
		oNameInput =new sap.m.InputBase({
			id : "dapsscolevelid",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level Code..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "115px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "105px"
		});

		
	


		

		
		var oControls = [];
		var iconBar = new sap.m.IconTabBar({
			id : this.createId("detail-tabs"),
			items:[new sap.m.IconTabFilter({
                key : "Edit Information Screen",
                icon : "sap-icon://employee"
             })],
			expanded : "{device>isNoPhone}",
			content : oLayout
		});

		// Register to before show
//		this.addEventDelegate({
//			onBeforeShow : function(evt) {
//				debugger;
//				this.setBindingContext(evt.data.context); 
//			}
//		}, this);
		var oObjecthead = new sap.m.ObjectHeader({
			id: this.createId("detail-head"),
			title: "DapsscoLevels Information"
		});
		///oObjecthead.s
		oControls.push(oObjecthead,iconBar);
		return new sap.m.Page({
			title : "{i18n>DetailTitle}",
			showNavButton : "{device>/isPhone}",
			content : oControls,
			footer : new sap.m.Bar({
				id : this.createId("edit-detail-footer"),
				contentRight : [ new sap.m.Button({
					id : this.createId("edit-company-footer-save"),
					text : "{i18n>SaveButtonText}",
					icon : "sap-icon://save",
					press : function(){
						
						alert("hello");
						
					}
				}), new sap.m.Button({
					id : this.createId("edit-company-footer-cancel"),
					text : "{i18n>CancelButtonText}",
					icon : "sap-icon://cancel",
					press : function(){
						
						alert("hello");
						
					}
				}) ]
			})
		});
		
		
		
	}

});
