<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f8f0; /* light green */
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .profile-header {
            background-color: #2ecc71; /* green */
            color: #fff;
            padding: 20px;
            text-align: center;
            border-radius: 10px 10px 0 0;
        }
        .profile-header h1 {
            margin: 0;
        }
        .profile-info {
            padding: 20px;
        }
        .profile-info p {
            margin: 10px 0;
        }
        .profile-pic {
            width: 150px;
            height: 150px;
            border-radius: 50%;
            margin: 0 auto 20px;
            display: block;
            border: 5px solid #fff; /* white */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>

<div class="container">
    <div class="profile-header">
        <h1>User Profile</h1>
    </div>
    <div class="profile-info">
        <img src="profile-pic.jpg" alt="Profile Picture" class="profile-pic">
        <p><strong>Name:</strong> John Doe</p>
        <p><strong>Email:</strong> john.doe@example.com</p>
        <p><strong>Location:</strong> Green Valley</p>
        <p><strong>Interests:</strong> Coding, hiking, gardening</p>
        <p><strong>About:</strong> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec lobortis velit id purus ullamcorper, eget malesuada dui varius.</p>
    </div>
</div>

</body>
</html>
