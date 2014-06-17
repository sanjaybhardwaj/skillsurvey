sap.ui.jsview("skillsurvey-ui.Individual", {

	/** Specifies the Controller belonging to this View. 
	* In the case that it is not implemented, or that "null" is returned, this View does not have a Controller.
	* @memberOf individual.skillsurvey-ui
	*/ 
	getControllerName : function() {
		return "skillsurvey-ui.Individual";
	},

	/** Is initially called once after the Controller has been instantiated. It is the place where the UI is constructed. 
	* Since the Controller is given to this method, its event handlers can be attached right away. 
	* @memberOf individual.skillsurvey-ui
	*/ 
	createContent : function(oController) {



		
		var oLayout = new sap.ui.commons.layout.AbsoluteLayout({
			height : "1000px"
		});
		
		oLabel =  new sap.m.Label({ text : "Id:"	});
		
		oNameInput =new sap.m.InputBase({
			id : "individualid",
			width:"250px",
			placeholder:"Enter Level id"
				
			
		});
		oLayout.addContent(oLabel, {left : "20px",	top : "70px"});
		oLayout.addContent(oNameInput, {left : "200px",	top : "60px"});
		//End Event Type
	
		oLabel = new sap.m.Label({	text : "Name:"	});
		oNameInput =new sap.m.InputBase({
			id : "individualname",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level name..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "115px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "105px"
		});
		
		
		oLabel = new sap.m.Label({	text : "Gender:"	});
		oNameInput =new sap.m.InputBase({
			id : "individualgender",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level name..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "160px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "150px"
		});
		
		
		
		oLabel = new sap.m.Label({	text : "Login:"	});
		oNameInput =new sap.m.InputBase({
			id : "individuallogin",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level name..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "205px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "195px"
		});
		
		
		
		oLabel = new sap.m.Label({	text : "Password:"	});
		oNameInput =new sap.m.InputBase({
			id : "individualpassword",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level name..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "250px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "240px"
		});
		
		
		
		
		
		
		oLabel = new sap.m.Label({	text : "DepartmentId:"	});
		oNameInput =new sap.m.InputBase({
			id : "individualdepartmentid",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level name..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "295px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "285px"
		});
		
		
		oLabel = new sap.m.Label({	text : "FunctionId:"	});
		oNameInput =new sap.m.InputBase({
			id : "individualfunctionid",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level name..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "340px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "330px"
		});
		
		
		

		oLabel = new sap.m.Label({	text : "OccupationId:"	});
		oNameInput =new sap.m.InputBase({
			id : "individualoccupationid",
			width:"250px",
			type : sap.m.InputType.Email,
			placeholder:"Enter Level name..",
				
				
		});
		
		oLayout.addContent(oLabel, {left : "20px", top : "395px" 	});
		oLayout.addContent(oNameInput, {left : "200px",	top : "375px"
		});
		
		
		

		oLabel = new sap.m.Label({text : "LevelId:"	});
		oNameInput =new sap.m.InputBase({
			id : "individuallevelid",
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
		
		oLayout.addContent(oLabel, {left : "20px",	top : "440px"});
		oLayout.addContent(oNameInput, {left : "200px",	top : "420px"	});

		
	

	


		

	

		
		
	

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
			title: "Individual"
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
