package com.iinterchange.sale


import grails.rest.*
import grails.converters.*
import grails.transaction.Transactional
import com.iinterchange.sale.SaleOffer

@Transactional
class SaleOfferController extends RestfulController {
    static responseFormats = ['json', 'xml']
    SaleOfferController() {
        super(SaleOffer)
    }

   
   //Logic fr totalUnits where it is equal to 30
   def only30() {
        // Query SaleOffer instances where totalUnits is equal to 30
        def saleOffersEqual30 = SaleOffer.createCriteria().list {
            eq('totalUnits', 30)
        }

        // Return the results as JSON
        respond saleOffersEqual30
    }

   //logic foe totalUnits where it is between 40 and 90 

   def between40to90() {
    // Query SaleOffer instances where totalUnits is between 40 to 90 
    def result = SaleOffer.createCriteria().list {
        between("totalUnits", 40, 90)
    }

    // Return the results as JSON
    if (result) {
        respond result
    } else {
        respond(status: 404, message: "No SaleOffer instances found between 40 and 90 totalUnits")
    }
}

           
    }

