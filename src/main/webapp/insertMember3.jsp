<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>회원가입</title>
  <link rel="stylesheet" href="styles.css">
</head>
<body>

<div class="container">
  <form id="signupForm" action="#" method="post">
    <h2>회원가입</h2>
    <div class="input-group">
      <label for="username">사용자명:</label>
      <input type="text" id="username" name="username" required>
      <span class="error" id="usernameError"></span>
    </div>
    <div class="input-group">
      <label for="email">이메일:</label>
      <input type="email" id="email" name="email" required>
      <span class="error" id="emailError"></span>
    </div>
    <div class="input-group">
      <label for="password">비밀번호:</label>
      <input type="password" id="password" name="password" required>
      <span class="error" id="passwordError"></span>
    </div>
    <div class="input-group">
      <label for="confirm-password">비밀번호 확인:</label>
      <input type="password" id="confirm-password" name="confirm-password" required>
      <span class="error" id="confirmPasswordError"></span>
    </div>
    <button type="submit">가입</button>
  </form>
</div>

<script src="script.js"></script>
</body>
</html>



