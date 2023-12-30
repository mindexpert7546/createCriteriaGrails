package com.iinterchange.sale

class SaleOffer {

    int saleOfferNo 
    Date saleOfferDate = new Date() 
    int totalUnits 
    double saleAmount 

    static constraints = {
        saleOfferNo blank:false 
        saleOfferDate blank: false, date: true 
        totalUnits blank : false 
        saleAmount range:0.0..1000.00 
    }
}
