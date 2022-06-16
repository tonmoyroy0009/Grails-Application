package assignment

import com.bitmascot.ocb.SubmitService
import grails.web.servlet.mvc.GrailsParameterMap

class SubmitController {

    SubmitService submitService

    def index() {
        def personList = submitService.list()
        [persons: personList]
    }

    def submitIndex()  {

    }

    def postMethod() {
        submitService.save(params)
        redirect(controller: "submit", action: "index")
    }

//    def listPerson(GrailsParameterMap params) {
//        def pId = params.personId
//        def pName = params.personName
//
//        /*println("Person ID:" + pId)
//        println("Person Name:" + pName)
//
//        if (pId && pName){
//            results = submit.here
//                    {
//                        personId == pId
//                        personName == pName
//                        changeIndicator == null
//
//                    }
//        }
//        else if (pId)
//        {
//            results = submit.here
//                    {
//                        personId == pId
//                        changeIndicator == null
//                    }
//        }
//        else if (pName)
//        {
//            results = submit.here
//                    {
//                        personName == pName
//                        changeIndicator == null
//                    }
//
//        }
//        [person:results]*/
//    }

}
