<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Login</title>
<link rel="preconnect" href="https://fonts.googleapis.com/">
<link rel="preconnect" href="https://fonts.gstatic.com/">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&amp;display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="resources/css/core.css">
<link rel="stylesheet" href="resources/css/iconfont.css">
<link rel="stylesheet" href="resources/css/flag-icon.min.css">
<link rel="stylesheet" href="resources/css/style.min.css">
<link rel="shortcut icon" href="resources/images/favicon.png" />
</head>
<body>
	<div class="main-wrapper">
		<div class="page-wrapper full-page">
			<div
				class="page-content d-flex align-items-center justify-content-center">

				<div class="row w-100 mx-0 auth-page">
					<div class="col-md-8 col-xl-6 mx-auto">
						<div class="card">
							<div class="row justify-content-center">
								<div class="col-md-8 ps-md-0">
									<div class="auth-form-wrapper px-4 py-5">
										<a href="#" class="noble-ui-logo d-block mb-2">Kumkumadi<span>HMS</span></a>
										<h5 class="text-muted fw-normal mb-4"> Staff Login</h5>
										<form class="forms-sample">
											<div class="mb-3">
												<label for="userEmail" class="form-label">Username</label> <input
													type="text" class="form-control form-control-sm" id="userName"
													placeholder="user name">
											</div>
											<div class="mb-3">
												<label for="userPassword" class="form-label">Password</label>
												<input type="password" class="form-control form-control-sm"
													id="userPassword" autocomplete="current-password"
													placeholder="Password">
											</div>
											<div class="form-check mb-3">
												<input type="checkbox" class="form-check-input"
													id="authCheck"> <label class="form-check-label"
													for="authCheck"> Remember me </label>
											</div>
											<div>
												<a href="#"
													class="btn btn-primary me-2 mb-2 mb-md-0 text-white">Login</a>

											</div>
											<a href="#" class="d-block mt-3 text-muted">Forgot password?</a>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script src="resources/js/core.js"></script>
<script src="resources/js/feather.min.js"></script>
<script src="resources/js/template.js"></script>
</html>