## WEBSERVICE ( 🌐 https://gpcoder.com/5572-tim-hieu-ve-web-service/)
- A collection of open protocols and standrads for exchanging info among systems/apps
- Apps can be developed in different languages/platforms
- Info exchanged across system networks (internet/intranet)
- Next generation of application interaction after message queue
- Open standard protocol
- Allow application communicate based on XML/SOAP/HTTP methods
# 🗒️ Note: an individual application can be converted into
- Not all services of an app called 'web services'
- A service treated as a Web Service if:
1. 🔍 discoverable through a simple lookup 
2. **XML** uses a standard XML format for messaging
3. available across internet/intranet network
4.  is a self-describing service through a simple XML syntax
5. 👐 is open to,and not tied to, any operating system/programming language
6. 👫 loosely coupled, synchronous or asynchronous


# 🏗️ WEBSERVICE MODEL


![image](https://user-images.githubusercontent.com/80462415/163747333-e359a2c1-7ef9-44be-a30c-1cd5d66c15e3.png)


We could buid web services in 2 ways: 
1. define interface which will be implemented by the individual app
2. expose the existing app functionality as a web service
- Architecture:
    

# 👷Operations steps (SOAP example): 
- client program( that wants to interact with another application) prepares its request to content as  a SOAP message
- client program sends to this SOAP message to the server web service as an HTTP POST request
- webservice understands SOAP request and converting it into a set of instructions that server program can understand
- server program processes the request content and prepares the output as the response to the SOAP request
- web service takes this response content as a SOAP message and reverts to the SOAP HTPP request invoked by  the client program with this response
- client program web service reads the SOAP response message to  receive the outcome of the server program for the request
## 🧼 SOAP Web Services
(SIMPLE OBJECT ACCESS PROTOCOL)
- XML based protocol for accessing web services
- PLatform/language independent technology integrated
![image](https://user-images.githubusercontent.com/80462415/163751763-dbb63c12-5d3c-4649-96f5-c0ed388736bf.png)

# **Key components**:
🌐 go to : https://gpcoder.com/5572-tim-hieu-ve-web-service/
- SOAP: XML-based protocol for accessing  web services. It is also a W3C recommendation for application integration over networks
- Universal Desciption, Discovery, and Integration(UDDI): XML-based framework for describing discorvering, and integrating web services
- Web Services Description Language (WSDL): an XML doc contain information to build Web services

## 😑 RESTful webservice
**RE**presentational State Transfer (REST)
- REST is a architectural style application, but not a protocol
- RESTful Web Srevice is the Web Services written based on REST. REST is used broadly to replace the Web Service based on SOAP and WSDL
- REST define the architecturing rule for you to design Web serices, focus on the system resource, including how the system resource is formatted and uploaded through HTTP, by different programming languages. By number of Internet servics, REST has been popped off recent years as a favorite deisng model. 
- In practical, REST has great impact and almost could replace SOAP or WSDL since it is much easier to use
- **REST characteristics**
        1. Use HTTP method 
        2. Stateless
        3. Display folder architecture (URLS)
        4. Using JSON, XML, or both
![image](https://user-images.githubusercontent.com/80462415/163752649-38e5a4e0-7fc8-4ebc-9506-4bdc4dc009c8.png)
# java support
- JAX-WS: for developing SOAP web services
    - RPC styles: uses method name, parameters to generate XML structure
    - Document styles: sends SOAP message 
    - ..
## Implementations
- Building SOAP web service using JAX-WS, RPC style
- Building SOAP web service using JAX-WS, Document style
- Building a RESTful web service using JAX-RS(using the Jersey implementation)
# Step to build a SOAP web service with JAX-WS RPC 
1. Define a remote interface
# Step to build RESFful web services
1. Define the remote server component
2. Implement the deployment the deployment descriptor configurations
3. Write the web component that is the default home page of the web service application
4. Write the client program to consume the web service
