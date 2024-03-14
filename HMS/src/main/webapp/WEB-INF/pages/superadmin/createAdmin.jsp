<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create a new admin</title>
<link rel="preconnect" href="https://fonts.googleapis.com/">
<link rel="preconnect" href="https://fonts.gstatic.com/">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&amp;display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="resources/css/core.css">
<link rel="stylesheet" href="resources/css/iconfont.css">
<link rel="stylesheet" href="resources/css/flag-icon.min.css">
<link rel="stylesheet" href="resources/css/style.min.css">
<link rel="stylesheet" href="resources/css/sweetalert2.min.css">
<!-- <link rel="stylesheet" href="resources/css/select2.min.css"> -->
<link rel="shortcut icon" href="resources/images/favicon.png" />
</head>
<body>
	<div class="main-wrapper">
	<jsp:include page="sideBar.jsp"></jsp:include>
		
		<div class="page-wrapper">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="page-content">
				<div class="row">
					<div class="col-lg-12 grid-margin stretch-card">
						<div class="card">
							<div class="card-body">
								<h6 class="card-title">Add personal details</h6>
								<form  id="detailsForm">
									<div class="mb-3">
										<label for="userName" class="form-label">User
											Name</label> <input type="text" class="form-control form-control-sm"
											id="userName" 
											placeholder="Enter UserName" name="userName">
									</div>
										
										<div class="mb-3">
										<label for="userFullName" class="form-label">Full Name
										</label> <input type="text" class="form-control form-control-sm"
											id="userFullName" 
											placeholder="Enter FullName" name="userFullName">
									</div>
										
									<div class="mb-3">
										<label for="userPassword" class="form-label">Password</label>
										<input type="password" class="form-control form-control-sm"
											id="userPassword"
											placeholder="Enter Password" name="userPassword">
									</div>

									<div class="mb-3">
										<label for="userConfirmPassword" class="form-label">Confirm
											Password</label> <input type="password"
											class="form-control form-control-sm" id="userConfirmPassword"
											placeholder="ReEnter Password" name="userConfirmPassword">
									</div>

									<div class="mb-3">
										<label for="userEmail" class="form-label">
											Email</label> <input type="email"
											class="form-control form-control-sm" id="userEmail"
											 placeholder="Enter Email" name="userEmail">
									</div>

									
									<div class="row mb-3">
									<h6 style="text-align: center;color: purple;">Date of birth</h6>
											<div class="col-md-4">
											<label for="userYear" class="form-label">Select Year</label> 
											<select class="form-select form-select-sm" id="userYear" name="userYear" >
											
										    </select>
											</div>	
											<div class="col-md-4">
											<label for="userMonth" class="form-label">Select Month</label> 
											<select class="form-select form-select-sm"
											id="userMonth" name="userMonth">
											
										</select>
											</div>
											<div class="col-md-4">
											<label for="userDay" class="form-label">Select Day</label>
											 <select class="form-select form-select-sm"
											id="userDay" name="userDay">
											
										</select>
											</div>
																			
									</div>

									<div class="mb-3">
										<div class="form-check form-check-inline">
											<input type="radio" class="form-check-input"
												name="userGender" id="userGender" value="male"> <label
												class="form-check-label" for="userGender"> Male </label>
										</div>
										<div class="form-check form-check-inline">
											<input type="radio" class="form-check-input"
												name="userGender" id="userGender" value="female"> <label
												class="form-check-label" for="userGender"> Female
											</label>
										</div>
										<div class="form-check form-check-inline">
											<input type="radio" class="form-check-input"
												name="userGender" id="userGender" value="others"> <label
												class="form-check-label" for="userGender"> Other </label>
										</div>
									</div>

									<div class="mb-3">
										<label for="userMobileNo" class="form-label">Mobile
											number</label> <input type="text"
											class="form-control form-control-sm" id="userMobileNo"
											 placeholder="Enter mobile number" name="userMobileNo">
									</div>
									<h6 class="card-title mt-5">Add address</h6>
									<div class="mb-3">
										<label for="userAddress_countryId" class="form-label">Select
											Country</label> 
											<select class="form-select form-select-sm"
											id="userAddress_countryId" name="userAddress_countryId">
											
										</select>
									</div>
									<div class="mb-3">
										<label for="userAddress_stateId" class="form-label">Select
											State</label> <select class="form-select form-select-sm"
											id="userAddress_stateId" name="userAddress_stateId">
											
										</select>
									</div>
									<div class="mb-3">
										<label for="userAddress_cityId" class="form-label">Select
											City</label> <select class="form-select form-select-sm"
											id="userAddress_cityId" name="userAddress_cityId">
											
										</select>
									</div>
									<div class="mb-3">
										<label for="userAddress_addressLine" class="form-label">Address
											line</label> <input type="text" class="form-control form-control-sm"
											id="userAddress_addressLine" 
											placeholder="Enter Addressline" name="userAddress_addressLine">
									</div>
									<div class="mb-3">
										<label for="userAddress_doorNo" class="form-label">Door
											no</label> <input type="text" class="form-control form-control-sm"
											id="userAddress_doorNo"
											placeholder="Enter Doornumber" name="userAddress_doorNo">
									</div>
									<div class="mb-3">
										<label for="userAddress_landmark" class="form-label">Landmark</label>
										<input type="text" class="form-control form-control-sm"
											id="userAddress_landmark" 
											placeholder="Enter Landmark" name="userAddress_landmark">
									</div>
									<div class="mb-3">
										<label for="userAddress_pincode" class="form-label">Pincode</label>
										<input type="text" class="form-control form-control-sm"
											id="userAddress_pincode" 
											placeholder="Enter Pincode" name="userAddress_pincode">
									</div>

									<button class="btn btn-primary" type="button" id="formBtn" >Create
										admin</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>
</body>
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/core.js"></script>
<script src="resources/js/feather.min.js"></script>
<script src="resources/js/template.js"></script>
<script src="resources/js/sweetalert2.min.js"></script>
<!-- <script src="resources/js/select2.min.js"></script> -->
<script src="resources/js/jquery.validate.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//$("select").select2();
	//functions trigger on pageload  
	fetchYears();
	fetchCountries();
	
	$('#userYear').change(function(){
		$('#userMonth').empty();
		$('#userDay').empty();
		if($(this).val() !== '')	{
			fetchMonths();
		}
	})
	$('#userMonth').change(function(){
		$('#userDay').empty();
		if($(this).val() !== ''){
			fetchDays($('#userYear').val(),$('#userMonth').val());
		}
	})
	$('#userAddress_countryId').change(function(){
		$('#userAddress_stateId').empty();
		$('#userAddress_cityId').empty();
		if($(this).val() !== ''){
			fetchStates($('#userAddress_countryId').val());
		}
	})
	$('#userAddress_stateId').change(function(){
		$('#userAddress_cityId').empty();
		if($(this).val() !== ''){
			fetchCities($('#userAddress_stateId').val());
		}
	})
	
	$('#formBtn').click(function(){
		let resp = $('#detailsForm').valid();
		console.log(resp);
		if(resp==true){
			$(this).prop("disabled", true);
			var reqPayload ={
					'userName': $('#userName').val(),
					'userFullName': $('#userFullName').val(),
					'userPassword':$('#userPassword').val(),
					'userConfirmPassword':$('#userConfirmPassword').val(),
					'userEmail':$('#userEmail').val(),
					'userYear':$('#userYear').val(),
					'userMonth':$('#userMonth').val(),
					'userDay':$('#userDay').val(),
					'userMobileNo':$('#userMobileNo').val(),
					'userGender':$('#userGender').val(),
					'userAddress':{
						'addressLine':$('#userAddress_addressLine').val(),
						'doorNo':$('#userAddress_doorNo').val(),
						'landmark':$('#userAddress_landmark').val(),
						'pincode':$('#userAddress_pincode').val(),
						'cityId':$('#userAddress_cityId').val(),
						'stateId':$('#userAddress_stateId').val(),
						'countryId':$('#userAddress_countryId').val()
					}
			}
			saveAdminDetails(reqPayload);
		}
		console.log(reqPayload);
	});
	
	$('#detailsForm').validate({
		rules:{
			userName:{
				required:true,
				minlength:2
			},
			userFullName:{
				required:true,
				minlength:2
			},
			userPassword:{
				required:true,
				minlength:5
			},
			userConfirmPassword:{
				required:true,
				minlength:5,
				equalTo: "#userPassword"
			},
			userEmail:{
				required:true,
				email:true
			},
			userYear:"required",
			userMonth:"required",
			userDay:"required",
			userGender:"required",
			userMobileNo:{
				required:true,
				minlength:10,
				maxlength:10
			},
			userAddress_countryId:"required",
			userAddress_stateId:"required",
			userAddress_cityId:"required",
			userAddress_addressLine:{
				required:true,
				minlength:10,
				maxlength:200
			},
			userAddress_doorNo:"required",
			userAddress_landmark:{
				required:true,
				minlength:10,
				maxlength:150
			},
			userAddress_pincode:{
				required:true,
				minlength:6,
				maxlength:6
			}
		},
		
		messages:{
			userName:{
				required:"Please enter your username",
				minlength:"Your username must be of atleast 2 characters"
			},
			userFullName:{
				required:"Please enter your fullname",
				minlength:"Your fullname must be of atleast 2 characters"
			},
			userPassword:{
				required:"Please enter your password",
				minlength:"Your password must be of atleast 5 characters long"
			},
			userConfirmPassword:{
				required:"Please enter your password",
				minlength:"Your password must be of atleast 5 characters long",
				equalTo: "Please The Same Password As Above"
			},
			userEmail:{
				required:"Please enter your email",
				email:"Please enter valid email"
			},
			userYear:"Please select year",
			userMonth:"Please select month",
			userDay:"Please select day",
			userMobileNo:{
				required:"Please enter your mobile number",
				userGender:"Please select your gender",
			minlength:"Please enter valid mobile number",
				maxlength:"Please enter valid mobile number"
			},
			userAddress_countryId:"Please select your country",
			userAddress_stateId:"Please select  your state",
			userAddress_cityId:"Please select your city",
			userAddress_addressLine:{
				required:"Please enter your addressline",
				minlength:"Your address should be longer",
				maxlength:"Your address should be shorter"
			},
			userAddress_doorNo: "Please enter your doorno",
			userAddress_landmark:{
				required:"Please enter your landmark",
				minlength:"Your landmark should be longer",
				maxlength:"Your landmark should be shorter"
			},
			userAddress_pincode:{
				required:"Please enter your pincode",
				minlength:"Your pincode should be 6 characters",
				maxlength:"Your pincode should be 6 characters"
			}
		},
		
		errorPlacement: function(error, element) {
	        error.addClass( "invalid-feedback" );

	        if (element.parent('.input-group').length) {
	          error.insertAfter(element.parent());
	        }
	        else if (element.prop('type') === 'radio' && element.parent('.radio-inline').length) {
	          error.insertAfter(element.parent().parent());
	        }
	        else if (element.prop('type') === 'checkbox' || element.prop('type') === 'radio') {
	          error.appendTo(element.parent().parent());
	        }
	        else {
	          error.insertAfter(element);
	        }
	      },
	      
	      highlight: function(element, errorClass) {
	          if ($(element).prop('type') != 'checkbox' && $(element).prop('type') != 'radio') {
	            $( element ).addClass( "is-invalid" ).removeClass( "is-valid" );
	          }
	        },
	        
	        unhighlight: function(element, errorClass) {
	            if ($(element).prop('type') != 'checkbox' && $(element).prop('type') != 'radio') {
	              $( element ).addClass( "is-valid" ).removeClass( "is-invalid" );
	            }
	          }
	});
	
});

function fetchYears()	{
	$.ajax({
		url : 'fetchYears',
		type : 'GET',
		success : function(response)	{
			$('#userYear').append(new Option('======== SELECT YEAR ========',''));
			$.each(response.years,function(key,year){
				$('#userYear').append(new Option(year,year));
			});
		},
		error : function(xhr,status,errorMsg)	{
			console.log(xhr);
			console.log(status);
			console.log(errorMsg);
		}
	});
}

function fetchMonths()	{
	$.ajax({ 
		url:'fetchMonths',
		type:'GET',
		success: function(response)   {
			$('#userMonth').append(new Option('======== SELECT MONTH ========',''));
			$.each(response.months,function(key,month){
				$('#userMonth').append(new Option(month,month));
			});
		},
		error : function(xhr,status,errorMsg)  {
			console.log(xhr);
			console.log(status);
			console.log(errorMsg);
		} 
	});
}

function fetchDays(year,month) {
	var reqPayload ={
			'year':year,
			'month':month
	}
	$.ajax({
			url:'fetchDays',
			type:'POST',
			data: JSON.stringify(reqPayload),
			headers:{
				'Accept':'application/json',
				'Content-Type':'application/json'
			},
			success: function(response) {
				$('#userDay').append(new Option('======== SELECT DAY ========',''));
				$.each(response.days,function(key,day){
					$('#userDay').append(new Option(day,day));
				});
			},
			error:function(xhr,status,errorMsg){
				console.log(xhr);
				console.log(status);
				console.log(errorMsg);
			}
	});
}

function fetchCountries(){
	$.ajax({
		url:'fetchCountries',
		type:'GET',
		success: function(response){
			$('#userAddress_countryId').append(new Option('======== SELECT COUNTRY ========',''));
			$.each(response.countries,function(key,country){
				$('#userAddress_countryId').append(new Option(country.countryName,country.countryId));
			});
		},
		error: function(xhr,status,errorMsg){
			console.log(xhr);
			console.log(status);
			console.log(errorMsg);
		}
	});
}

function fetchStates(countryId){
	var reqPayload={
			'countryId':countryId
	}
	$.ajax({
		url:'fetchStates',
		type:'POST',
		data: JSON.stringify(reqPayload),
		headers:{
			'Accept':'application/json',
			'Content-Type':'application/json'
		},
		success: function(response){
			$('#userAddress_stateId').append(new Option('======== SELECT STATE ========',''));
			$.each(response.states,function(key,state){
				$('#userAddress_stateId').append(new Option(state.stateName,state.stateId));
			});
		},
		error: function(xhr,status,errorMsg){
			Swal.fire({
		        icon: 'error',
		        title: status,
		        text: xhr.responseText
		      })
		//	window.alert(xhr.responseText);
		}
	});
}

 function fetchCities(stateId){
	 var reqPayload ={
			 'stateId':stateId
	 }
	 $.ajax({
		 url: 'fetchCities',
		 type: 'POST',
		 data: JSON.stringify(reqPayload),
		 headers:{
				'Accept':'application/json',
				'Content-Type':'application/json'
			},
			success :function(response){
				$('#userAddress_cityId').append(new Option('======== SELECT CITY ========',''));
				$.each(response.cities, function(key,city){
					$('#userAddress_cityId').append(new Option(city.cityName,city.cityId));
				});
			},
			error: function(xhr,status,errorMsg){
				Swal.fire({
			        icon: 'error',
			        title: status,
			        text: xhr.responseText
			      })
			}
	 });
 }
 
 function saveAdminDetails(reqPayload){
	 $.ajax({
		 url: 'saveAdmin',
		 type: 'POST',
		 data: JSON.stringify(reqPayload),
		 headers:{
				'Accept':'application/json',
				'Content-Type':'application/json'
			},
			success :function(response){
				console.log(response);
				document.getElementById('detailsForm').reset();
				$('#formBtn').prop("disabled", false);
				Swal.fire({
			        icon: 'success',
			        title: response.responseMessage
			      });
				clearFormCss();
			},
			error: function(xhr,status,errorMsg){
				$('#formBtn').prop("disabled", false);
				Swal.fire({
			        icon: 'error',
			        title: status,
			        text: xhr.responseJSON.errorsList
				});
				  console.log(xhr);
			      console.log(errorMsg);
			}
	 });
 }
 
 function clearFormCss(){
	 var elements = document.getElementById('detailsForm').elements;
	 for(var i=0; i<elements.length; i++){
		 elements[i].classList.remove("is-valid");
	 }
 }
</script>
</html>