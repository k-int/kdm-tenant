# KI Tenant Domain Model

KI Projects are constructed of modular/reusable domain models which can be used to share data between services if needed. Sometimes services will use API level interactions, 
but some data structures are best considered shared and enable interaction at the storage module.

This grails plugin defines the following domain classes

     com.k_int.dm.tenant.Tenant      - Holds information about tenant identifiers

And provides the following spring services

     none.

There are no parent dependencies for this module - Tenant could be considered the root of much of the shared data model.
