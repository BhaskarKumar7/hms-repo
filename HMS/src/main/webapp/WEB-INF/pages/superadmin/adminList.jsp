<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>admin list</title>
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
	<jsp:include page="sideBar.jsp"></jsp:include>
	<div class="page-wrapper">
	<jsp:include page="header.jsp"></jsp:include>
	<div class="page-content">
	<div class="row">
		<div class="col-md-12 grid-margin stretch-card">
						<div class="card">
							<div class="card-body">
								<h6 class="card-title">Bordered table</h6>
								<p class="text-muted mb-3">Add class <code>.table-bordered</code></p>
								<div class="table-responsive pt-3">
									<table class="table table-bordered table-sm">
										<thead class="thead-dark">
											<tr>
												<th>#</th>
												<th>Name</th>
												<th>Progress</th>
												<th>Salary</th>
												<th>Start date</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>Cedric Kelly</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-striped progress-bar-animated bg-success" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
													</div>
												</td>
												<td>$206,850</td>
												<td>June 21, 2022</td>
											</tr>
											<tr>
												<td>2</td>
												<td>Haley Kennedy</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-striped progress-bar-animated bg-danger" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
													</div>
												</td>
												<td>$313,500</td>
												<td>May 15, 2022</td>
											</tr>
											<tr>
												<td>3</td>
												<td>Bradley Greer</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-striped progress-bar-animated bg-warning" role="progressbar" style="width: 90%" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"></div>
													</div>
												</td>
												<td>$132,000</td>
												<td>Apr 12, 2022</td>
											</tr>
											<tr>
												<td>4</td>
												<td>Brenden Wagner</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-striped progress-bar-animated bg-primary" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
													</div>
												</td>
												<td>$206,850</td>
												<td>June 21, 2022</td>
											</tr>
											<tr>
												<td>5</td>
												<td>Bruno Nash</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-striped progress-bar-animated bg-danger" role="progressbar" style="width: 35%" aria-valuenow="35" aria-valuemin="0" aria-valuemax="100"></div>
													</div>
												</td>
												<td>$163,500</td>
												<td>January 01, 2022</td>
											</tr>
											<tr>
												<td>6</td>
												<td>Sonya Frost</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-striped progress-bar-animated bg-info" role="progressbar" style="width: 65%" aria-valuenow="65" aria-valuemin="0" aria-valuemax="100"></div>
													</div>
												</td>
												<td>$103,600</td>
												<td>July 18, 2022</td>
											</tr>
											<tr>
												<td>7</td>
												<td>Zenaida Frank</td>
												<td>
													<div class="progress">
														<div class="progress-bar progress-bar-striped progress-bar-animated bg-warning" role="progressbar" style="width: 20%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
													</div>
												</td>
												<td>$313,500</td>
												<td>March 22, 2022</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
	</div>
	</div>
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
</html>