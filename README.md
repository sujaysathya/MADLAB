# MADLAB

for gps add to android manifest<br>
\<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/> <br>
\<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>

for sms add to android manifest<br>
  \<uses-permission android:name="android.permission.READ_SMS"/><br>
  \<uses-permission android:name="android.permission.RECEIVE_SMS"/><br>
  \<uses-permission android:name="android.permission.SEND_SMS"/><br>
 \<uses-permission android:name="android.permission.READ_PHONE_STATE" />

for web page<br>
create assests folder like new->folder->assests folder and keep the html file inside it
add this to android manifest to access google.com/<uses-permission android:name="android.permission.INTERNET" /><br>
for alarm add to android manifest<br>
    \<uses-permission android:name="com.android.alarm.permission.SET_ALARM" />
for menu driven<br>
create assests folder like new->folder->assests folder and keep the html file inside it
put string.html under valuse which is under res
