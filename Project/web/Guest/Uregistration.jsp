<%-- 
    Document   : Uregistration
    Created on : Mar 1, 2024, 8:44:39 PM
    Author     : frank
--%>

<!DOCTYPE html>
<!-- Designined by CodingLab - youtube.com/codinglabyt -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title>User Registration</title>
    <link rel="stylesheet" href="../Assets/stle.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <%@include file="Head.jsp" %>
<body>
  <div class="container1">
    <div class="title">User Registration</div>
    <div class="content">
      <form action="POST">
        <div class="user-details">
          <div class="input-box">
                <span class="details">Full Name</span>
                <input type="text" placeholder="Enter your name" required>
           </div>
           <div class="input-box">
                <span class="details">Email</span>
                <input type="text" placeholder="Enter your email" required>
            </div> 
            <div class="input-box">
                <span class="details">Phone Number</span>
                <input type="text" placeholder="Enter your number" required>
            </div>
            <div class="input-box">
                <span class="details">Property Number</span>
                <input type="text" placeholder="Enter your property number" required>
            </div>  
            <div class="input-box">
                <span class="details">Photo:</span>
                <input type="file" id="filePhoto" name="filePhoto" onchange="updateFileName(this)">
                <label for="filePhoto" class="upload-label">
                    <span class="custom-file-upload">Choose File</span>
                </label>
                <span class="file-name" id="fileName">No file chosen</span>
            </div>
            <div class="input-box">
                <span class="details">Aadhar Proof:</span>
                <input type="file" id="fileProof" name="fileProof" onchange="updateFileName(this)">
                <label for="fileProof" class="upload-label">
                    <span class="custom-file-upload">Choose File</span>
                </label>
                <span class="file-name" id="fileName">No file chosen</span>
            </div>
            <div class="input-box">
                <span class="details">Password</span>
                <input type="text" placeholder="Enter your password" required>
            </div>
            <div class="input-box">
                <span class="details">Confirm Password</span>
                <input type="text" placeholder="Confirm your password" required>
            </div>
        </div>
        <div class="gender-details">
          <input type="radio" name="gender" id="dot-1">
          <input type="radio" name="gender" id="dot-2">
          <input type="radio" name="gender" id="dot-3">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
                <span class="dot one"></span>
                <span class="gender">Male</span>
            </label>
            <label for="dot-2">
                <span class="dot two"></span>
                <span class="gender">Female</span>
            </label>
            <label for="dot-3">
                <span class="dot three"></span>
                <span class="gender">Prefer not to say</span>
            </label>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form>
    </div>
  </div>   
</body>

              </div>
            </div>
        </div>
      </div>
    </div>
  </section><!-- #intro -->

<!--==========================
    Footer
  ============================-->
  <footer id="footer">
    <div class="footer-top">
      <div class="container">
        <div class="row">
            
          <div class="col-lg-3 col-md-6 footer-info" style="margin-left: 50px">
            <h3>EcoHarbor</h3>
            <p>EcoHarbor pioneers sustainable waste management solutions tailored for coastal communities, combining advanced technology and community engagement for a cleaner, greener future. Join us in shaping a sustainable tomorrow.</p>
          </div>

          <div class="col-lg-3 col-md-6 footer-links" style="margin-left: 100px">
            <h4>Useful Links</h4>
            <ul>
              <li><i class="ion-ios-arrow-right"></i> <a href="#intro">Home</a></li>
              <li><i class="ion-ios-arrow-right"></i> <a href="#about">About us</a></li>
              <li><i class="ion-ios-arrow-right"></i> <a href="#services">Services</a></li>
              <li><i class="ion-ios-arrow-right"></i> <a href="#">Terms of service</a></li>
              <li><i class="ion-ios-arrow-right"></i> <a href="#">Privacy policy</a></li>
            </ul>
          </div>

            <div class="col-lg-3 col-md-6 footer-contact" style="margin-left: 100px" id="contacts">
            <h4>Contact Us</h4>
            <p>
              Avoly Panchayath<br>
              Muvattupuzha, Pin:686670<br>
              Kerala, India <br>
              <strong>Phone:</strong> 0485 226 0243<br>
              <strong>Email:</strong> avoly.gp.mvpa@gmail.com<br>
            </p>
            
            <div class="social-links">
              <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
              <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
              <a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
              <a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
              <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
            </div>

          </div>
        </div>
      </div>
    </div>

    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong>EcoHarbor</strong>. All Rights Reserved
      </div>
    </div>
  </footer>
</html>

