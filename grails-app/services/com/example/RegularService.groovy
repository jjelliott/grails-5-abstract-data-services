package com.example
import grails.gorm.transactions.Transactional
import org.springframework.beans.factory.annotation.Autowired

@Transactional
class RegularService {
    
    @Autowired
    OtherDataService other
    @Autowired
    TestDataService test
    
    def method1(){
        println "method 1"
    }

    def method2(){
        println "method 2"
    }
}
