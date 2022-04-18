## WEBSERVICE
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

# **Key components**:
🌐 go to : https://gpcoder.com/5572-tim-hieu-ve-web-service/
- SOAP: XML-based protocol for accessing  web services. It is also a W3C recommendation for application integration over networks
- Universal Desciption, Discovery, and Integration(UDDI): XML-based framework for describing discorvering, and integrating web services
- Web Services Description Language (WSDL): an XML doc contain information to build Web services
