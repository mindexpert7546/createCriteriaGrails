package com.iinterchange.sale

class BootStrap {

    def init = { servletContext ->
    (1..20).each { index ->
           
            def saleOffer1 = new SaleOffer(
                saleOfferNo: index,
                saleOfferDate: new Date(), 
                totalUnits: 10 * index,     
                saleAmount: 100.0 * index   
            )
            saleOffer1.save()
        }
   
    def destroy = {
    }
}
}