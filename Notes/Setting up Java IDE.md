>[!IMPORTANT]
> ### Personal Notations.
> Please note that these entries are based on my Java Fundamentals training. There may be occasional spelling errors or inaccuracies in technical terms. I’ve compiled these notes both as a markdown practice exercise and to document my learning journey. Any constructive feedback or corrections are welcome.
   
# Setting Up the IDE and Environment Variables
Before we can start writing programs, we need to set everything up properly. This involves several key steps:
   
* **Downloading the Java Development Kit (JDK):** Choose and download the JDK version you intend to use.
* **Installing the Integrated Development Environment (IDE) Software:** Install your preferred IDE, such as IntelliJ IDEA, Eclipse, or NetBeans.
* **Configuring Environment Variables:** Add the necessary environment variables to your system to ensure the correct JDK is used during compilation.
By following these steps, you'll create a functional development environment ready for programming.
   
## Using the Software Development Directory Structure - SDDS. 
<img align="right" src="https://github.com/user-attachments/assets/6e9610c2-beb3-4e67-8156-84c8a5e29686">

   
A key aspect of my method is the use of a _Software Development Directory Structure_, which helps me properly organize my work and resources. This technique was recommended and taught to me by professionals such as my Java professor, Carlos Cano Ladera, and my supervisor during my internship, Joaquín Matías Aguirre. Both are exceptional teachers and professionals whom I deeply appreciate. Given this method, the installation process will not completely reflect the one described in Vahe Aslanyan's book. In his book, Mr. Aslanyan instructs readers on how to install the JDK through an installer rather than using a "compact portable" installation. From now on, the "Software Development Directory Structure" will be referred to as "SDDS". With this clarification, let's continue.
   
<hr/>
   
### **Downloading the Java Development Kit (JDK):**
To download the JDK, visit Oracle's official website and navigate to the download section.   
[Oracle's download center](https://www.oracle.com/java/technologies/downloads/#java8)
   
- Once on the downloads site, select the JDK version you wish to obtain, in my case JDK22.
- Select the tab corresponding to your operating system (e.g., Windows).
- Click on the link for the **compressed archive** (x64 Compressed Archive).
  
> [!CAUTION]
> Ensure you are selecting the correct version for your needs. Do not download things on _autopilot_.
> Avoid using the installer unless you are confident in your needs and understand the potential configuration issues it may introduce. Installers can sometimes create discrepancies that affect your IDE setup. By going wiith the compressed archive all configurations will be done manually and prevent any errors.

<p align="center" width="100%">
<img src="https://github.com/user-attachments/assets/d9a014ca-12ea-4dbc-940c-e3d17a26ed9d">
</p>   

<hr/>

   
### **Installing the Integrated Development Environment (IDE) Software**
   
The choice of software for writing programs is a personal preference. I will be using **Eclipse**, but other IDEs work just as well. Some popular alternatives include NetBeans, IntelliJ IDEA, and VSCode. An honorable mention goes to VSCodium for users who prefer a telemetry-free experience.
   
- Navigate to Eclipse's official website and click on the download button. [Eclipse's site](https://eclipseide.org)
- Click on "Download Packages".
- Select the apropriate version for your operating system.
   
   
> [!IMPORTANT] 
> If you are not going to work with the [SDDS](#using-the-software-development-directory-structure---sdds) as I do, then you are free to go with the installer route. Otherwise if you DO work with [SDDS](#using-the-software-development-directory-structure---sdds) you will have to make sure you are downloading the packaged version of the IDE.
   
<p align="center" width="100%">
    
   <img  src="https://github.com/user-attachments/assets/f9985d9f-aed4-4d0d-9be5-d7edd4b3528d">
</p>



   
One of the great advantages of this installation method is that you don't need to install the IDE traditionally. Instead, simply extract the contents of the compressed archive to your preferred directory, and you're all set. For example, I’ll be extracting the IDE to C:\dev\IDE\Eclipse\Eclipse2024-06-Winx86_64. I like to keep the folder name the same as the original compressed archive so I can easily identify the version I'm using. This approach also helps maintain a sort of version history if I decide to use different versions in the future.
   
> [!TIP]
> To make it easier to open the IDE without having to navigate to the installation folder each time, you might want to create a desktop shortcut. This way, you can quickly access the software with a single click.
   
<hr/>
   
 ### **Configuring Environment Variables:**
This is the final step in the configuration process. We need to inform the system of the location of our preferred JDK and its binaries. To accomplish this, we must create a variable called **JAVA_HOME** and add the JDK's location to our **PATH** variable.
   

   
> [!IMPORTANT]
> There is a difference between user environment variables and system environment variables. If you are configuring the IDE for academic purposes on your own device, you can use the system-wide configuration. However, if you are using a device without Administrator permissions, you will need to use the user variable option. The only difference is the 'range' of the configuration.
---
**Creating the JAVA_HOME variable.**


<img align="right" src="https://github.com/user-attachments/assets/dcc1ec85-7c32-4546-b8c7-599eaee7974d">
   
- To create the **JAVA_HOME** environment variable on Windows, start by pressing the **Windows key** and **R** simultaneously to open the _Run_ dialog box.
- Type `sysdm.cpl` into the box and press _Enter_. This will open the _System Properties_ window. 
    
      
- Within this window, navigate to the _'Advanced'_ tab and click on the _'Environment Variables'_ button.
   
A new window will appear, allowing you to manage environment variables. 
- In this window, click on _'New...'_ under the **User variables** or **System variables** section, depending on whether you need the variable to be user-specific or system-wide. In the _New System Variable_ dialog that opens, set the variable name to `JAVA_HOME` and specify the path to your JDK installation directory as the variable value (for example, C:\dev\core\Java\JDK\oracle\Version\jdk-21.0.4). 
   
Confirm by clicking _OK_.


<p align="center" width="100%">
    <img src="https://github.com/user-attachments/assets/54e1740b-7eed-4fae-95f8-fc8fa45c0c77">
</p>

After these steps, ensure that the JAVA_HOME variable is listed among the environment variables. 

<p align="center" width="100%">
    <img src="https://github.com/user-attachments/assets/87bcd313-a8ae-42c5-8269-38617f86fe57">
</p>
   
   
---
   
**Adding the binaries to the Path variable.**

Now locate the **'Path'** variable. This variable should already exist in your system, all we need to do is add a new location to the locations stored within it. To add your binaries to your path variable double click on **'Path'** and then click on _'New'_ to add your new location. In this variable we must locate the _'\bin'_ directory within your Java installation folder. To make things easier we can simply type `'%JAVA_HOME%\bin'` and then press enter to confirm. 
   
> [!CAUTION]
> It is important to use the `%` symbols before and after the variable name in order to access the value of the variable itself and not the name string.

<p align="center" width="100%">
    <img src="https://github.com/user-attachments/assets/41ff8de5-edfe-4d50-9353-e1aa7cbd9c97">
</p>


Finally, click OK to close all windows and apply the changes. This completes the process of setting the JAVA_HOME environment variable to point to your JDK location.


### Final test to check if everything works.
Now to check if all is working propperly open the CMD and type '**java -version**' . The result should look something like this.
    
<p align="center" width="100%">
    <img src="https://github.com/user-attachments/assets/d88b83a4-f6af-4aa0-a584-fe07d95450e5">
</p>
   
<hr>
   
# _Et voilá_
We are done. Your IDE is officialy configured and you can get ready to write programs. 
   
Happy programming!

> [!NOTE]
> I created this guide primarily for myself as a practice method and to explore Markdown language. This configuration method is quite basic and tailored to my specific needs and methodology. However, if you found this guide helpful in setting up your IDE and making it work, I'm very glad it did!
   
> Best regards. David Jason.

  
