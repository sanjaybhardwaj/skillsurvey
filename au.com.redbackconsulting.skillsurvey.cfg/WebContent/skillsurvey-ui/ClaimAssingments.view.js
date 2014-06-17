sap.ui.jsview("skillsurvey-ui.ClaimAssingments", {

	/** Specifies the Controller belonging to this View. 
	* In the case that it is not implemented, or that "null" is returned, this View does not have a Controller.
	* @memberOf need.NeedTest
	*/ 
	getControllerName : function() {
		return "skillsurvey-ui.ClaimAssingments";
	},

	/** Is initially called once after the Controller has been instantiated. It is the place where the UI is constructed. 
	* Since the Controller is given to this method, its event handlers can be attached right away. 
	* @memberOf need.NeedTest
	*/ 
	createContent : function(oController) {

		

		

		var oLayout = new sap.ui.commons.layout.AbsoluteLayout({
			height : "610px"
		});
//		var oLabel =  new sap.m.Label({ text : "Company Code:" 	});
//		
//		var oNameInput =new sap.m.Input({
//			id : "editAdminCompanyCode",
//			width:"250px",
//			placeholder:"Enter Company Code..",
//			//type : sap.m.InputType.Text,
//			editable:false,
//			value:{
//					path : 'Administrators>/menuData/data/coCode',
//					constraints : {
//						minLength: 1,
//						maxLength: 20
//					}
//				},
//				liveChange :function(evt){
//				//sap.app.PopUpModel.activateCompanyPopUpDialog("editAdminCompanyCode");
//				
//	
//			}
//		});
//		oLayout.addContent(oLabel, {left : "20px",	top : "25px"});
//		oLayout.addContent(oNameInput, {left : "200px",	top : "15px"});
		//End Company Code
		
		oLabel =  new sap.m.Label({ text : "ClaimID:"	});
		
		oNameInput =new sap.m.InputBase({
			id : "claimassingmentsclaimid",
			width:"250px",
			placeholder:"Enter Level id"
				
			
		});
		oLayout.addContent(oLabel, {left : "20px",	top : "70px"});
		oLayout.addContent(oNameInput, {left : "200px",	top : "60px"});
		//End Event Type
	
		oLabel = new sap.m.Label({	text : "RoleID:"	});
		oNameInput =new sap.m.InputBase({
			id : "claimassingmentsroleid",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level name..",
				
				
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
			title: "ClaimAssingments"
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
