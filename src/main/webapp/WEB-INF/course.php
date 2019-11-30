<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="./cpStyle.css">

    <title>Faculty</title>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-light bg-light">
        <span class="navbar-brand mb-0 h1">Faculty Page</span>
        <form class="form-inline">
            <button class="btn btn-sm btn-outline-secondary" type="button">Logout</button>
        </form>
    </nav>
    <div class="subject-list">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <label class="input-group-text" for="inputGroupSelect01">Subjects : </label>
            </div>
            <select class="custom-select" id="inputGroupSelect01">
                <option selected>Choose...</option>
                <?php
                for($x = 0 ; $x < 10 ; $x++){
                    echo "<option value='1'>subj : $x</option>";
                }
                ?>
            </select>
        </div>
    </div>
    <div class="student-list">
        <ul class="list-group">
            <?php
            for($x = 0 ; $x < 10 ; $x++){
                echo "<li class='list-group-item d-flex justify-content-between align-items-center'>  student $x   <span class='badge badge-primary badge-pill'>A</span></li>";
            }
            ?>
        </ul>
    </div>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>