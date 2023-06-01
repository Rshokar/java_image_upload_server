# Java Image Upload Server

## Table of Contents
- [Project Description](#project-description)
- [Technologies Used](#technologies-used)
- [How to install or run the project](#how-to-run-project)
- [How to use the projcet](#how-to-use-product)
- [Contact Information](#contact-information)

## <a id="project-description">Project Description</a>
This upload server project was developed during my time at BCIT. As part of our third-term specialization, I chose the client-server option, focusing on learning about application communication. The project involves creating a multi-threaded Java server and a Java client that communicate via a socket.

The server is designed to handle image uploads, providing a simple and efficient way to transfer images over the network. When an image is uploaded, the server saves it to the root directory. Additionally, it provides the functionality to print the local directory to the console, allowing users to quickly check the contents of the server directory.

The server follows a clear and structured architecture. Incoming requests are received by the server, which then creates a router thread responsible for directing the requests to the appropriate servlet. The servlet, known as the Upload Servlet, contains the business logic for processing the requests. In this case, the Upload Servlet extracts the file path from the request and efficiently copies the file to the local directory, ensuring seamless and reliable file transfer.

On the client side, the project provides an Activity class that serves as the entry point. The Activity class accepts a file path and port number as inputs, allowing users to specify the file they want to upload and the port to connect to. These inputs are then passed to the UploadClient, which handles opening a socket connection to the specified port and seamlessly sending the request. Once the request is sent, the client gracefully shuts down, ensuring proper termination.

It's important to note that this project served as a valuable learning experience, providing insights into application communication over the network, multi-threaded programming, and file transfer in a client-server architecture. While not intended as a finished, production-ready product, the project demonstrates the foundational concepts and skills required for building robust and efficient communication systems.

## <a id="technologies-used">Technologies Used</a>
#### Languages
- Java

## <a id="how-to-run-project">How to install or run the project</a>

### Prerequisites:
Make sure you have the following installed:

- Git and GitHub account
- Java Development Kit (JDK) version 11 or higher

### Cloning the repository:

- Open the command prompt.
- Navigate to the folder where you want to store the repository.
- Run the command: git clone https://github.com/Rshokar/java_image_upload_server

### Running the project:

#### 1.Compiling Project
1. Open the command prompt.
2. Navigate to the folder where the code is stored.
3. Run the command: javac Server/Server.java (If an empty line is printed to the console, everything worked)
4. Run the command: javac CLI/Activity.java (If an empty line is printed to the console, everything worked)

#### 2.Running The Server
1. Open the command prompt.
2. Navigate to the folder where the code is stored.
3. Run the command: java Server/Server [port]
  - Replace [port] with the desired port number that the server should listen on.

#### 3.Running The Client
1. Open the command prompt.
2. Navigate to the folder where the code is stored.
3. Locate the image file (must be a PNG).
4. Run the command: java CLI/Activity [imagePath] [port]
  - Replace [imagePath] with the file path of the image you want to upload.
  - Replace [port] with the port number that the client should connect to.

## <a id="how-to-use-product">How to use the product (Features)</a>

### Features

#### Image Upload
To upload an image follow the compiling and running instructions. 

Notes:
- Make sure to enter the same port number in both the server and client 
  - The filepath is from the root of your computer
  - C:\Users\Desktop\image.png

## Contact Information <a id="contact-information">Contact Information</a>

### Ravinder Shokar
- ravindershokar@gmail.com
- https://www.linkedin.com/in/rshokar/
