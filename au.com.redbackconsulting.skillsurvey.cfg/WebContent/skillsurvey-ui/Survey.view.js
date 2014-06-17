sap.ui.jsview("skillsurvey-ui.Survey", {

	/** Specifies the Controller belonging to this View. 
	* In the case that it is not implemented, or that "null" is returned, this View does not have a Controller.
	* @memberOf level.LevelTest
	*/ 
	getControllerName : function() {
		return "skillsurvey-ui.Survey";
	},

	/** Is initially called once after the Controller has been instantiated. It is the place where the UI is constructed. 
	* Since the Controller is given to this method, its event handlers can be attached right away. 
	* @memberOf level.LevelTest
	*/ 
	createContent : function(oController) {


		var oLayout = new sap.ui.commons.layout.AbsoluteLayout({
			height : "610px"
		});
		
		oLabel =  new sap.m.Label({ text : "Id:"	});
		
		oNameInput =new sap.m.InputBase({
			id : "surveyid",
			width:"250px",
			placeholder:"Enter Level id"
				
			
		});
		oLayout.addContent(oLabel, {left : "20px",	top : "70px"});
		oLayout.addContent(oNameInput, {left : "200px",	top : "60px"});
		//End Event Type
	
		oLabel = new sap.m.Label({	text : "IndividualId:"	});
		oNameInput =new sap.m.InputBase({
			id : "surveyindividualid",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level Code..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "115px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "105px"
		});

		oLabel = new sap.m.Label({text : "DapsscoID_StartedAt:"	});
		oNameInput =new sap.m.InputBase({
			id : "individualDapsscoIDStartedAt",
			width:"250px",
			placeholder:"Enter First Name.",
				value:{
					path : 'Administrators>/menuData/data/firstName',
					type : 'sap.ui.model.type.String',
					constraints : {
						minLength: 1,
						maxLength: 50
					}
				}
		});
		
		oLayout.addContent(oLabel, {left : "20px",	top : "160px"});
		oLayout.addContent(oNameInput, {left : "200px",	top : "150px"	});

		oLabel = new sap.m.Label({text : "PathwayID_CompletedAt:"	});
		oNameInput =new sap.m.InputBase({
			id : "surveypathwayID_completedAt",
			width:"250px",
			placeholder:"Enter First Name.",
				value:{
					path : 'Administrators>/menuData/data/firstName',
					type : 'sap.ui.model.type.String',
					constraints : {
						minLength: 1,
						maxLength: 50
					}
				}
		});
		
		oLayout.addContent(oLabel, {left : "20px",	top : "205px"});
		oLayout.addContent(oNameInput, {left : "200px",	top : "195px"	});

		

	


		

		
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
			title: "Survey Information"
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
