# Std-PaaSAPI
This project includes a set of generic implementation APIs, called Std-PaaS API, for heterogeneous PaaS platforms

=================================================================================================================
The Std-PaaS API version 1.6
=================================================================================================================
Authors: Eman Hossny, Sherif Khattab, Fatma Omara, Hisham Hassan 

****************
A. Description
****************
The Std-PaaS API can include a set of generic implementation APIs for each service. 
These generic APIs work as a middleware layer to hide heterogeneity of different PaaS 
platforms and help cloud developers to implement generic applications.
Currently, the Std-PaaS API includes two sets of generic APIs for blob storage and NoSql datastore

The Blob storage generic APIs provides a set of generic methods which can be used to develop
generic blob storage applications; while, the NoSQL datastore generic APIs provides a set of
generic methods which can be used to develop generic datastore applications. These applications
can be deployed remotely on PaaS clouds with no change in the source code. 
The user needs only to configure the class path of the generic application to use a specific
adapter.


This application defined the prototypes of the generic methods that are defined in the Std-PaaS API.  
