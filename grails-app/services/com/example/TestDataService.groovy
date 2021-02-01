package com.example

import grails.gorm.services.Service
import grails.gorm.transactions.ReadOnly

//@Service(TestDomain)
//abstract class TestDataService{
//    protected abstract TestDomain find (Long id)
//
//    TestDomain findFiltered(Long id){
//        def dom = find(id)
//        if (dom.name == "Fake"){
//            return null
//        }
//        return dom
//    }
//}

@Service(TestDomain)
interface TestDataService{

    TestDomain find (Long id)
}
