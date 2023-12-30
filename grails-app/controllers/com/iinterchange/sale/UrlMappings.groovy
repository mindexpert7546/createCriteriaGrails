package com.iinterchange.sale

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')

       
       //SaleOffer controller
        "/saleoffers"(resources:"SaleOffer")

        "/saleoffers/only30"(controller: "saleOffer", action: "only30", method: "GET")

        "/saleoffers/between40to90"(controller: "saleOffer", action: "between40to90", method: "GET")

    }
}
