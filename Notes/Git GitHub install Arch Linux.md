   
> [!NOTE]
> The commands in this guide are specific to Arch Linux. If you are using a different Linux distribution, the commands and package names might vary. **If you are using _Microsoft Windows_, this guide will not work for you**.

<p align="center">
   <a class="hover" href="https://git-scm.com/"><img src="https://github.com/user-attachments/assets/79fcbe71-9b63-4ea4-b2b3-0a30a1d9e7c8"><a/>
   <a href="https://github.com/"><img src="https://github.com/user-attachments/assets/0ea4565d-a109-4c52-a3d8-df06bcc7a653"><a/>
   <a href="https://archlinux.org/"><img src="https://github.com/user-attachments/assets/dfc32fc0-9915-40ef-9b86-2e17ac6c7784"><a/>
   <a href="https://www.linux.org/pages/download/"><img src="https://github.com/user-attachments/assets/13d817e7-c046-4fe3-ae16-f8b521694dea"><a/>
</p>

# Setting Up GitHub on Linux
In this short guide, I will explain how to quickly set up Git on Linux and how to authenticate against GitHub, since HTTP authentication via the terminal is no longer supported.

### Install Git and Configure Username and Email
To install **Git** on Arch Linux, open a terminal and type:

`sudo pacman -S git`

Once installed, make sure to configure your username and email to identify yourself in commits. Use the following commands:

`git config --global user.email "your email"`
`git config --global user.name "your name"`
   
Since we are here, we might as well configure our preferred text editor:
   
`git config --global core.editor "nano"`
   

### Install GitHub CLI
In order to authenticate and use our terminal with GitHub, we must install GitHub CLI:

`sudo pacman -S github-cli`
   
### Authentication Process via Web Browser
To authenticate, use the following command:
   
`gh auth login`
   
This will prompt a login assistant that will guide you through the authentication process. Follow these steps:

---
- Select GitHub.com.
   
<img src="https://github.com/user-attachments/assets/a7b0f92e-6b55-40c8-bf1e-5fb68c83e0a5">
   
---
   
- Select the preferred protocol.
   
<img src="https://github.com/user-attachments/assets/c4311126-5892-4ac0-8a5d-b991e5d13b84">
   
---
   
Select the preferred authentication method.
   
<img src="https://github.com/user-attachments/assets/47b06961-b478-49d4-84e0-c1170df36bac">
   
---
   
Take note of the code that appears now on the terminal.
   
<img src="https://github.com/user-attachments/assets/579e3dfe-bf0e-4ec2-8e8d-8421f39e5f4b">
   
---
   
Log into your web browser or select your account if already logged in.
   
<img src="https://github.com/user-attachments/assets/1e51eef0-4222-4e6f-87a3-3d928175ccee">
   
---
   
Enter here the code you recieved in your terminal.
   
<img src="https://github.com/user-attachments/assets/2dbc9859-f815-45bd-bbfc-06a99ee5e0d4">
   
---
   
Finally, authorize the device.
   
<img src="https://github.com/user-attachments/assets/8859e85d-96f4-41d9-ab26-8fd200f6e4c6">
   
>[!IMPORTANT]
> You will also need to check your Google Authenticator or a similar app, as this process requires 2FA.
---
   
Once everything is done, you will receive an authentication success confirmation.
   
<img src="https://github.com/user-attachments/assets/e6a5d5e9-b684-4bf1-87e6-bc304ecc8805">
   
<img src="https://github.com/user-attachments/assets/02e66b5d-d414-4369-b524-f730b678bd55">


 # Done! 
 ### Congratulations. You are all set!
   
 <a href="https://dictionary.cambridge.org/dictionary/english/confusion"><img align="right" src="https://github.com/user-attachments/assets/a59a090e-f3c0-45aa-ac66-cd50027839c0"></a>
    
 Now you are all set to clone and stage and add and commit and push and rebase and ammend and reset and... and.. _aand_ ...
    
 ---
 


<p align="center">
   <a class="hover" href="https://git-scm.com/"><img src="https://github.com/user-attachments/assets/79fcbe71-9b63-4ea4-b2b3-0a30a1d9e7c8"><a/>
   <a href="https://github.com/"><img src="https://github.com/user-attachments/assets/0ea4565d-a109-4c52-a3d8-df06bcc7a653"><a/>
   <a href="https://archlinux.org/"><img src="https://github.com/user-attachments/assets/dfc32fc0-9915-40ef-9b86-2e17ac6c7784"><a/>
   <a href="https://www.linux.org/pages/download/"><img src="https://github.com/user-attachments/assets/13d817e7-c046-4fe3-ae16-f8b521694dea"><a/>
</p>
