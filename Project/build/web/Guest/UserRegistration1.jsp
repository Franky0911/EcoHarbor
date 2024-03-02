
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title> User Registration Form</title>
    <link rel="stylesheet" href="../Assets/userreg.css" />
  </head>
  <%@include file="Head.jsp" %>
  <body>
    <section class="container1">
      <header>User Registration</header>
      <form action="#" class="form">
        <div class="input-box">
          <label>Full Name</label>
          <input type="text" name="txtname" placeholder="Enter full name" title="Name Allows Only Alphabets,Spaces and First Letter Must Be Capital Letter" pattern="^[A-Z]+[a-zA-Z ]*$" required />
        </div>

        <div class="input-box">
          <label>Email Address</label>
          <input type="text" name="txtemail" placeholder="Enter email address" required />
        </div>
        <div class="input-box">
            <label>Phone Number</label>
            <input type="number" placeholder="Enter phone number" name="txtcontact" title="Phone number with 7-9 and remaing 9 digit with 0-9" pattern="[7-9]{1}[0-9]{9}" required />
        </div>
        <div class="gender-box">
          <label>Gender</label>
          <div class="gender-option">
            <div class="gender">
              <input type="radio" id="check-male" name="gender" checked required/>
              <label for="check-male">male</label>
            </div>
            <div class="gender">
              <input type="radio" id="check-female" name="gender" />
              <label for="check-female">Female</label>
            </div>
            <div class="gender">
              <input type="radio" id="check-other" name="gender" />
              <label for="check-other">prefer not to say</label>
            </div>
          </div>
        </div>
        <div class="input-box file-input">
            <label for="file1">Upload Photo</label>
            <input type="file" id="file1" name="file_photo" style="display: none;" required>
            <button type="button" onclick="document.getElementById('file1').click()">Choose File</button>
            <span id="file-name">No file chosen</span>
        </div>
        <div class="input-box file-input">
            <label for="file2">Aadhar Proof</label>
            <input type="file" id="file2" name="file_proof" style="display: none;" required>
            <button type="button" onclick="document.getElementById('file2').click()">Choose File</button>
            <span id="file-name">No file chosen</span>
        </div>
        <div class="input-box address">
          <label>Address</label>
          <textarea name="address" placeholder="Enter street address" required></textarea>
          <div class="column">
            <div class="select-box">
                <select name="ddlLoc" onchange = "getWard(this.value)" required> <!--Here onchange triggers the function getWard()-->
                            <option hidden>Location</option>
                            <%
                                String sel = "select*from tbl_location";  /*Here data from table location is fecthed*/

                                ResultSet rs = con.selectCommand(sel); /*Here there select query is exectued into ResultSet array*/

                                while (rs.next()) /*Using while loop we iterate every values in the array and pass the value into Drop down list*/ {
                            %>
                            <option value="<%=rs.getString("location_id")%>"><%=rs.getString("location_name")%></option> <!--Values from -->
                            <%
                                }
                            %>
                </select>
          <div class="column">
            <div class="select-box">
              <select name="ddlWard" id = "selward" required>
                <option hidden>Ward No</option>
              </select>
            </div>  
          <div class="column">
            <input type="number" placeholder="Enter your Property No" name="txtpropno" required />
          </div>  
        </div>
        <div class="input-box">
            <input type="password" placeholder="Password" name="txtpsswd" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required/>
          </div> 
          <div class="input-box">
            <input type="password" placeholder="Confirm Password" name="txtcpsswd" required/>
          </div>
        <button name="btn_save">Submit</button>
      </form>
    </section>
  </body>
  <script src="../Assets/JQuery/jQuery.js"></script> <!--The jQuery (Javascript Library) file in the specified directory is being processed here-->         
  <script>
                            function getWard(wid) /*Here the function is being defined were parameter is being passed*/
                            {

                                //  alert(wid);  
                                $.ajax({url: "../Assets/AjaxPages/AjaxWard.jsp?wid=" + wid, /*Here we use the $.ajax for passing the parameter value into the ajaxward file*/
                                    success: function(result) { /*If the function is invoked successfully*/
                                        $("#selward").html(result); /*We pass the value into the Ward drop down list using its drop down list id*/
                                    }
                                })
                            }

    </script>
  <%@include file="Foot.jsp" %>
</html>
