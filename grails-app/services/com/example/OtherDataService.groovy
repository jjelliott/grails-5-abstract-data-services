package com.example

import grails.gorm.services.Service
import grails.gorm.transactions.ReadOnly

@Service(OtherDomain)
abstract class OtherDataService{
//    @ReadOnly()
    protected abstract OtherDomain find (Long id)

//    @ReadOnly
    OtherDomain findFiltered(Long id){
        def dom = find(id)
        if (dom.name == "Fake"){
            return null
        }
        return dom
    }
}

//@Service(OtherDomain)
//interface OtherDataService{
//    OtherDomain find(Long id)
//}
