<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.sql.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
     <head>
        <title>Admin | OSIMS</title>
        <meta charset="UTF-8">
        <link rel="title icon" href="images/title-img.png">
        <script src="https://kit.fontawesome.com/36fe1a182c.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <link rel="stylesheet" href="index.css">
        <script src="admin.js"></script>
    </head>

    <body>
        <%-- <% 
			//this will check wether the user is logges or not by using the session variable
			
		String empNo = (String)session.getAttribute("empNo");
		if(session.getAttribute("empNo").equals(null)){
			RequestDispatcher dispatcher = request.getRequestDispatcher("adminLogin.jsp");
		}
	%> --%>
        <!-- <div class="header row">
                    <h2 class="head">| OSIMS | </h2>   
                </div> -->

        <div class="wrapper">
            
            <div class="sidebar fixed-top"> 
                <h2><i class="fas fa-users-cog"></i>ADMIN</h2>
				
				<div class="ad">
					<img src="images\user2.png" alt="fqfe" width="33px" height="30px">
					<h4>${sessionName}</h4>
				</div>
				
                    <a href="#main-cont1"><button id="btn1" onclick="get_ID(this.id)">Insights</button></a>
                    <a href="#main-cont2"><button id="btn2" onclick="get_ID(this.id)"> New Requests</button></a>
                    <a href="#main-cont3"><button id="btn3" onclick="get_ID(this.id)">Student</button></a>
                    <a href="#main-cont4"><button id="btn4" onclick="get_ID(this.id)">Teacher</button></a>
                    <a href="#main-cont5"><button id="btn5" onclick="get_ID(this.id)">Clerk</button></a>
                    <a href="#main-cont6"><button id="btn6" onclick="get_ID(this.id)">Subjects</button></a>
                    <a href="#main-cont7"><button id="btn7" onclick="get_ID(this.id)">Ex-Curricular</button></a>

                    <a href="LogoutServlet">
	                    <div class="admin-details">
	                        <img src="images\user.png" alt="fqfe" width="35px" height="30px">
							<h3>Log out</h3>
	                    </div>
                    </a>
            </div>

            

            <div class="main row col-lg-9 ml-auto bg-dark  fixed-top">

                <div class="main-content" id="main-cont1">
                
                    <div class="info-head">
    
                        <img src="images\analytics.png" alt="fqfe" width="60px" height="60px">
    
                        <div class="info-head-in">
                            <h2>Analytics Dashboard</h2>
    
                            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Delectus asperiores id dignissimos odit 
                                laborum tempore ullam harum beatae exercitationem temporibus. Autem natus culpa perferendis expedita 
                                ratione aperiam tempore ipsa quod?
                            </p>
                        </div>
                    </div>
    
                    <div class="info">
    
                        
                        <div class="row statics">
                            <div class="col-lg-4 col-md-4 col-xs-4 col-sm-4  part1 color1">
                                <div class="part2">
                                    <div class="users">
                                        <i class="fas fa-user-graduate">Students</i>
                                        <h4> ${tot}</h4>
                                    </div>
    
                                </div>
                            </div>
    
                            <div class="col-lg-4 col-md-4 col-xs-4 col-sm-4  part1 color2">
                                <div class="part2">
                                    <div class="users">
                                        <i class="fas fa-chalkboard-teacher">Teachers</i>
                                        <h4>${totTeachers}</h4>
                                    </div>
                                </div>
                            </div>
    
                            <div class="col-lg-4 col-md-4 col-xs-4 col-sm-4  part1 color3">
                                <div class="part2">
                                    <div class="users">
                                        <i class="fas fa-male">Clerks</i>
                                        <h4>${totClerks}</h4>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row statics">

                            <div class="col-lg-4 col-md-4 col-xs-4 col-sm-4  part1 color3">
                                <div class="part2">
                                    <div class="users">
                                        <i class="fas fa-book-reader">Subjects</i>
                                        <h4>${totSubjects}</h4>
                                    </div>
    
                                </div>
                            </div>
    
                            <div class="col-lg-4 col-md-4 col-xs-4 col-sm-4  part1 color2">
                                <div class="part2">
                                    <div class="users">
                                        <i class="fas fa-running">Ex-curricular</i>
                                        <h4>${totExCurricular}</h4>
                                    </div>
                                </div>
                            </div>
    
                            <div class="col-lg-4 col-md-4 col-xs-4 col-sm-4  part1 color1">
                                <div class="part2">
                                    <div class="users">
                                        <i class="fas fa-vials">Classes</i>
                                        <h4>${totClasses}</h4>
                                    </div>
                                </div>
                            </div>
                        </div>
    
                        <div class="row highlight">
                            <div class="col-lg-6 col-md-6 col-xs-6 col-sm-6 highlight-sub">
                                <h2>Recent Activities</h2>
                                <h5># Added Student 06540</h5>
                                <h5># Appointed Clerk 78</h5> 
                                <h5># Appointed teacher 209</h5>
                            </div>
    
                            <div class="col-lg-6 col-md-6 col-xs-6 col-sm-6 highlight-sub">
                                <h2>Student Comments</h2>
                                <h5>Added Student 06540</h5>
                                <h5>Appointed Clerk 78</h5>
                                <h5>Appointed teacher 209</h5>
                            </div>
                        </div>
    
                        <div class="row tSubject">
    
                        </div>
    
                        <p>
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus similique incidunt placeat enim itaque,
                            est aspernatur eligendi alias impedit unde repudiandae non totam fugit praesentium nostrum, ratione eos quo. Repellat?
                            Lorem, ipsum dolor sit amet consectetur adipisicing elit. Recusandae hic expedita possimus quaerat corrupti fuga eius
                            reprehenderit voluptates delectus officia! Eos beatae optio repudiandae architecto. Dolor eius nam commodi sit.
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Minus similique incidunt placeat enim itaque,
                            est aspernatur eligendi alias impedit unde repudiandae non totam fugit praesentium nostrum, ratione eos quo. Repellat?
                            Lorem, ipsum dolor sit amet consectetur adipisicing elit. Recusandae hic expedita possimus quaerat corrupti fuga eius
                            reprehenderit voluptates delectus officia! Eos beatae optio repudiandae architecto. Dolor eius nam commodi sit.
                        </p>
                    </div>
                </div>
    
                <!----------------------------------end of analyze panel-------------------------->

				<div class="main-content" id="main-cont2">
                    <div class="info-head color1">
    
                        <img src="images/request.png" alt="student" width="60px" height="60px">
    
                        <div class="info-head-in">
                            <h2>Requests Dashboard</h2>
    
                            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Delectus asperiores id dignissimos odit 
                                laborum tempore ullam harum beatae exercitationem temporibus. Autem natus culpa perferendis expedita 
                                ratione aperiam tempore ipsa quod?
                            </p>
                        </div>
                    </div>

                    <div class="db-panel">
                    
                    	<h2 class="req-head">Teacher Requests</h2>
                    
                        <table class="db-table">
                            <tr>
                                <th>Employee ID</th>
                                <th>Name</th>
                                <th>Address</th>
                                <th>Contact No</th>
                                <th>Email</th>
                                <th>Status</th>
                                <th>Qualification</th>
                                <th>Approval</th>
                            </tr>
                            
                            <c:forEach items="${tRequests}" var="tec">
                            	<tr>
								<td>${tec.id}</td>
				                <td>${tec.name}</td>
				                <td>${tec.address}</td>
				                <td>${tec.contact}</td>
				                <td>${tec.email}</td>
				               <td>${tec.status}</td>
				                <td>${tec.qualification}</td>
			                    <td><a href="UpdateTeacher?id=${tec.id }" onclick="approve()">Approve</a></td>
							</tr>	
                            </c:forEach>

                        </table><br><br>
                        
                        <h2 class="req-head">Clerk Requests</h2>
                        
                        <table class="db-table">
                            <tr>
                                <th>Employee ID</th>
                                <th>Name</th>
                                <th>Address</th>
                                <th>Contact No</th>
                                <th>Email</th>
                                <th>Status</th>
                                <th>Level</th>
                                <th>Approval</th>
                            </tr>
                            
                            <c:forEach items="${cRequests}" var="crk">
                            	<tr>
								<td>${crk.id}</td>
				                <td>${crk.name}</td>
				                <td>${crk.address}</td>
				                <td>${crk.contact}</td>
				                <td>${crk.email}</td>
				               <td>${crk.status}</td>
				                <td>${crk.level}</td>
			                    <td><a href="UpdateClerk?id=${crk.id }" onclick="approve()">Approve</a></td>
							</tr>	
                            </c:forEach>

                           
                        </table>
                        
                    </div>

                </div>

				<!----------------------------------end of request panel-------------------------->
				
                <div class="main-content" id="main-cont3"  onclick="get_ID(this.id)">
                    <div class="info-head color1">
    
                        <img src="images\student1.png" alt="student" width="60px" height="60px">
    
                        <div class="info-head-in ">
                            <h2>Student Dashboard</h2>
    
                            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Delectus asperiores id dignissimos odit 
                                laborum tempore ullam harum beatae exercitationem temporibus. Autem natus culpa perferendis expedita 
                                ratione aperiam tempore ipsa quod?
                            </p>
                        </div>
                    </div>

                    <div class="db-panel">
                        <table class="db-table">
                            <tr>
                                <th>Student ID</th>
                                <th>Student Name</th>
                                <th>Address</th>
                                <th>User Name</th>
                                <th>Password</th>
                                <th>Class</th>
                            </tr>
                            
                            <c:forEach items="${student}" var="stud">
                            	<tr>
								<td>${stud.id}</td>
				                <td>${stud.name}</td>
				                <td>${stud.address}</td>
				                <td>${stud.userName}</td>
				                <td>${stud.password}</td>
				                <td>${stud.cls}</td>
							</tr>	
                            </c:forEach>

                        </table>
                    </div>

                    <form action="CreateStudent" method="POST" class="st-form">
                        

                        <center><h2>Add a Student</h2></center>

                        <table class="form-grid">
                            <tr>
                                <td>Name</td>   <td><input type="text" class="input" name="stname"></td>
                            </tr>
                            <tr>
                                <td>Address</td>    <td><input type="text" class="input" name="staddress"></td>
                            </tr>
                            <tr>
                                <td>User Name</td>  <td><input type="text" class="input" name="uname"></td>
                            </tr>
                            <tr>
                                <td>Password</td>   <td><input type="text" class="input" name="pwd"> <br>
                            </tr>
                            <tr>
                                <td>Class</td><td>  <input type="text" class="input" name="class"> <br>
                            </tr>
                        </table>

                        <center>
                            <input type="submit" name="submit" class="sub" value="Add Student" onclick="update()">
                        </center>

                        
                    </form> 
                    
                    <form action="RemoveStudent" method="POST" class="st-form">

                            <center><h2>Remove a Student</h2></center>
                            
                            <table class="form-grid">
                                <tr>
                                    <td>Student ID</td>   <td>: <input type="text" class="input" name="stID"></td>
                                </tr>
                            </table>

                            <center>
                                <input type="submit" name="submit" class="sub" value="Remove Student" onclick="update()">
                            </center>
                      </form>

                </div>
                
                <!----------------------------------end of student panel-------------------------->


                <div class="main-content" id="main-cont4"  onclick="get_ID(this.id)">
                    <div class="info-head color1">
    
                        <img src="images\teacher1.png" alt="teacher" width="60px" height="60px">
    
                        <div class="info-head-in">
                            <h2>Teacher Dashboard</h2>
    
                            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Delectus asperiores id dignissimos odit 
                                laborum tempore ullam harum beatae exercitationem temporibus. Autem natus culpa perferendis expedita 
                                ratione aperiam tempore ipsa quod?
                            </p>
                        </div>
                    </div>

                    <div class="db-panel">
                        <table class="db-table">
                            <tr>
                                <th>Employee ID</th>
                                <th>Name</th>
                                <th>Address</th>
                                <th>Contact No</th>
                                <th>Email</th>
                                <th>User Name</th>
                                <th>Password</th>
                                <th>Status</th>
                                <th>Qualification</th>
                                <th>Time Table</th>
                                <th>Subject</th>
                            </tr>
                            
                            <c:forEach items="${teacher}" var="tec">
                            	<tr>
								<td>${tec.id}</td>
				                <td>${tec.name}</td>
				                <td>${tec.address}</td>
				                <td>${tec.contact}</td>
				                <td>${tec.email}</td>
				                <td>${tec.userName}</td>
				                <td>${tec.password}</td>
				                <td>${tec.status}</td>
				                <td>${tec.qualification}</td>
				                <td>${tec.timetable}</td>
				                <td>${tec.subject}</td>
							</tr>	
                            </c:forEach>
                            
                        </table>
                    </div>

					<form action="CreateTeacher" method="POST" class="st-form">
                        

                        <center><h2>Add a Teacher</h2></center>

                        <table class="form-grid">
                            <tr>
                                <td>Employee Name</td>   <td><input type="text" class="input" name="empName"></td>
                            </tr>
                            <tr>
                                <td>Address</td>    <td><input type="text" class="input" name="address"></td>
                            </tr>
                            <tr>
                                <td>Contact No</td>    <td><input type="text" class="input" name="contactNo"></td>
                            </tr>
                            <tr>
                                <td>Email</td>    <td><input type="text" class="input" name="email"></td>
                            </tr>
                            <tr>
                                <td>User Name</td>  <td><input type="text" class="input" name="userName"></td>
                            </tr>
                            <tr>
                                <td>Password</td>   <td><input type="text" class="input" name="password"> <br>
                            </tr>
                            <tr>
                                <td>Status</td>   <td><input type="text" class="input" name="password"> <br>
                            </tr>
                            <tr>
                                <td>Education Qualificaton</td>   <td><input type="text" class="input" name="edu"> <br>
                            </tr>
                            <tr>
                                <td>Admin</td><td>  <input type="text" class="input" name="admin"> <br>
                            </tr>
                            <tr>
                                <td>Timetable</td>   <td><input type="text" class="input" name="timetable"> <br>
                            </tr>
                            <tr>
                                <td>Subject</td><td>  <input type="text" class="input" name="subject"> <br>
                            </tr>
                        </table>

                        <center>
                            <input type="submit" name="submit" class="sub" value="Add Teacher" onclick="update()">
                        </center>

                    </form> 
                    
                    <form action="RemoveTeacher" method="POST" class="st-form">

                            <center><h2>Remove a Teacher</h2></center>
                            
                            <table class="form-grid">
                                <tr>
                                    <td>Teacher ID</td>   <td>: <input type="text" class="input" name="tID"></td>
                                </tr>
                            </table>

                            <center>
                                <input type="submit" name="submit" class="sub" value="Remove Teacher" onclick="update()">
                            </center>
                      </form>
                </div>

                <!----------------------------------end of teacher panel-------------------------->

                <div class="main-content" id="main-cont5"  onclick="get_ID(this.id)">
                    <div class="info-head color1">
    
                        <img src="images\clerk1.png" alt="teacher" width="60px" height="60px">
    
                        <div class="info-head-in">
                            <h2>Clerk Dashboard</h2>
    
                            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Delectus asperiores id dignissimos odit 
                                laborum tempore ullam harum beatae exercitationem temporibus. Autem natus culpa perferendis expedita 
                                ratione aperiam tempore ipsa quod?
                            </p>
                        </div>
                    </div>

                    <div class="db-panel">
                        <table class="db-table">
                            <tr>
                                <th>Employee ID</th>
                                <th>Name</th>
                                <th>Address</th>
                                <th>Contact No</th>
                                <th>Email</th>
                                <th>User Name</th>
                                <th>Password</th>
                                <th>Status</th>
                                <th>Level</th>
                            </tr>

							<c:forEach items="${clerk}" var="crk">
                            	<tr>
								<td>${crk.id}</td>
				                <td>${crk.name}</td>
				                <td>${crk.address}</td>
				                <td>${crk.contact}</td>
				                <td>${crk.email}</td>
				                <td>${crk.userName}</td>
				                <td>${crk.password}</td>
				                <td>${crk.status}</td>
				                <td>${crk.level}</td>
							</tr>	
                            </c:forEach>
                        </table>
                    </div>
                    
                    <form action="CreateClerk" method="POST" class="st-form">
                        

                        <center><h2>Add a Clerk</h2></center>

                        <table class="form-grid">
                            <tr>
                                <td>Employee Name</td>   <td><input type="text" class="input" name="empName"></td>
                            </tr>
                            <tr>
                                <td>Address</td>    <td><input type="text" class="input" name="address"></td>
                            </tr>
                            <tr>
                                <td>Contact No</td>    <td><input type="text" class="input" name="contactNo"></td>
                            </tr>
                            <tr>
                                <td>Email</td>    <td><input type="text" class="input" name="email"></td>
                            </tr>
                            <tr>
                                <td>User Name</td>  <td><input type="text" class="input" name="userName"></td>
                            </tr>
                            <tr>
                                <td>Password</td>   <td><input type="text" class="input" name="password"> <br>
                            </tr>
                            <tr>
                                <td>Status</td>   <td><input type="text" class="input" name="password"> <br>
                            </tr>
                            <tr>
                                <td>Level</td>   <td><input type="text" class="input" name="level"> <br>
                            </tr>
                            <tr>
                                <td>Admin</td><td>  <input type="text" class="input" name="admin"> <br>
                            </tr>
                            
                        </table>

                        <center>
                            <input type="submit" name="submit" class="sub" value="Add Clerk" onclick="update()">
                        </center>

                    </form> 
                    
                    <form action="RemoveClerk" method="POST" class="st-form">

                            <center><h2>Remove a Clerk</h2></center>
                            
                            <table class="form-grid">
                                <tr>
                                    <td>Clerk ID</td>   <td>: <input type="text" class="input" name="cID"></td>
                                </tr>
                            </table>

                            <center>
                                <input type="submit" name="submit" class="sub" value="Remove Clerk" onclick="update()">
                            </center>
                      </form>

                </div>
                
                <!----------------------------------end of clerk panel-------------------------->

                <div class="main-content" id="main-cont6"  onclick="get_ID(this.id)">
                    <div class="info-head color1">
    
                        <img src="images\subject.png" alt="subject" width="60px" height="60px">
    
                        <div class="info-head-in">
                            <h2>Subject Dashboard</h2>
    
                            <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Delectus asperiores id dignissimos odit 
                                laborum tempore ullam harum beatae exercitationem temporibus. Autem natus culpa perferendis expedita 
                                ratione aperiam tempore ipsa quod?
                            </p>
                        </div>
                    </div>

                    <div class="db-panel">
                        <table class="db-table">
                            <tr>
                                <th>Subject No</th>
                                <th>Subject Name</th>
                                <th>Grade</th>
                                <th>No of Periods</th>
                            </tr>

							<c:forEach items="${subject}" var="sub">
                            	<tr>
								<td>${sub.id}</td>
				                <td>${sub.name}</td>
				                <td>${sub.grade}</td>
				                <td>${sub.periods}</td>
							</tr>	
                            </c:forEach>
                        </table>
                    </div>
                    
                    <form action="CreateSubject" method="POST" class="st-form">
                        

                        <center><h2>Add a Subject</h2></center>

                        <table class="form-grid">
                            <tr>
                                <td>Subject Name</td>   <td><input type="text" class="input" name="subName"></td>
                            </tr>
                            <tr>
                                <td>Grade</td>    <td><input type="text" class="input" name="grade"></td>
                            </tr>
                            <tr>
                                <td>No of Periods</td>    <td><input type="text" class="input" name="nop"></td>
                            </tr>
                  
                        </table>

                        <center>
                            <input type="submit" name="submit" class="sub" value="Add Subject" onclick="update()">
                        </center>

                    </form> 
                    
                    <form action="RemoveSubject" method="POST" class="st-form">

                            <center><h2>Remove a Subject</h2></center>
                            
                            <table class="form-grid">
                                <tr>
                                    <td>Subject ID</td>   <td>: <input type="text" class="input" name="sID"></td>
                                </tr>
                            </table>

                            <center>
                                <input type="submit" name="submit" class="sub" value="Remove Subject" onclick="update()">
                            </center>
                      </form>

                </div>
            
            
            </div> <!--end of main-->


        </div><!--end of wrapper-->

		<script type="text/javascript">
			
				function approve(){
					swal("A new employee!", "You have successfully approved an employee", "success");
				}
				
				function update(){
					swal("Updated!", "You have successfully updated the database", "success");
				}
		
		</script>
    </body>
</html>  