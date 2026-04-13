# PROG5121 Programming 1A POE – Part 1  
## Chat Application (Registration & Login System)

### 👤 Student Details
- Name: Thabiso Nkosi  
- Module: Programming 1A  
- Module Code: PROG5121  

---

## 📌 Project Overview
This project is a **console-based Java chat application (Part 1)** that focuses on implementing a **registration and login system**.

The system allows users to:
- Register using a username, password, and South African cell phone number
- Validate input using specific rules
- Log in using stored credentials
- Receive feedback messages based on their input

---

## 🎯 Features Implemented

### ✅ 1. Username Validation
- Must contain an underscore `_`
- Must not exceed 5 characters  
- Example: `kyl_1` ✔

---

### ✅ 2. Password Validation
The password must:
- Be at least 8 characters long  
- Contain at least one capital letter  
- Contain at least one number  
- Contain at least one special character  

---

### ✅ 3. Cell Phone Validation
- Must follow South African international format  
- Must start with `+27`  
- Must be followed by 9 digits  
- Example: `+27838968976` ✔  

---

### ✅ 4. User Registration
The system checks:
- Username format  
- Password complexity  
- Cell phone format  

If all conditions are met:
- User is successfully registered  

---

### ✅ 5. User Login
- User enters username and password  
- System checks if they match stored values  

---

### ✅ 6. Login Feedback
- Success:  
