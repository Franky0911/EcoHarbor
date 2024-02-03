<%-- 
    Document   : test
    Created on : Jan 19, 2024, 10:54:11 AM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id = "con"></jsp:useBean>
<%@page  import = "java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
<head>
    <title>
        Wastetype
    </title>
 
    <style>
        h1 {
            color: green;
        }
 
        .multipleSelection {
            width: 300px;
            background-color: #BCC2C1;
        }
 
        .selectBox {
            position: relative;
        }
 
        .selectBox select {
            width: 100%;
            font-weight: bold;
        }
 
        .overSelect {
            position: absolute;
            left: 0;
            right: 0;
            top: 0;
            bottom: 0;
        }
 
        #checkBoxes {
            display: none;
            border: 1px #8DF5E4 solid;
        }
 
        #checkBoxes label {
            display: block;
        }
 
        #checkBoxes label:hover {
            background-color: #4F615E;
            color: white;
            /* Added text color for better visibility */
        }
    </style>
</head>
 
<body>

 
    <form>
        <div class="multipleSelection">
            <div class="selectBox" onclick="showCheckboxes()">
                <select>
                    <option>Select options</option>
                </select>
                <div class="overSelect"></div>
            </div>
            <div id="checkBoxes">
            <%
                String sq = "select *from tbl_wastetype";
                ResultSet rs = con.selectCommand(sq);
                while(rs.next())
                {    
            %>
            
                <label for="first">
                    <input type="checkbox" id="first" value="<%=rs.getString("wastetype_name")%>">
                    <%=rs.getString("wastetype_name")%>
                </label>
            <%
                }
            %>
                
            </div>
        </div>
    </form>
 
    <script>
        let show = true;
 
        function showCheckboxes() {
            let checkboxes = document.getElementById("checkBoxes");
 
            if (show) {
                checkboxes.style.display = "block";
                show = false;
            } else {
                checkboxes.style.display = "none";
                show = true;
            }
        }
    </script>
</body>
 
</html>
