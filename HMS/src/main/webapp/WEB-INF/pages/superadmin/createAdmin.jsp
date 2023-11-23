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

		<!-- partial:../../partials/_sidebar.html -->
		<jsp:include page="sideBar.jsp"></jsp:include>
		<nav class="settings-sidebar">
			<div class="sidebar-body">
				<a href="#" class="settings-sidebar-toggler"> <i
					data-feather="settings"></i>
				</a>
				<h6 class="text-muted mb-2">Sidebar:</h6>
				<div class="mb-3 pb-3 border-bottom">
					<div class="form-check form-check-inline">
						<input type="radio" class="form-check-input"
							name="sidebarThemeSettings" id="sidebarLight"
							value="sidebar-light" checked> <label
							class="form-check-label" for="sidebarLight"> Light </label>
					</div>
					<div class="form-check form-check-inline">
						<input type="radio" class="form-check-input"
							name="sidebarThemeSettings" id="sidebarDark" value="sidebar-dark">
						<label class="form-check-label" for="sidebarDark"> Dark </label>
					</div>
				</div>
				<div class="theme-wrapper">
					<h6 class="text-muted mb-2">Light Theme:</h6>
					<a class="theme-item active" href="../../dashboard.html"> <img
						src="../../../assets/images/screenshots/light.jpg"
						alt="light theme">
					</a>
					<h6 class="text-muted mb-2">Dark Theme:</h6>
					<a class="theme-item"
						href="https://www.nobleui.com/html/template/demo2/dashboard.html">
						<img src="../../../assets/images/screenshots/dark.jpg"
						alt="light theme">
					</a>
				</div>
			</div>
		</nav>
		<!-- partial -->

		<div class="page-wrapper">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="page-content">
				<div class="row">
					<div class="col-lg-12 grid-margin stretch-card">
						<div class="card">
							<div class="card-body">
								<h6 class="card-title">Add personal details</h6>
								<form>
									<div class="mb-3">
										<label for="userName" class="form-label">User
											Name</label> <input type="text" class="form-control form-control-sm"
											id="userName" 
											placeholder="Enter UserName" name="userName">
									</div>

									<div class="mb-3">
										<label for="password" class="form-label">Password</label>
										<input type="password" class="form-control form-control-sm"
											id="password"
											placeholder="Enter Password",name="password">
									</div>

									<div class="mb-3">
										<label for="confirmPassword" class="form-label">Confirm
											Password</label> <input type="password"
											class="form-control form-control-sm" id="confirmPassword"
											placeholder="ReEnter Password",name="confirmPassword">
									</div>

									<div class="mb-3">
										<label for="email" class="form-label">
											Email</label> <input type="email"
											class="form-control form-control-sm" id="email"
											 placeholder="Enter Email",name="email">
									</div>

									
									<div class="row mb-3">
									<h6 style="text-align: center;color: purple;">Date of birth</h6>
											<div class="col-md-4">
											<label for="year" class="form-label">Select Year</label> 
											<select class="form-select form-select-sm" id="year" name="year" >
											
										    </select>
											</div>	
											<div class="col-md-4">
											<label for="month" class="form-label">Select Month</label> 
											<select class="form-select form-select-sm"
											id="month" name="month">
											
										</select>
											</div>
											<div class="col-md-4">
											<label for="day" class="form-label">Select Day</label>
											 <select class="form-select form-select-sm"
											id="day" name="day">
											
										</select>
											</div>
																			
									</div>

									<div class="mb-3">
										<div class="form-check form-check-inline">
											<input type="radio" class="form-check-input"
												name="gender" id="male"> <label
												class="form-check-label" for="male"> Male </label>
										</div>
										<div class="form-check form-check-inline">
											<input type="radio" class="form-check-input"
												name="gender" id="female"> <label
												class="form-check-label" for="female"> Female
											</label>
										</div>
										<div class="form-check form-check-inline">
											<input type="radio" class="form-check-input"
												name="gender" id="other"> <label
												class="form-check-label" for="other"> Other </label>
										</div>
									</div>

									<div class="mb-3">
										<label for="mobileNumber" class="form-label">Mobile
											number</label> <input type="text"
											class="form-control form-control-sm" id="mobileNumber"
											 placeholder="Enter mobile number" name="mobileNumber">
									</div>
									<h6 class="card-title mt-5">Add address</h6>
									<div class="mb-3">
										<label for="country" class="form-label">Select
											Country</label> 
											<select class="form-select form-select-sm"
											id="country" name="country">
											
										</select>
									</div>
									<div class="mb-3">
										<label for="state" class="form-label">Select
											State</label> <select class="form-select form-select-sm"
											id="state" name="state">
											
										</select>
									</div>
									<div class="mb-3">
										<label for="city" class="form-label">Select
											City</label> <select class="form-select form-select-sm"
											id="city" name="city">
											
										</select>
									</div>
									<div class="mb-3">
										<label for="addressLine" class="form-label">Address
											line</label> <input type="text" class="form-control form-control-sm"
											id="addressLine" 
											placeholder="Enter Addressline" name="addressLine">
									</div>
									<div class="mb-3">
										<label for="doorNo" class="form-label">Door
											no</label> <input type="text" class="form-control form-control-sm"
											id="doorNo"
											placeholder="Enter Doornumber" name="doorNo">
									</div>
									<div class="mb-3">
										<label for="landmark" class="form-label">Landmark</label>
										<input type="text" class="form-control form-control-sm"
											id="landmark" 
											placeholder="Enter Landmark" name="landmark">
									</div>
									<div class="mb-3">
										<label for="pincode" class="form-label">Pincode</label>
										<input type="text" class="form-control form-control-sm"
											id="pincode" 
											placeholder="Enter Pincode" name="pincode">
									</div>

									<button class="btn btn-primary" type="submit">Create
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
<script type="text/javascript">
$(document).ready(function(){
	//$("select").select2();
	//functions trigger on pageload  
	fetchYears();
	fetchCountries();
	
	$('#year').change(function(){
		$('#month').empty();
		if($(this).val() !== '')	{
			fetchMonths();
		}
	})
	$('#month').change(function(){
		$('#day').empty();
		if($(this).val() !== ''){
			fetchDays($('#year').val(),$('#month').val());
		}
	})
	$('#country').change(function(){
		$('#state').empty();
		$('#city').empty();
		if($(this).val() !== ''){
			fetchStates($('#country').val());
		}
	})
	$('#state').change(function(){
		$('#city').empty();
		if($(this).val() !== ''){
			fetchCities($('#state').val());
		}
	})
	
});

function fetchYears()	{
	$.ajax({
		url : 'fetchYears',
		type : 'GET',
		success : function(response)	{
			$('#year').append(new Option('======== SELECT YEAR ========',''));
			$.each(response.years,function(key,year){
				$('#year').append(new Option(year,year));
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
			$('#month').append(new Option('======== SELECT MONTH ========',''));
			$.each(response.months,function(key,month){
				$('#month').append(new Option(month,month));
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
				$('#day').append(new Option('======== SELECT DAY ========',''));
				$.each(response.days,function(key,day){
					$('#day').append(new Option(day,day));
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
			$('#country').append(new Option('======== SELECT COUNTRY ========',''));
			$.each(response.countries,function(key,country){
				$('#country').append(new Option(country.countryName,country.countryId));
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
			$('#state').append(new Option('======== SELECT STATE ========',''));
			$.each(response.states,function(key,state){
				$('#state').append(new Option(state.stateName,state.stateId));
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
				$('#city').append(new Option('======== SELECT CITY ========',''));
				$.each(response.cities, function(key,city){
					$('#city').append(new Option(city.cityName,city.cityId));
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
</script>
</html>